package javablock.flowchart;

import config.Global;
import config.translator;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;
import java.util.Calendar;
import javablock.gui.*;
import java.awt.Robot;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;
import java.io.File;
import javablock.*;
import javablock.flowchart.blocks.StartBlock;
import javablock.flowchart.generator.For;
import javax.imageio.ImageIO;
import org.w3c.dom.*;
import javax.xml.parsers.*;


/**
 * Class for flowchart editor; GUI component
 * 
 */
public class Flowchart extends Sheet implements ActionListener, KeyListener,
        MouseListener, MouseWheelListener, MouseMotionListener,
            ComponentListener{
    boolean moving=false;
    public boolean movingSelected=false;
    boolean selecting=false;
    public boolean loading=true;
    public List<JBlock> blocks=new ArrayList();
    public List<JBlock> selected=new ArrayList();
    public List<JBlock> groups=new ArrayList();
    JBlock mouseOver=null;
    PopUpMenus menus;
    float posX=0, posY=0;
    float scale=1;
    Color bgColor=Color.WHITE;
    public FlowchartManager action;
    String name;
    public JComponent flow;
    
    public Flowchart(FlowchartManager action)
    {
        super(action);
        I=new Interpreter(this);
        this.action=action;
        init();
        I.setSheet(this);
        I.reset();
        name="Start";
        bgColor=Color.decode(Global.colors[3]);
        newFlowchart();
        flow.addKeyListener(this);
        flow.addMouseListener(this);
        flow.addMouseMotionListener(this);
        flow.addMouseWheelListener(this);
        flow.addComponentListener(this);
        menus=new PopUpMenus(action);
        txtLay=null;
        moving=true;
        updateScrolls();
        moving=false;
        frc=Global.frc;
        
    }
    public Flowchart(FlowchartManager action, Element xml)
    {
        super(action);
        I=new Interpreter(this);
        addComponentListener(this);
        this.action=action;
        init();
        I.setSheet(this);
        I.reset();
        name="Start";
        bgColor=Color.decode(Global.colors[3]);
        parseXml(xml);
        flow.addKeyListener(this);
        flow.addMouseListener(this);
        flow.addMouseMotionListener(this);
        flow.addMouseWheelListener(this);
        menus=new PopUpMenus(action);
        txtLay=null;
        moving=true;
        updateScrolls();
        moving=false;
        frc=Global.frc;
    }

    private Image gBuffer, bgBuffer;
    VolatileImage vImg;
    JComponent flowPane;
    JScrollBar vBar;
    JScrollBar hBar;
    public EditorPane editorPane;
    private void init()
    {
        if(Global.accel)
        {
            flow = new JPanel() 
            {
                VolatileImage vImg;
                GraphicsConfiguration gc;
                int valCode;
                @Override
                public void paintComponent(Graphics g) 
                {
                    createBackBuffer();
                    do {
                        gc = this.getGraphicsConfiguration();
                        valCode = vImg.validate(gc);
                        if (valCode == VolatileImage.IMAGE_INCOMPATIBLE) {
                            createBackBuffer();
                        }
                        paintFlow((Graphics2D) vImg.getGraphics());
                        g.drawImage(vImg, 0, 0, this);
                    } while (vImg.contentsLost());
                }
                void createBackBuffer() 
                {
                    gc = flow.getGraphicsConfiguration();
                    vImg = gc.createCompatibleVolatileImage(getWidth(),
                            getHeight());
                }
            };
        }
        else{
            flow = new JComponent()
            {
                @Override
                public void paintComponent(Graphics g)
                {
                    paintFlow((Graphics2D) g);
                }
            };
        }
        if(true)
        {
            flowPane=new JPanel();
            flowPane.setLayout(new BorderLayout());
            flowPane.add(flow, BorderLayout.CENTER);
            hBar=new JScrollBar(JScrollBar.HORIZONTAL);
            vBar=new JScrollBar(JScrollBar.VERTICAL);
            hBar.addAdjustmentListener(new AdjustmentListener()
            {
                @Override
                public void adjustmentValueChanged(AdjustmentEvent e) 
                {
                    if(moving||zooming||movingSelected||selecting) return;
                    posX=-hBar.getValue()*10;
                    update();
                }
                }
            );
            vBar.addAdjustmentListener(new AdjustmentListener()
            {
                @Override
                public void adjustmentValueChanged(AdjustmentEvent e)
                {
                    if(moving||zooming||movingSelected||selecting) return;
                    posY=-vBar.getValue()*10;
                    update();
                }
            }
            );
            flowPane.add(hBar, BorderLayout.SOUTH);
            flowPane.add(vBar, BorderLayout.EAST);
        }
        editorPane = new EditorPane();
        split = new JSplitPane();
        split.setOrientation(JSplitPane.VERTICAL_SPLIT);
        Component bottom = I.embeddConsole;
        split.setBottomComponent(bottom);
        split.setTopComponent(flowPane);
        split.setResizeWeight(1.0);
        setLayout(new BorderLayout());
        add(split, BorderLayout.CENTER);
        split.setDividerLocation(2000);
        add(new javablock.flowchart.BlocksToolBar(this),
                BorderLayout.WEST);
        add(editorPane,BorderLayout.EAST);
        if(Global.animations){
            r=new Renderer(this);
            r.start();
        }
    }
    /**
     * Stops Interpreter
     */
    @Override
    public void close()
    {
        if(I.run != null)
            I.run.close();
        rendering=false;
        synchronized(renderLock){renderLock.notifyAll();}
    }
    /**
     * Deletes this flowchart
     */
    @Override
    public void delete()
    {
        I.delete();
        close();
    }
    
    @Override
    public void finalize()
    {
        try
        {
            super.finalize();
            close();
        } 
        catch (Throwable ex) 
        {
            Logger.getLogger(Flowchart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    ScriptRunner getRunner()
    {
        return I.run;
    }

    @Override
    public String getName()
    {
        return name.replaceAll(" ", "_");
    }

    
    /**
     * Resets block's IDs
     */
    @Override
    public void optimizeID()
    {
        int i=1;
        for(JBlock b: blocks)
        {
            b.setId(i);
            i++;
        }
        for(JBlock b: groups)
        {
            b.setId(i);
            i++;
        }
        this.nextBlockID=i;
    }
    /**
     * Updating groups shapes
     */
    public void groupsUpdate()
    {
        for(int i=0; i<groups.size(); i++)
        {
            BlockGroup g=(BlockGroup)groups.get(i);
            g.shape();
            if(((BlockGroup)g).l==0){g.delete(); i--;}
        }
    }
    
    void selectBlock(JBlock toSelect)
    {
        if(!selected.contains(toSelect))
            selected.add(toSelect);
    }
    
    /**
     * Reads flowchart from XML
     * @param f DOM element
     */
    @Override
    public void parseXml(Element f)
    {
        loading=true;
        blocks.clear();
        selected.clear();
        name=f.getAttribute("name");
        NodeList inputList=f.getElementsByTagName("input");
        String in="";
        for(int i=0; i<inputList.getLength(); i++)
        {
            Element l=(Element)inputList.item(i);
            in+=l.getTextContent();
            if(i!=inputList.getLength()-1)
                    in+="\n";
        }
        I.input.setText(in);

        NodeList argList=f.getElementsByTagName("preArgument");
        String arg="";
        for(int i=0; i<argList.getLength(); i++){
            Element l=(Element)argList.item(i);
            arg+=l.getTextContent();
            if(i!=inputList.getLength()-1)
                    arg+="\n";
        }
        I.arguments.setText(arg);

        Element canvas=(Element)f.getElementsByTagName("canvas").item(0);
            posX=Float.parseFloat(canvas.getAttribute("posX"));
            posY=Float.parseFloat(canvas.getAttribute("posY"));
            actZoom=Integer.parseInt(canvas.getAttribute("zoom"));
            if(canvas.hasAttribute("interval"))
                interval=I.inter=(
                    Integer.parseInt(canvas.getAttribute("interval")));
        Element blocksElement=(Element)f.getElementsByTagName("blocks").item(0);
        NodeList blockList=blocksElement.getElementsByTagName("block");
        for(int i=0; i<blockList.getLength(); i++){
            Element b=(Element)blockList.item(i);
            JBlock n= JBlock.make(b.getAttribute("type"),
                    this);
            n.loadXml(b, false);
            blocks.add(n);
        }
        for(int i=0; i<blockList.getLength(); i++){
            blocks.get(i).loadXml((Element)blockList.item(i), true);
        }
        //Load groups
        NodeList nGroupElement=f.getElementsByTagName("groups");
        if(nGroupElement.getLength()>0){
            Element groupElement=(Element)f.getElementsByTagName("groups").item(0);
            if(groupElement!=null){
                NodeList groupList=groupElement.getElementsByTagName("group");
                for(int i=0; i<groupList.getLength(); i++){
                    Element e=(Element)groupList.item(i);
                    JBlock g=JBlock.make(JBlock.Type.GROUP, this);
                    g.loadXml(e, false);
                    groups.add(g);
                }
                for(int i=0; i<groupList.getLength(); i++){
                    Element e=(Element)groupList.item(i);
                    groups.get(i).loadXml(e, true);
                }
            }
        }
        this.optimizeID();
        groupsUpdate();
        update();
        loading=false;
    }

    /**
     * Saves XML to root
     * @param root where Node should be added
     */
    @Override
    public void saveXml(Element root){
        Document doc=root.getOwnerDocument();
        Element f=doc.createElement("flowchart");
        f.setAttribute("name", name);
        {
            Element canvas=doc.createElement("canvas");
            canvas.setAttribute("posX", Float.toString(posX));
            canvas.setAttribute("posY", Float.toString(posY));
            canvas.setAttribute("zoom", Integer.toString(actZoom));
            //canvas.setAttribute("interval", I.IntervalSpiner.getValue().toString());
            canvas.setAttribute("interval", ""+I.getInterval());
            f.appendChild(canvas);
            String inputs[]=I.input.getText().split("\n");
            for(String i:inputs){
                if(i.length()==0) break;
                Element in=doc.createElement("input");
                in.appendChild(doc.createTextNode(i));
                f.appendChild(in);
            }
            String args[]=I.arguments.getText().split("\n");
            for(String i:args){
                if(i.length()==0) break;
                Element in=doc.createElement("preArgument");
                in.appendChild(doc.createTextNode(i));
                f.appendChild(in);
            }
            {
                Element list=doc.createElement("blocks");
                for(JBlock b:blocks){
                    b.saveXml(list);
                }
                f.appendChild(list);
            }
            if(groups.size()>0){
                Element list=doc.createElement("groups");
                for(JBlock b:groups){
                    b.saveXml(list);
                }
                f.appendChild(list);
            }
           
        }
        root.appendChild(f);
    }
    /**
     * Returns block with id
     * @param id block's ID
     * @return return block
     */
    public JBlock getBlockById(int id){
        for(JBlock b: blocks)
            if(id==b.ID)
                return b;
        return null;
    }
    public JBlock getGroupById(int id){
        for(JBlock b: groups)
            if(id==b.ID)
                return b;
        return null;
    }

    public JBlock blockAt(float x, float y){
        for(int i=blocks.size()-1; i>=0; i++){
            JBlock b=blocks.get(i);
        }
        return null;
    }

    /**
     * Returns arguments names
     * @return arguments names in array
     */
    public String[] getArgumentsList(){
        String f[][]=((StartBlock)blocks.get(0)).getFields();
        String args[]=new String[f.length];
        int i=0;
        for(String ff[]:f){
            args[i]=ff[0];
            i++;
        }
        if(args.length==0) return null;
        if(args[0].length()==0) return null;
        return args;
    }
    /**
     * Returns arguments types
     * @return arguments types in array
     */
    public String[] getArgumentsTypes(){
        String f[][]=((StartBlock)blocks.get(0)).getFields();
        String args[]=new String[f.length];
        int i=0;
        for(String ff[]:f){
            args[i]=ff[1];
            i++;
        }
        if(args.length==0) return null;
        if(args[0].length()==0) return null;
        return args;
    }
    /**
     * Returns full signature like pow(n,k)
     * @return signature
     */
    public String getSignature(){
        String sig=getName();
        String args[]=getArgumentsList();
        if(args!=null){
            sig+="(";
            for(int i=0; i<args.length; i++){
                sig+=args[i];
                if(i<args.length-1)
                    sig+=",";
            }
            sig+=")";
        }
        return sig;
    }
    /**
     * Returns predefinied (default) arguments values
     * @return values array
     */
    public String[] getPredefiniedArguments(){
        String s[]=getArgumentsList();
        if(s==null){
            String r[]={""};
            return r;
        }
        String args[]=new String[s.length];
        String preArgs[]=I.arguments.getText().split("[\\n]");
        for(int i=0; i<args.length; i++){
            if(i<preArgs.length)
                args[i]=preArgs[i];
            else
                args[i]="?";
        }
        return args;
    }

    public String makeJavaScript()
    {
        String code="";
        String args[]=getArgumentsList();
        int i;

        for(JBlock b:blocks)
        {
            if(b.isDefinitionBlock())
            {
                code+=b.getScriptFragmentForJavaScript();
            }
        }
        code+="\nfunction "+getName()+"(";
        if(args!=null){
            for(i=0; i<args.length; i++)
            {
                if(i>0) code+=",";
                code+="arg"+i;
            }
        }
        code+= "){\n";
        code+=((StartBlock)blocks.get(0)).generateIntro(true);
        code+="\tvar "+getName()+"_block="+blocks.get(0).nextBlock().nextExe().ID+"\n"
                + "\twhile(true)\n"
                + "\t  switch("+getName()+"_block){\n";
        for(JBlock b: blocks){
            if(b.isDefinitionBlock()) continue;
//            if(b.type==JBlock.Type.COMMENT) continue;
            if(!Global.highlightLinks)
                if(b.type==JBlock.Type.JUMP) continue;
            code+="\t\tcase "+b.getId()+":\n";
            code+=b.getScriptFragmentForJavaScript()+"\n";
        }
        code+="\t}\n}\n\n";
        //System.err.println(code);


        code+="function "+getName()+"_runFrom(__from){";
        code+="\tvar "+getName()+"_block=__from\n"
                + "\twhile(true)\n"
                + "\t switch("+getName()+"_block){\n";
        for(JBlock b: blocks){
            if(b.isDefinitionBlock()) continue;
//            if(b.type==JBlock.Type.COMMENT) continue;
            if(!Global.highlightLinks)
                if(b.type==JBlock.Type.JUMP) continue;
            code+="\t\tcase "+b.getId()+":\n";
            code+=b.getScriptFragmentForJavaScript()+"\n";
        }
        code+="\t}\n}";
        return code;
    }
    public String makePythonScript(){
        String code="";
        for(JBlock b:blocks){
            if(b.isDefinitionBlock()){
                code+=b.getScriptFragmentForPython()+"\n";
            }
        }
        code+="def "+getName()+"(";
        String args[]=getArgumentsList();
        String types[]=getArgumentsTypes();
        int i;
        if(args!=null){
            for(i=0; i<args.length; i++){
                if(i>0) code+=",";
                code+="arg"+i;
            }
        }
        code+="):\n";
        i=0;
        code+=((StartBlock)blocks.get(0)).generateIntro(false);
        code+="\t"+getName()+"_block="+blocks.get(0).nextBlock().nextExe().ID+"\n";
        code+="\twhile true:\n";
        for(JBlock b:blocks){
            if(b.isDefinitionBlock()) continue;
            if(!Global.highlightLinks)
                if(b.type==JBlock.Type.JUMP) continue;
            code+="\t\tif "+getName()+"_block=="+b.ID+": #"+b.type+"\n";
            code+=b.getScriptFragmentForPython();
        }
        code+="def "+getName()+"_runFrom(__from):\n";
        code+="\t"+getName()+"_block=__from\n"
                + "\twhile(true):\n";
        for(JBlock b:blocks){
            if(b.isDefinitionBlock()) continue;
            if(!Global.highlightLinks)
                if(b.type==JBlock.Type.JUMP) continue;
            code+="\t\tif "+getName()+"_block=="+b.ID+": #"+b.type+"\n";
            code+=b.getScriptFragmentForPython();
        }
        return code;
    }
    public String makePythonFunctions(){
        System.out.println("pythonMakeFunctions");
        String code="";
        for(JBlock b:blocks){
            if(b.isDefinitionBlock())
                code+=b.getScriptFragmentForPython();
        }
        code+="def "+getName()+"(";
        String args[]=getArgumentsList();
        int i;
        if(args!=null){
            for(i=0; i<args.length; i++){
                if(i>0) code+=",";
                code+="arg"+i;
            }
        }
        code+="):\n";
        i=0;
        code+=((StartBlock)blocks.get(0)).generateIntro(false);
        code+="\t"+getName()+"_block="+blocks.get(0).nextBlock().nextExe().ID+"\n";
        code+="\twhile true:\n";
        for(JBlock b:blocks){

            if(!Global.highlightLinks)
                if(b.type==JBlock.Type.JUMP) continue;
            if(b.isDefinitionBlock()) continue;
            code+="\t\tif "+getName()+"_block=="+b.ID+": #"+b.type+"\n";
            code+=b.getScriptFragmentForPython();
        }
        code+="\n";
        return code;
    }

    private long lastClick=0;
    /**
     * Creates new flowchart, clears current
     */
    private void newFlowchart(){
        selected.clear();
        blocks.clear();
        JBlock b=JBlock.make(JBlock.Type.START, this);
        blocks.add(b);
        b.setPos(0, -100);
        b.ID=0;
        JBlock b1=JBlock.make(JBlock.Type.RETURN, this);
        blocks.add(b1);
        b1.setPos(0, 100);
        b.connectTo(b1);
        b1.ID=1;
        nextBlockID=2;
        loading=false;
    }
    boolean ready=false;

    public int nextBlockID=2;


    private void placeBlock(){
        if(selected.isEmpty()) return ;
        boolean next=false;
        for(JBlock b:selected){
            if(b.connects.size()>0 || b.connectsIn.size()>0) continue;
            if(next) continue;
            next=false;
            for(JBlock bs:blocks){
                if(b==bs) continue;
                if(bs.connects.size()>0)
                    for(Flowline c:bs.connects){
                        if(c.intersects(b.bound2D())){
                            b.connectTo(c.n);
                            bs.connectTo(b);
                            next=true;
                            break;
                        }
                        if(next) break;
                    }
                if(next) break;
            }
        }
    }


    public void drawGrid(Graphics2D g2d){
        int x, y;
        g2d.setColor(new Color(230, 230, 230));
        g2d.translate(-0.5, -0.5);
        int yFrom=(int)((-40-posY-canvasSize.height/2))/10; yFrom/=Zooms[actZoom]; yFrom*=10;
        int yTo=(int)((40-posY+canvasSize.height/2))/10; yTo/=Zooms[actZoom]; yTo*=10;
        int xFrom=(int)((-40-posX-canvasSize.width/2))/10; xFrom/=Zooms[actZoom]; xFrom*=10;
        int xTo=(int)((40-posX+canvasSize.width/2))/10; xTo/=Zooms[actZoom]; xTo*=10;
        for(y=yFrom; y<yTo; y+=10){
            if(y%100==0)
                g2d.drawLine(xFrom, y+1, xTo, y+1);
                g2d.drawLine(xFrom, y, xTo, y);
        }
        for(x=xFrom; x<xTo; x+=10){
            if(x%100==0)
                g2d.drawLine(x+1, yFrom, x+1, yTo);
            //else
                g2d.drawLine(x, yFrom, x, yTo);
        }
        g2d.setColor(Color.GRAY);
        g2d.drawRect(0,0, 1, 1);
        g2d.translate(0.5, 0.5);
    }
    Area allBlocks=null;

    public void canvasScan(){
        allBlocks=new Area();
        for(JBlock b: blocks){
            Area n=new Area(b.bound());
            allBlocks.add(n);
        }
        for(JBlock b: groups){
            Area n=new Area(b.bound());
            allBlocks.add(n);
        }
    }

    public BufferedImage drawImageSrc(){
        canvasScan();
        Rectangle2D rect=allBlocks.getBounds2D();
        BufferedImage img=new BufferedImage((int)(((rect.getWidth()*scale()+0.5)+5*scale())),
                (int)(((rect.getHeight()*scale()+0.5))+5*scale()),
                BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2d=(Graphics2D)img.getGraphics();
        if(Global.antialiasing)
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);

        if(!Global.transparentPNG){
            g2d.setBackground(Color.WHITE);
            g2d.clearRect(-5, -5, (int)(rect.getWidth()*scale()+20)+20, (int)(rect.getHeight()*scale()+20)+20);
            if(Global.grid)
                drawGrid(g2d);
        }
        g2d.translate(2*scale(),2*scale());
        g2d.translate(-rect.getX()*scale(), -rect.getY()*scale());
        g2d.scale(scale(), scale());
        drawForImage(g2d);
        return img;
    }
    public void drawForImage(Graphics2D g2d){
        AffineTransform id=g2d.getTransform();
        for(JBlock b: groups){
            g2d.setTransform(id);
            b.draw(g2d);
        }
        for(JBlock b: blocks)
            b.update();
        for(JBlock b: blocks)
            b.drawConnections(g2d);
        for(JBlock b: blocks){
            g2d.setTransform(id);
            b.drawShadow(g2d);
        }
        for(JBlock b: blocks){
            g2d.setTransform(id);
            b.draw(g2d);
        }
        for(JBlock b: selected){
            g2d.setTransform(id);
            b.drawSelection(g2d);
        }
        g2d.setTransform(id);
    }

    @Override
    public void saveAsImage(String url, String docName){
        int z=actZoom;
        actZoom=4;
        for(JBlock b: blocks){
            b.shape();
        }
        for(JBlock b: groups){
            b.shape();
        }
        BufferedImage img=drawImageSrc();
        File f=new File(url+"/"+docName+"_"+getSignature()+".png");
        try {
            ImageIO.write(img, "png", f);
        } catch (IOException ex) {
            Logger.getLogger(Flowchart.class.getName()).log(Level.SEVERE, null, ex);
        }
        actZoom=z;
    }
    
    javax.swing.filechooser.FileFilter graphicFilters[]={
        new javax.swing.filechooser.FileFilter() 
        {
                    @Override
                    public boolean accept(File f) 
                    {
                            return f.isDirectory() || f.getName().toLowerCase().endsWith(".png");
                    }
                    @Override
                    public String getDescription() 
                    {
                            return "png";
                    }
        },
        new javax.swing.filechooser.FileFilter() 
        {
                    @Override
                    public boolean accept(File f)
                    {
                            return f.isDirectory() || f.getName().toLowerCase().endsWith(".jpg")
                                    || f.getName().toLowerCase().endsWith(".jpeg");
                    }
                    @Override
                    public String getDescription() 
                    {
                            return "jpg";
                    }
        }
    };
    
    @Override
    public void saveAsImage()
    {
        BufferedImage img=drawImageSrc();
        if(fc==null)
        {
            fc=new JFileChooser();
            if(getManager().fc!=null)
            {
                if(getManager() .fc.getSelectedFile()!=null)
                {
                    fc.setSelectedFile(new File(action.fc.getSelectedFile().getPath()));
                }
            }
            else
            {
            }
            for(javax.swing.filechooser.FileFilter filter:graphicFilters)
            {
                fc.addChoosableFileFilter(filter);
            }
        }
        int c=fc.showSaveDialog(this);
        if(c!=0) return ;
        File f=fc.getSelectedFile();
        String ext="";
        for(javax.swing.filechooser.FileFilter filter:graphicFilters)
            if(filter.accept(f))
                ext=filter.getDescription();
        if(ext.isEmpty() && fc.getFileFilter()!=null){
            ext=fc.getFileFilter().getDescription();
            fc.setSelectedFile(new File(f.getAbsolutePath()+"."+ext));
        }
        else if(ext.isEmpty()){
            ext="png";
            fc.setSelectedFile(new File(f.getAbsolutePath()+"."+ext));
        }
        if(!"png".equals(ext))
        {
            BufferedImage src=img;
            img=new BufferedImage(src.getWidth(),
                src.getHeight(),
                BufferedImage.TYPE_3BYTE_BGR);
            img.getGraphics().setColor(this.bgColor);
            img.getGraphics().fillRect(0,0,src.getWidth(),
                src.getHeight());
            img.getGraphics().drawImage(src, 0, 0, null);
        }
        f=fc.getSelectedFile();
        if(f.exists())
        {
            int ok=JOptionPane.showConfirmDialog(this,
                    translator.get("popup.overwrite"),
                    f.getAbsolutePath(), JOptionPane.YES_NO_OPTION);
            if(ok==JOptionPane.NO_OPTION)
                return;
        }
        try 
        {
            if(!ImageIO.write(img, ext,f))
                System.err.println("Error");
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Flowchart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    JFileChooser fc=null;

    ArrayList<FlowElement> animatedElements=new ArrayList<FlowElement>();
    public void draw(Graphics2D g2d)
    {
        AffineTransform id=g2d.getTransform();
        for(JBlock b: groups)
        {
            g2d.setTransform(id);
            b.draw(g2d);
        }
        for(JBlock b: blocks)
            b.update();
        for(JBlock b: blocks)
            b.drawConnections(g2d);
        for(JBlock b: blocks){
            g2d.setTransform(id);
            b.drawShadow(g2d);
            b.draw(g2d);
        }
        for(JBlock b: selected)
        {
            g2d.setTransform(id);
            b.drawSelection(g2d);
        }
        if(Global.animations){
            FlowElement b;
            for(int i=0; i<animatedElements.size(); i++){
                g2d.setTransform(id);
                b=animatedElements.get(i);
                if(!b.highLight(g2d)){
                    animatedElements.remove(i);
                    i--;
                }
            }
        }
        else if(mouseOver!=null){
            g2d.setTransform(id);
            //mouseOver.highLight(g2d);
        }
        g2d.setTransform(id);
    }

    //Rendering options
    Dimension canvasSize=new Dimension(0,0), oldDim=new Dimension(1,1);
    Dimension sceneSize=new Dimension(0,0), sceneOldDim=new Dimension(1,1);

    void updateScrolls(){
        float t=blocks.get(0).posY
             ,b=blocks.get(0).posY
             ,l=blocks.get(0).posX
             ,r=blocks.get(0).posX;
        for(JBlock bl:blocks){
            if(t>bl.posY) t=bl.posY;
            else if(b<bl.posY) b=bl.posY;
            if(l>bl.posX) l=bl.posX;
            else if(r<bl.posX) r=bl.posX;
        }
        hBar.setMinimum((int)(l)/10);
        hBar.setMaximum((int)(r)/10);
        hBar.setValue(-(int)posX/10); 
        vBar.setMinimum((int)(t)/10);
        vBar.setMaximum((int)(b)/10);
        vBar.setValue(-(int)posY/10);
    }
    static Dimension nullDim=new Dimension(1,1);
    public void paintFlow(Graphics2D g2)
    {
        canvasSize = flowPane.getSize();
        frc = g2.getFontRenderContext();
        AffineTransform af=g2.getTransform();
        ready=false;
        if(oldDim.equals(nullDim))
        {
            for(JBlock b: blocks)
                b.shape();
        }
        oldDim=canvasSize;
        if(!blockEdit)
            g2.setBackground(bgColor.darker());
        else
            g2.setBackground(bgColor);
        g2.clearRect(0, 0, canvasSize.width, canvasSize.height);
        if(Global.antialiasing)
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
        //transform
        g2.translate(Math.round(canvasSize.width / 2)-flow.getX(), Math.round(canvasSize.height / 2));
        g2.translate(Math.round(posX), Math.round(posY));
        g2.scale(scale(), scale());
        if (Global.grid)
            drawGrid(g2);
        draw(g2);
        if(selecting)
        {
            g2.setColor(new Color(100, 150, 255, 50));
            g2.fill(selectingBox);
            g2.setColor(new Color(100, 150, 255, 255));
            g2.setStroke(Global.strokeSelection);
            g2.draw(selectingBox);
            g2.setStroke(Global.strokeNormal);
        }
        g2.setTransform(af);
        ready=true;
        needDraw=false;
    }

    private Point mousePos=new Point(0,0);
    private Point mousePressed=new Point(0,0);
    public Point2D cur=new Point(0,0);
    private Rectangle2D selectingBox=new Rectangle2D.Float(0,0,0,0);
    private Point cursorInScene(Point m)
    {
        Point in=new Point(0,0);
        in.setLocation(
                (m.x-(posX+canvasSize.width/2 -flow.getX()))/scale(),
                (m.y-(posY+canvasSize.height/2))/scale()
                );
        return in;
    }
    public boolean blockEdit=true;
    @Override
    public void setEditable(boolean editing)
    {
        blockEdit=editing;
        if(blockEdit==false)
        {
            selected.clear();
            action.selectedBlock(this);
        }
        update();
    }

    public void historyAdd()
    {
        action.historyAdd();
    }

    JBlock deselect=null;
    JBlock select=null;
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if(!blockEdit) return;
        Point2D cur=cursorInScene(e.getPoint());
        if(e.getButton()==MouseEvent.BUTTON2)
            moving=true;
        if(e.getButton()==MouseEvent.BUTTON3)
        {
            JBlock at = null;
            for(int i=blocks.size()-1; i>=0; i--){
                JBlock tmp=blocks.get(i);
                if(tmp.contains(cur.getX(), cur.getY(), 8)){
                    at=tmp;
                    break;
            }}
            
           
                if(selected.contains(at) && selected.size()>1)
                    menus.selectedMenu.show(flow, e.getX(), e.getY());
                if(selected.contains(at) && selected.size()==1)
                    menus.showPopupOnBlock(flow, e.getX(), e.getY(), selected.get(0));
            
            update();
        }
    }
    boolean selectedNow=false;
    @Override
    public void mousePressed(MouseEvent e) 
    {
        flow.requestFocus();
        cur=cursorInScene(e.getPoint());
        if(e.getButton()==MouseEvent.BUTTON2||e.getButton()==MouseEvent.BUTTON3){
            if(this.selecting) return ;
            moving=true;
        }
        if(e.getButton()==MouseEvent.BUTTON1||e.getButton()==MouseEvent.BUTTON3){
            
            
            if(!blockEdit) return;
            if(this.moving) return;
            selectedNow=false;
            mousePressed=e.getPoint();
            if(moving || movingSelected) return;
            long ms=Calendar.getInstance().getTimeInMillis();
            if(ms-lastClick<=300)
            { 
                return ;
            }
            lastClick=ms;
            JBlock at = null;
            at=over;
            if(e.isControlDown() && at==null)
            for(JBlock tmp:groups){
                if(tmp.contains(cur.getX(), cur.getY())){
                    at=tmp;
                    break;
            }}
            if(at!=null)
            {
                if(e.getButton()==MouseEvent.BUTTON1)
                {
                    movingSelected=true;
                    at.setT();
                }
                if(!selected.contains(at))
                {
                    if(e.isShiftDown() && e.isControlDown() && selected.size()==1){
                        JBlock g=selected.get(0);
                        double pX=at.posX, pY=at.posY;
                        at.setPos(g.posX, g.posY);
                        g.setPos(pX, pY);
                        if(at.isSwitchable() && g.isSwitchable()){
                            int i=0;
                            JBlock atIn[]=new JBlock[at.connectsIn.size()];
                            JBlock atOut[]=new JBlock[at.connects.size()];
                            for(Flowline c:at.connectsIn)
                                atIn[i++]=c.f;
                            i=0;
                            for(Flowline c:at.connects)
                                atOut[i++]=c.n;
                            
                            JBlock sIn[]=new JBlock[g.connectsIn.size()];
                            JBlock sOut[]=new JBlock[g.connects.size()];
                            i=0;
                            for(Flowline c:g.connectsIn)
                                sIn[i++]=c.f;
                            i=0;
                            for(Flowline c:g.connects)
                                sOut[i++]=c.n;
                            while(at.connects.size()>0)
                                at.connects.get(0).delete();
                            while(at.connectsIn.size()>0)
                                at.connectsIn.get(0).delete();
                            while(g.connects.size()>0)
                                g.connects.get(0).delete();
                            while(g.connectsIn.size()>0)
                                g.connectsIn.get(0).delete();
                            for(JBlock b:atIn)
                                b.connectTo(g);
                            for(JBlock b:atOut)
                                g.connectTo(b);
                            for(JBlock b:sIn)
                                b.connectTo(at);
                            for(JBlock b:sOut)
                                at.connectTo(b);
                            selected.clear();
                            selectBlock(g);
                            
                        }
                        if(at.type==JBlock.Type.JUMP){
                            if(at.connectsIn.isEmpty() &&
                                    at.connects.isEmpty()){
                                at.delete();
                            }
                        }
                        return;
                    }
                    else if(!e.isShiftDown() && e.isControlDown() && selected.size()==1){
                        if(selected.get(0).type==JBlock.Type.GROUP){
                            JBlock g=selected.get(0);
                            g.connectTo(at);
                            selected.clear();
                            selectedNow=true;
                            selectBlock(g);
                            return ;
                        }
                        else if(at.canBeConnected(selected.get(0))){
                            selected.get(0).connectTo(at);
                            selectedNow=true;
                        }
                        selected.clear();
                        selectBlock(at);
                    }
                    else if(!e.isShiftDown())
                        selected.clear();
                    selectBlock(at);
                    selectedNow=true;
                    return ;
                }
                else
                {
                    if(!e.isShiftDown())
                        deselect=at;
                    else
                        select=at;
                    return ;
                }
            }
            else if(e.getButton()==MouseEvent.BUTTON1)
            {
                if(Global.autoJumps)
                    if(!e.isShiftDown() && e.isControlDown() && selected.size()==1){
                        JBlock f = selected.get(0);
                        JBlock j = addBlock("JUMP", false);
                        j.shape();
                        f.connectTo(j);
                        for(JBlock b:blocks){
                            if(b==j || b==f) continue;
                            for(Flowline C:b.connects){
                                if(C.intersects(j.getRound())){
                                    C.f.connectTo(j);
                                    j.connectTo(C.n);
                                    return;
                                }
                            }
                        }
                    }
                    else{
                        selectingBox=new Rectangle2D.Float((float)cur.getX(),
                                (float)cur.getY(), 0, 0);
                        selecting=true;
                    }
            }
            update();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        if(e.getButton()==MouseEvent.BUTTON2 || e.getButton()==MouseEvent.BUTTON3){
            moving=false;
        }

        else if(e.getButton()==MouseEvent.BUTTON1){
            if(!blockEdit) return;
            if(movingSelected){
                for(JBlock b:selected){
                    b.resetT();
                }
            }
            if(e.getPoint().x==mousePressed.x && e.getPoint().y==mousePressed.y)
            {
                if(!selectedNow){
                    for(JBlock g:groups){
                        if(g.contains(cur.getX(), cur.getY(), 8)){
                            selectBlock(g);
                            break;
                        }
                    }
                }
                if(deselect!=null)
                    while(selected.remove(deselect)){}
                if(select!=null){
                    if(!e.isShiftDown()){
                        selected.clear();
                        selectBlock(select);
                    }
                    else{
                        if(selected.contains(select))
                            selected.remove(select);
                        else
                            selectBlock(select);
                    }
                }
            }
            selectedNow=false;
            deselect=null;
            select=null;
            if(movingSelected)
            {
                action.historyAdd();
            }
            movingSelected=false;
            moveAbsolute=false;
            if(selecting){
                if(!e.isShiftDown())
                    selected.clear();
                for(JBlock b:blocks)
                {
                    if(selectingBox.contains(b.posX,b.posY))
                        if(!selected.contains(b))
                            selectBlock(b);
                }
            }
            selecting=false;
            deselect=null;
            select=null;
            update();
        }
        action.historyAdd();
        action.selectedBlock(this);
    }

    public boolean moveAbsolute=false;
    @Override
    public void mouseEntered(MouseEvent e) {
        if(moveAbsolute){
            mousePos=e.getPoint();
            cur=cursorInScene(e.getPoint());
            for(JBlock bl: selected){
                bl.setPos(cur.getX(), cur.getY());
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
       
    }
    static Robot mouseControll;
    Point mouseOnScreen=new Point(0,0);
    @Override
    public void mouseDragged(MouseEvent e)
    {
        
        if(e.getComponent().getName() != null){
            String [] section = e.getComponent().getName().split("/");
        
            if(section[0].contains("add")){

                addBlock(section[1]);
                return;
            }
        }
        
        if(moving)
        
        {
           
            posX += e.getX() - mousePos.x;
            posY += e.getY() - mousePos.y;
            mouseMoved(e);
            update();
        }
        else if(selecting)
        {
            Point s=this.cursorInScene(e.getPoint());
            Point mP=cursorInScene(mousePressed);
            selectingBox.setFrameFromCenter((s.getX()+mP.getX())/2,
                    (s.getY()+mP.getY())/2,
                    s.getX(), s.getY());
            update();
        }
        updateScrolls();
        mouseMoved(e);
    }
    JBlock over=null;
    int leftPaneWidth=0;
    boolean leftPaneVisible=false;
    @Override
    public void mouseMoved(MouseEvent e)
    {
        int xTranslate=0;
        if(editorPane.isVisible()!=leftPaneVisible)
        {
            leftPaneVisible=editorPane.isVisible();
            if(leftPaneVisible)
                xTranslate=editorPane.getWidth();
            else
                xTranslate=-editorPane.getWidth();
        }
        if(movingSelected)
        {
            float diffX=(float)((e.getX()-mousePos.getX())/scale());// + xTranslate/scale());
            float diffY=(float)((e.getY()-mousePos.getY())/scale());
            if(Global.snapToGrid || e.isControlDown())
                for(JBlock b:selected)
                {
                    b.translateT(diffX, diffY);
                }
            else
                for(JBlock b:selected)
                {
                    b.translate(diffX, diffY);
                }
            update();
            updateScrolls();
        }  
        cur.setLocation(cursorInScene(e.getPoint()));
        over=null;
        for(JBlock tmp:blocks){
            if(tmp.contains(cur.getX(), cur.getY(), 5))
            {
                over=tmp;
                break;
            }
        }
        if((over!=mouseOver))
        {
            if(mouseOver!=null)
                mouseOver.setHighligted(false);
            mouseOver=over;
            if(mouseOver!=null){
                mouseOver.setHighligted(true);
                if(Global.animations){
                    if(animatedElements.contains(mouseOver))
                        animatedElements.remove(mouseOver);
                    animatedElements.add(mouseOver);
                }
            }
            update();
        }
        mousePos=e.getPoint();
        mouseOnScreen=e.getLocationOnScreen();
        update();
    }

    public void cancelMoving()
    {
        movingSelected=false;
        moveAbsolute=false;
    }


    boolean needDraw=false;
    boolean rendering=true;
    @Override
    public void update(){
        if(Global.animations){
            rendering=true;
            synchronized(renderLock){
            renderLock.notifyAll();}
        }
        else
            flow.repaint();
    }

    public void setBgColor(Color c){
        bgColor=c;
        update();
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
        
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        if(e.isControlDown())
        {
            int w=e.getKeyCode();
            if(w>=KeyEvent.VK_1 && w<=KeyEvent.VK_6)
                addBlock(JBlock.StandardTypes[w-KeyEvent.VK_1].toString());
        }
        if(e.isShiftDown())
        {
            int w=e.getKeyCode();
            if(w>=KeyEvent.VK_1 && w<=KeyEvent.VK_6)
                addBlock(JBlock.HelpingTypes[w-KeyEvent.VK_1].toString());
        }
        
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_DELETE: deleteSelectedBlocks(); break;
            case KeyEvent.VK_R:
                    if(selected.size()==1)
                        if(selected.get(0).type==JBlock.Type.DECISION){
                            selected.get(0).reverseValues();
                            flow.repaint();
                        }
                    break;
            case KeyEvent.VK_G:
                    if(selected.size()>=1)
                        movingSelected=!movingSelected;
                    else
                    {
                            moving=!moving;
                            
                    }
                    break;
            case 107://PLUS
                    zoomIn();
                    break;
            case 109://MINUS
                    zoomOut();
                    break;
            case KeyEvent.VK_PAGE_UP:
                    moveUp();
                    break;
            case KeyEvent.VK_PAGE_DOWN:
                    moveDown();
                    break;
            case KeyEvent.VK_HOME:
                align("ver");
                break;
            case KeyEvent.VK_END:
                align("hor");
                break;
            case KeyEvent.VK_P:
                placeBlock();
                update();
                break;
            case KeyEvent.VK_UP:
                posY+=50*scale();update();updateScrolls();
                break;
            case KeyEvent.VK_DOWN:
                posY-=50*scale();update();updateScrolls();
                break;
            case KeyEvent.VK_LEFT:
                posX+=50*scale();update();updateScrolls();
                break;
            case KeyEvent.VK_RIGHT:
                posX-=50*scale();update();updateScrolls();
                break;
            case KeyEvent.VK_NUMPAD0:
                    posX=posY=0;
                    update();
                    break;
        }
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
    }

    boolean zooming=false;
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) 
    {
        if(this.selecting) return ;
        cur=cursorInScene(e.getPoint());
        if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL){
            if(e.getWheelRotation()>0){
               
                zoomOut(cur);
            }
            else if(e.getWheelRotation()<0){
                
                zoomIn(cur);
            }
        }
        
    }
    
    public void slideZoomIn(int value){
        //System.out.println("slide zoom in " + value);
        //zoomIn(value);
    }
    
    public void slideZoomOut(int value){
        //System.out.println("slide zoom out " + value);
        //zoomOut(value);
    }
    
    public void zoomOut(Point2D... t)
    {
        //System.out.println("Zooming out!!" + t[0].getX() + ","+ t[0].getY());
        if(actZoom==Zooms.length-1) return ;
        zooming=true;
        posX/=Zooms[actZoom];
        posY/=Zooms[actZoom];
        actZoom++;
        if(actZoom>=Zooms.length) actZoom=Zooms.length-1;
        this.scale=(float)Zooms[actZoom];
        if(t.length==1){
            double tx=t[0].getX(),
                   ty=t[0].getY();
            posX+=((tx+posX))/(Zooms[actZoom]/Zooms[actZoom-1])/2;
            posY+=((ty+posY))/(Zooms[actZoom]/Zooms[actZoom-1])/2;
        }
        posX*=Zooms[actZoom];
        posY*=Zooms[actZoom];
        update();
        zooming=false;
    }
    public void zoomIn(Point2D... t)
    {
        //System.out.println("Zooming in!!" + t[0].getX() + ","+ t[0].getY());
        if(actZoom==0) return;
        zooming=true;
        posX/=Zooms[actZoom];
        posY/=Zooms[actZoom];
        actZoom--;
        if(actZoom<0) actZoom=0;
        else if(actZoom>=Zooms.length) actZoom=Zooms.length-1;
        this.scale=(float)Zooms[actZoom];
        if(t.length==1){
            double tx=t[0].getX(),
                   ty=t[0].getY();
            posX-=((tx+posX))/(Zooms[actZoom]/Zooms[actZoom+1])/2;
            posY-=((ty+posY))/(Zooms[actZoom]/Zooms[actZoom+1])/2;
        }
        posX*=Zooms[actZoom];
        posY*=Zooms[actZoom];
        update();
        zooming=false;
    }
           
    public FontRenderContext frc;
    public TextLayout txtLay;
    double Zooms[]={4, 3, 2, 1.5, 1, 0.75, 0.5, 0.25};
    int actZoom=4;
    public double scale()
    {
        return Zooms[actZoom];
    }

    @Override
    public void componentResized(ComponentEvent e)
    {
    }

    @Override
    public void componentMoved(ComponentEvent e) 
    {
    }
    Renderer r;
    @Override
    public void componentShown(ComponentEvent e)
    {
        action.setActiveSheet(this);
        action.setInterpreter(I);
        I.resetButtons();
    }
    
    @Override
    public void componentHidden(ComponentEvent e)
    {
        I.getInterval();
    }

    @Override
    public String toString()
    {
        return name;
    }
    public JBlock addBlock(String type){return addBlock(type, false);}
    public JBlock addBlock(String type, boolean connect)
    {
        JBlock b = null;
        JBlock s=null;
        System.out.println("selected size is " + selected.size());
        if(selected.size()==1)
            s=selected.get(0);
        if(type.equals("SAME"))
        {
            b=Global.getManager().addNewBySelected();
            selected.clear();
            selectBlock(b);
            action.selectedBlock(this);
            return b;
        }
        b=JBlock.make(type, true, this);
        if(b!=null)
        {
            addBlock(b);
            if(s!=null && connect)
                if(b.canBeConnected(s))
                {
                    JBlock before=null;
                    if(s.connects.size()==1)
                        before=s.connects.get(0).n;
                    s.connectTo(b);
                    if(before!=null)
                        b.connectTo(before);
                }
        }
        update();
        return b;
    }
    public JBlock addNonCodeBlock(String type)
    {
        
        JBlock b = null;
        b=JBlock.make(JBlock.getTypeFromString(type),false, this);
        if(b!=null){
            addBlock(b);
        }
        update();
        return b;
    }
    
     
    public void addBlocksGroup(JBlock[] list)
    {
        selected.clear();
        for(JBlock n: list){
            System.out.println("t: "+n.type);
            if(n==null) continue;
            blocks.add(n);
            n.shape();
            selectBlock(n);
            if(!n.moveWhenAdded())
                n.translate((float)cur.getX(), (float)cur.getY());
            else
            {
                n.translate((float)cur.getX(), (float)cur.getY());
                movingSelected=true;
            }
            n.ID=nextBlockID;
            nextBlockID++;
            if(n.type==JBlock.Type.GROUP)
                ((BlockGroup)n).group();
        }
        action.historyAdd();
    }
    public void addBlock(JBlock n){addBlock(n,true);}
    public void addBlock(JBlock n, boolean connect)
    {
        blocks.add(n);
        if(n.type==JBlock.Type.GROUP)
            ((BlockGroup)n).group();
        selected.clear();
        action.selectedBlock(this);
        n.addedToScene();
        selectBlock(n);
        if(!n.moveWhenAdded())
            n.setPos(cur.getX(), cur.getY());
        else
        {
            n.setPos(-posX, -posY);
            n.setPos(cur.getX(), cur.getY());
            moveAbsolute=true;
            movingSelected=true;
        }
        n.ID=nextBlockID;
        nextBlockID++;
        action.historyAdd();
    }
    
    public void align(String t)
    {
        double p=0;
        if(t.equals("hor")){
            for(int i=0; i<selected.size(); i++)
                p+=selected.get(i).posX;
            p/=selected.size();
            for(int i=0; i<selected.size(); i++)
                selected.get(i).setPos(p, selected.get(i).posY);
        }
        else if(t.equals("ver")){
            for(int i=0; i<selected.size(); i++)
                p+=selected.get(i).posY;
            p/=selected.size();
            for(int i=0; i<selected.size(); i++)
                selected.get(i).setPos(selected.get(i).posX, p);
        }
        else if(t.equals("grid")){
            for(int i=0; i<selected.size(); i++){
                JBlock b=selected.get(i);
                int posX=((int)b.posX)/10;
                int posY=((int)b.posY)/10;
                b.setPos(posX*10, posY*10);
            }
        }
        action.historyAdd();
        update();
    }
    
    public void deleteSelectedBlocks(){
        getManager().historyArchive=false;
        for(int i=0; i<selected.size(); i++){
            if(selected.get(i).type==JBlock.Type.START)
                continue;
            selected.get(i).delete();
        }
        selected.clear();
        update();
        action.selectedBlock(this);
        groupsUpdate();
        action.historyArchive=true;
        action.historyAdd();
        System.gc();
    }
    
    public void setColor(Color col, int mode)
    {
        if(selected.isEmpty())
        {
            setBgColor(col);
            return ;
        }
        if(mode==0)
            for(int i=0; i<selected.size(); i++)
                selected.get(i).setColor(col);
        else if(mode == 1)
            for(int i=0; i<selected.size(); i++)
                selected.get(i).setBorderColor(col);
        else if(mode == 2)
            for(int i=0; i<selected.size(); i++)
                selected.get(i).setTextColor(col);
        update();
    }
    
    public void deleteConnections(String w)
    {
        if(w.equals("deleteIn") || w.equals("deleteAll"))
        {
            for(JBlock b:selected)
            {
                b.removeInConnects();
            }
        }
        if(w.equals("deleteOut") || w.equals("deleteAll"))
        {
            for(JBlock b:selected)
            {
                b.removeOutConnects();
            }
        }
        update();
    }
    
    public void moveUp()
    {
        for(JBlock b: selected)
        {
            if(b.type==JBlock.Type.START) continue;
            if(blocks.contains(b))
            {
                int i=blocks.indexOf(b);
                if(i>=blocks.size()-1) continue;
                System.out.println(i);
                JBlock tmp=blocks.get(i+1);
                blocks.set(i+1, b);
                blocks.set(i, tmp);
            }
            if(groups.contains(b))
            {
                int i=groups.indexOf(b);
                if(i>=groups.size()-1) continue;
                System.out.println(i);
                JBlock tmp=groups.get(i+1);
                groups.set(i+1, b);
                groups.set(i, tmp);
            }
        }
        optimizeID();
        historyAdd();
        update();
    }
    public void moveDown()
    {
        for(JBlock b: selected)
        {
            if(blocks.contains(b))
            {
                int i=blocks.indexOf(b);
                if(i<=1) continue;
                JBlock tmp=blocks.get(i-1);
                blocks.set(i-1, b);
                blocks.set(i, tmp);
            }
            if(groups.contains(b))
            {
                int i=groups.indexOf(b);
                if(i<=0) continue;
                JBlock tmp=groups.get(i-1);
                groups.set(i-1, b);
                groups.set(i, tmp);
            }
        }
        optimizeID();
        update();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {

        String[] action=e.getActionCommand().split("/");
        if(action[0].equals("add")){
                    System.out.println("Adding " + action[1]);
            addBlock(action[1]);
        }
        else if(action[0].equals("foraction"))
            addBlocksGroup(new For().get(this));
        else if(action[0].equals("align"))
            align(action[1]);
        else if(action[0].equals("history"))
        {
            if(action[1].equals("undo"))
                this.action.historyUndo();
            else if(action[1].equals("redo"))
                this.action.historyRedo();
        }
        else if(action[0].equals("delete"))
            deleteSelectedBlocks();
    }

    @Override
    public void setName(String name) 
    {
        this.name=name;
    }

    @Override
    public List<JBlock> getSelected()
    {
        return selected;
    }

    @Override
    public List<JBlock> getBlocks() 
    {
        return blocks;
    }

    @Override
    public void copy()
    {
        try 
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = factory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element root = doc.createElement("copy");
            doc.appendChild(root);
            optimizeID();
            for (JBlock b : getSelected()) 
            {
                if(b.type==JBlock.Type.START) continue;
                Element bl=null;
                {
                    b.ID=-b.ID;
                    for(Flowline con:b.connects)
                    {
                        if(getSelected().contains(con.n))
                            con.n.ID=-con.n.ID;
                    }
                    if(b.linkTo!=null)
                        b.linkTo.ID=-b.linkTo.ID;
                }
                bl=b.makeXml(root, true, -1);
                {
                    if(b.linkTo!=null)
                        b.linkTo.ID=-b.linkTo.ID;
                    for(Flowline con:b.connects)
                    {
                        if(getSelected().contains(con.n))
                            con.n.ID=-con.n.ID;
                    }
                    b.ID=-b.ID;
                }
                root.appendChild(bl);
            }
            for (JBlock b : getSelected()) {
                b.makeXml(root, true);
            }
            if(getSelected().size()>0)
                this.manager.clipBoard=root;
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(FlowchartManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cut()
    {
        copy();
        for(JBlock b: getSelected())
        {
            b.delete();
        }
        getSelected().clear();
    }

    @Override
    public void paste() 
    {
        if(manager.clipBoard==null) return ;
        manager.keepHistory=false;
        getSelected().clear();
        NodeList blockList=manager.clipBoard.getElementsByTagName("block");
        int l=getBlocks().size();
        for(int i=0; i<blockList.getLength(); i++){
            Element b=(Element)blockList.item(i);
            JBlock n= JBlock.make(b.getAttribute("type"),
                    (Flowchart)this);
            n.loadXml(b, false);
            blocks.add(n);
            selectBlock(n);
            movingSelected=true;
        }
        for(int i=0; i<blockList.getLength(); i++)
        {
            blocks.get(l++).loadXml((Element)blockList.item(i), true);
        }
        optimizeID();
        manager.keepHistory=true;
        manager.selectedBlock(this);
    }

    @Override
    public String makeJavaScriptFunctions() 
    {
        String code = "";
        String[] args = getArgumentsList();

        for (JBlock b : this.blocks) {
            if (b.isDefinitionBlock()) {
                code = code + b.getScriptFragmentForJavaScript();
            }
        }

        code = code + "\nfunction " + getName() + "(";
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                if (i > 0) {
                    code = code + ",";
                }
                code = code + "arg" + i;
            }
        }
        code = code + "){\n";
        code = code + ((StartBlock) this.blocks.get(0)).generateIntro(true);
        code = code + "\tvar " + getName() + "_block=" + ((JBlock) this.blocks.get(0)).nextBlock().nextExe().ID + "\n" + "\twhile(true)\n" + "\t  switch(" + getName() + "_block){\n";

        for (JBlock b : this.blocks) {
            if ((!b.isDefinitionBlock())&& ((Global.highlightLinks)
                    || (b.type != JBlock.Type.JUMP))) {
                code = code + "\t\tcase " + b.getId() + ":\n";
                code = code + b.getScriptFragmentForJavaScript() + "\n";
            }
        }
        code = code + "\t}\n}\n\n";

        code = code + "function " + getName() + "_runFrom(__from){";
        code = code + "\tvar " + getName() + "_block=__from\n" + "\twhile(true)\n" + "\t switch(" + getName() + "_block){\n";

        for (JBlock b : this.blocks) {
            if ((!b.isDefinitionBlock()) && ((Global.highlightLinks)
                    || (b.type != JBlock.Type.JUMP))) {
                code = code + "\t\tcase " + b.getId() + ":\n";
                code = code + b.getScriptFragmentForJavaScript() + "\n";
            }
        }
        code = code + "\t}\n}";
        return code;
    }
    
    long genId(){
        long id = System.currentTimeMillis()+(long)(Math.random()*10000);
        boolean unique=true;
        do{
            unique=true;
            for(JBlock b:getBlocks()){
                if(id==b.getId()){
                    unique=false;
                    break;
                }
            }
            for(JBlock b:groups){
                if(id==b.getId()){
                    unique=false;
                    break;
                }
            }
        }while(!unique);
        return id;
    }

    public final class EditorPane extends JPanel
    {
        JButton addNew;
        public EditorPane()
        {
            setLayout(new BorderLayout());
            this.setMinimumSize(new Dimension(200,200));
            addNew=new JButton(Global.translate.get("blockEditor.addNew"));
            addNew.setActionCommand("add/SAME");
            add(addNew, BorderLayout.SOUTH);
            addNew.addActionListener(Global.getManager());
        }
        JBlock old=null;
        public void setEditing(JBlock e)
        {
            if(e==old) {
                return;
            }
        }
        public void setType(JBlock.Type t){
            if(t==JBlock.Type.START)
                addNew.setVisible(false);
            else
                addNew.setVisible(true);
        }
    }
    final Object renderLock=new Object();
    class Renderer extends Thread {
        Flowchart flow;
        public Renderer(Flowchart flow) {
            this.flow = flow;
            this.setName("Flowchart renderer");
        }
        Runnable timer=new Runnable()
        {
            @Override
            public void run()
            {
                flow.flow.repaint();
            }
        };
        
        @Override
        public void run()
        {
            synchronized (renderLock)
            {
                try 
                { 
                    while(rendering)
                    { 
                        SwingUtilities.invokeLater(timer); 
                        if(animatedElements.size()>0) 
                            renderLock.wait(35); 
                        else 
                            renderLock.wait(); 
                    }
                } catch (InterruptedException ex)
                {
                    
                    Logger.getLogger(Renderer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    };

}


