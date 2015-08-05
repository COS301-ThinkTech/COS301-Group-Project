/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow.flowchart;

import java.awt.Font;
import java.awt.List;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author tshepiso
 */
public class CanvasEvents extends JPanel{
    
    private final Font FONT = new Font("Arial", Font.PLAIN, 12);
    private ArrayList<FlowComponent> components;
    private FlowComponent currentPolygon = null;
    //private int x,y;
     MovingAdapter ma = new MovingAdapter();

    public CanvasEvents() {
        this.components = new ArrayList<FlowComponent>();
        addMouseMotionListener(ma);
        addMouseListener(ma);
        //addMouseWheelListener(new ScaleHandler())
    }

    
    /*private MouseAdapter mouseListener = new MouseAdapter(){
        private FlowComponent dragged = null;
        private Point lastLocation = null;
        
        @Override
        public void mousePressed(java.awt.event.MouseEvent me){

            System.out.println(components.size() + " is the size.");
            for(FlowComponent comp : components){
                System.out.println("Press event: (" +me.getX()+","+me.getY()+") - " + comp.getBounds().contains(me.getX(), me.getY()));
                System.out.println("Component Point: (" +comp.getBounds().getX()+","+comp.getBounds().getY());

                if(comp.getBounds().contains(me.getX(), me.getY())){
                    System.out.println("true");
                    dragged = comp;
                    lastLocation = me.getPoint();
                    break;
                }
            }
        }
        
        @Override
        public void mouseDragged(java.awt.event.MouseEvent me){
            System.out.println("Drag event: (" +me.getX()+","+me.getY()+")" );
            if(dragged != null){
                System.out.println("True");
                //dragged.
                int dx = me.getX() - x;
                int dy = me.getY() - y;
                
                if (dragged.getBounds().contains(x, y)) {
                    //System.out.println(myRect.getBounds());
                  dragged.getBounds().x += dx;
                    //System.out.println(myRect.getBounds());
                  dragged.getBounds().y += dy;
                  repaint();
                }
                x += dx;
                y += dy;
            }
        }
        
        @Override
        public void mouseReleased(java.awt.event.MouseEvent me){
            dragged = null;
            lastLocation = null;
        }
        
    };*/
    
    class MovingAdapter extends MouseAdapter {

    private int x;

    private int y;

    @Override
    public void mousePressed(MouseEvent e) {
      x = e.getX();
      y = e.getY();
      
      for(FlowComponent component: components){
        if(component.shape.getBounds2D().contains(x, y)){
            System.out.println("Visibility true.");
        }else{
            System.out.println("Visibility false.");
        }
          
      }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        for(FlowComponent component: components){
            int dx = e.getX() - x;
            int dy = e.getY() - y;

            
            if (component.shape.getBounds2D().contains(x, y)) {
                //System.out.println(component.getBounds());
              //component.getBounds().x += dx;
              component.shape.getBounds().x += dx;
               component.shape.getBounds().y += dy;
                      //component.getBounds().y += dy, component.getBounds().width, component.getBounds().height);
               // System.out.println(component.getBounds());
              //component.getBounds().y += dy;
                //component.shape.getBounds().setBounds(x, y, dy, dy);
              repaint();
            }
            x += dx;
            y += dy;
        }
    }
  }

  class ScaleHandler implements MouseWheelListener {
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {

        
        for(FlowComponent component: components){
            int x = e.getX();
            int y = e.getY();

            if (e.getScrollType() == MouseWheelEvent.WHEEL_UNIT_SCROLL) {
          
             /* if (component.getBounds().contains(x, y)) {
                float amount = e.getWheelRotation() * 5f;
                //component..getBounds().width += amount;
                component.getBounds().height += amount;
                repaint();
              }
            }*/
        }
    }
  }
    

  }
  
  
    public void addComponent(FlowComponent comp){
        System.out.println("Component added.");
        components.add(comp);
    }
}