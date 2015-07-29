package flow.flowchart;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author GreaterThanSolomon
 */
public abstract class Component extends JPanel{
    // complete, required by editors
 //   public boolean deleted  = false;
    
    protected String componentCode;  
    
    public Component(){
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
    
    protected void drawText(Graphics2D g, String code){
        g.drawString(code, 50, 200);
    }
}
