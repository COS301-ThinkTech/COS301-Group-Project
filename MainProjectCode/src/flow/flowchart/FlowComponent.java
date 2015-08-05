package flow.flowchart;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author GreaterThanSolomon
 */
public abstract class FlowComponent extends JPanel implements FlowElement{
    // complete, required by editors
 //   public boolean deleted  = false;
    
    protected String componentCode; 
    private int componentID;
    public Shape shape=new Rectangle(0,0,0,0);
    public float posX=0, posY=0;
    protected Rectangle2D bound=new Rectangle2D.Double();

    public void drawProcess(Graphics2D image, int x, int y) {
        
    }

    @Override
    public boolean isEditable() {
        return true;
    }

    @Override
    public void delete() {
    }

    @Override
    public boolean contains(double x, double y) {
        return true;
    }

    @Override
    public boolean intersects(Shape s) {
        return true;
    }

    @Override
    public void draw(Graphics2D g2d) {
    }

    @Override
    public void draw(Graphics2D g2d, boolean drawFull) {
    }

    @Override
    public void drawSelection(Graphics2D g2d) {
    }

    @Override
    public boolean highLight(Graphics2D g2d) {
        return true;
    }

    @Override
    public void drawShadow(Graphics2D g2d) {
    }
    
    public static enum Type{INPUT,OUTPUT,PROCESS
                            ,DECISION,COMMENT,JUMP
                            ,FLOWLINE,END,START,RETURN,MODULE,GROUP};
    
    private Type componentType; 
    
    public FlowComponent(){
        componentID = 0;
        shape = new Rectangle.Double(0,0,0,0);
    }
    
    protected void drawText(Graphics2D g, String code){
        g.drawString(code, 50, 200);
    }
    
    public void setComponentID(int componentID){
        this.componentID = componentID;
    }
    
    public int getComonentID(){
        return componentID;
    }
    
    public void paint(Graphics g){
        System.out.println("flowComponent.");
    }
    
    @Override
    public void shape(){
        prepareText();
        afterShape();
        //prerender=null;
        //prerendered=false;
    }
    
    public void prepareText(){
        
    }
    
    public void afterShape(){
        
    }
    
        @Override
    public Rectangle2D bound2D(){
        Rectangle2D rect=shape.getBounds2D();
        rect.setFrame(rect.getX() + posX,
                rect.getY() + posY,
                rect.getWidth(),
                rect.getHeight());
        //rect.translate( (posX-bound.getWidth()/2+0.5),
        //        (posY-bound.getHeight()/2+0.5));
        return rect;
    }
    @Override
    public Rectangle bound(){
        Rectangle rect=shape.getBounds();
        //rect.translate( (int)(posX-bound.getWidth()/2+0.5),
        //        (int)(posY-bound.getHeight()/2+0.5));
        rect.translate((int)posX, (int)posY);
        return rect;
    }
}
