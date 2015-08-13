package widgets;
import config.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javablock.Sheet;
import javax.swing.*;

public class colors extends JPanel implements MouseListener, MouseMotionListener{
    String colors[]={ "0xffff00","0xff00ff","0x00ffff",
                    "0xff8888","0x88ff88","0x8888ff",
                    "0xfdfdfd","0xcccccc","0x888888",
                    "0x444444", "0x000000", "0x000000"
    };
    String defaultColors[]={ "0xffff00","0xff00ff","0x00ffff",
                    "0xff8888","0x88ff88","0x8888ff",
                    "0xfdfdfd","0xcccccc","0x888888",
                    "0x444444", "0x000000", "0x000000"
    };

    String col;
    Sheet m;
    public colors(Sheet m){
        this.m=m;
        this.setMinimumSize(new Dimension(50, 50));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        col=Global.colorPalette;
        colors=Global.colorPalette.split("\n");
        setLayout(new BorderLayout());
        Resizer res=new Resizer(this);
        res.setMin(20);
        res.setOrientation(Resizer.VERTICAL);
        res.setMinimalistic(true);
        add(res, BorderLayout.SOUTH);
    }

    int wRes=3;
    int hRes=3;
    BufferedImage buf;
    Dimension oldDim=new Dimension(1000,1000);
    Dimension d;
    Color last=Color.YELLOW;
    static Color latest[]={Color.YELLOW,Color.YELLOW,Color.YELLOW};
    Graphics g2;
    int w, h, ww;
    boolean rotated=false;
    
    @Override
    public void paintComponent(Graphics g){
        Color c;
        d = getSize();
        Graphics2D G=(Graphics2D)g;
        AffineTransform af=G.getTransform();
        if(d.width<d.height){
            d.setSize(d.height, d.width);
            rotated=true;
            G.translate(d.height, 0);
            G.rotate(Math.PI/2);
        }
        if(!d.equals(oldDim) || !col.equals(Global.colorPalette)){
            Color tab[]=new Color[colors.length];
            boolean error=false;
            for(int i=0; i<colors.length; i++){
                try {
                    tab[i]=Color.decode(colors[i]);
                }
                catch(NumberFormatException e){
                    error=true;
                    break;
                }
            }
            if(error){
                for(int i=0; i<colors.length; i++){
                    tab[i]=Color.decode(defaultColors[i]);
                    if(tab[i]==null){
                        error=true;
                        break;
                    }
                }
            }
            colors=Global.colorPalette.split("\n");
            oldDim=d;
            buf=new BufferedImage(d.width, d.height, BufferedImage.TYPE_3BYTE_BGR);

            g2=buf.getGraphics();
            w=d.width-10;
            h=d.height-10;
            for(int x=0; x<w; x+=Global.colorResolutionX){
                for(int y=0; y<h; y+=Global.colorResolutionY){
                    if(y<h/2)
                        g2.setColor(
                                Color.getHSBColor(((float)(x+Global.colorResolutionX/2)/w),
                                ((float)(y+Global.colorResolutionY/2)/(h/2)), 1f));
                    else
                        g2.setColor(
                                Color.getHSBColor(((float)(x+Global.colorResolutionX/2)/w),
                                1, (float)Math.sqrt(1-((float)((y+Global.colorResolutionY/2)-h/2)/(h/2))))
                                );
                    g2.fillRect(x, y, Global.colorResolutionX, Global.colorResolutionY);
                }
            }
            for(int y=0; y<h; y++){
                g2.setColor(Color.getHSBColor(0, 0, 1-(float)y/h));
                g2.drawRect(w, y, 10, 0);
            }
            ww=d.width/(colors.length+1);
            for(int i=0; i<colors.length; i++){
                g2.setColor(tab[i]);
                if(i==colors.length-1)
                    g2.fillRect(i*ww, h, ww*2, 10);
                g2.fillRect(i*ww, h, ww, 10);
            }
        }
        drawLast();
        G.drawImage(buf, 0, 0, this);
        G.setTransform(af);
        this.paintComponents(G);
    }

    private void drawLast(){
        int i=colors.length-1;
        //if(g2==null) return ;
        for(int j=0; j<3; j++){
            g2.setColor(latest[j]);
            g2.fillRect(i*ww+j*(int)(ww/1.5f)-1, h, ww, 20);
        }            
    }

    boolean clicked=false;
    int tmp;
    int getCol(int x, int y){
        if(rotated){
            tmp=x;
            x=y;
            y=d.height-tmp;
            //System.out.println(x+";"+y);
        }
        if(x<d.width && y<d.height && x>=0 && y>=0)
            return buf.getRGB(x, y);
        return -1;
    }
    int type=0;
    void set(MouseEvent me){
        int c=getCol(me.getX(), me.getY());
        if(c!=-1){
            if(m!=null){
                m.setColor(new Color(c), type);
            }
        }
        last=new Color(c);
        drawLast();
        repaint();
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getButton()==MouseEvent.BUTTON3){
          
            Color color=last;
            color =
                  JColorChooser.showDialog( this,
                     "Choose a color", color );
            if(color==null){
                return;
            }
            last=color;
            if(m!=null){
                if(e.isControlDown()) type=1;
                if(e.isShiftDown()) type=2;
                m.setColor(color, 1);
            }
            drawLast();
            repaint();
        }
        else{
            set(e);
        }
    }

    @Override
    public void mousePressed(MouseEvent me) 
    {
        clicked=true;
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
        if(me.getButton()==MouseEvent.BUTTON1)
        {
            type=0;
            if(me.isControlDown()) type=1;
            if(me.isShiftDown()) type=2;
            set(me);
        }
        if(!last.equals(latest[2])){
            latest[0]=latest[1];
            latest[1]=latest[2];
            latest[2]=last;
        }
        clicked=false;
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
        clicked=false;
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        if(clicked){
            type=0;
            if(me.isControlDown()) type=1;
            if(me.isShiftDown()) type=2;
            set(me);
        }
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        if(clicked){
            type=0;
            if(me.isControlDown()) type=1;
            if(me.isShiftDown()) type=2;
            set(me);
        }
    }

}
