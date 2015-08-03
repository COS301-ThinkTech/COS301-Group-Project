package flow.flowchart;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.swing.JPanel;

/**
 *
 * @author GreaterThanSolomon
 */
public abstract class FlowComponent extends JPanel{
    // complete, required by editors
 //   public boolean deleted  = false;
    
    protected String componentCode; 
    private int componentID;
    public Shape shape;

    public void drawProcess(Graphics2D image, int x, int y) {
        
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
    
    @Override
    public void paint(Graphics g){
        System.out.println("flowComponent.");
    }
}
