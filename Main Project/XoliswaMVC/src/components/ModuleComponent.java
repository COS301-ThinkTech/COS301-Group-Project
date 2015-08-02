package components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import javax.swing.Icon;

/**
 *
 * @author tshepiso
 */
public class ModuleComponent extends FlowchartComponent implements Icon{
    
    
    private GeneralPath modulePolygon;
    
    public ModuleComponent(){
        /*addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me) {
                System.out.println("Pressing! X:" + me.getX() + ", Y:" + me.getY());
                repaint();
            }
        });
        
        addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent me) {
                System.out.println("Dragging! X:" + me.getX() + ", Y:" + me.getY());
                AffineTransform dragged = new AffineTransform();
                dragged.translate(me.getX(), me.getY());
                //System.out.println(dragged.);
                modulePolygon.transform(dragged);
                repaint();
            }
        });*/
        
        
    }
    
    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {
        Graphics2D gObject = (Graphics2D)g;
        
        int xPoints[] = {5,26,26,5,5};
        int yPoints[] = {8,8,23,23,8};
        
        modulePolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        modulePolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            modulePolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        
        modulePolygon.moveTo(5, 12);
        modulePolygon.lineTo(26, 12);
        
        modulePolygon.closePath();
                
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(modulePolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(modulePolygon);
        
        AffineTransform dragging = new AffineTransform();
        dragging.translate(100, 130);
        modulePolygon.transform(dragging);
        gObject.transform(dragging);
        
    }

    
    
    @Override
    public int getIconWidth() {
       return 20;
    }

    @Override
    public int getIconHeight() {
       return 20; 
    }
    
    //@Override
    public void paint(Graphics2D gObject){
        //Graphics2D gObject = (Graphics2D)g;
        
        int xPoints[] = {5,200,200,5,5};
        int yPoints[] = {8,8,100,100,8};
        
        modulePolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        modulePolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            modulePolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        modulePolygon.moveTo(5, 20);
        modulePolygon.lineTo(200, 20);
        
        modulePolygon.closePath();
                
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(modulePolygon);
        gObject.setPaint(Color.BLACK);
        /*AffineTransform moving = new AffineTransform();
        moving.translate(190, 200);
        modulePolygon.transform(moving);*/
        gObject.draw(modulePolygon);
        
    }
    
    public void redraw(Graphics2D gObject, int x, int y){
                //Graphics2D gObject = (Graphics2D)g;
        
        int xPoints[] = {5+x,200+x,200+x,5+x,5+x};
        int yPoints[] = {8+y,8+y,100+y,100+y,8+y};
        
        modulePolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        modulePolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            modulePolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        modulePolygon.moveTo(5+x, 20+y);
        modulePolygon.lineTo(200+x, 20+y);
        
        modulePolygon.closePath();
                
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(modulePolygon);
        gObject.setPaint(Color.BLACK);
        /*AffineTransform moving = new AffineTransform();
        moving.translate(190, 200);
        modulePolygon.transform(moving);*/
        gObject.draw(modulePolygon);
        gObject.drawString("functionA()", x, y);
    }
    
    public void drawModule(Graphics2D g,int x, int y){
        redraw(g,x,y);
    }
    
    public void moveModuleComponent(Graphics2D g, int x, int y){
        
    }
    
    public void clear(Graphics2D g, int x, int y){
       
    }
    
}
