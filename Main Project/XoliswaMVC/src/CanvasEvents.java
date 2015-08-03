/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import components.*;
import java.awt.Font;
import java.awt.List;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author tshepiso
 */
public class CanvasEvents extends JPanel{
    
    private final Font FONT = new Font("Arial", Font.PLAIN, 12);
    private ArrayList<FlowchartComponent> components;
    private FlowchartComponent currentPolygon = null;

    public CanvasEvents() {
        this.components = new ArrayList<FlowchartComponent>();
        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);
    }
    
    private MouseAdapter mouseListener = new MouseAdapter(){
        private FlowchartComponent dragged = null;
        private Point lastLocation = null;
        
        @Override
        public void mousePressed(java.awt.event.MouseEvent me){

            System.out.println(components.size() + " is the size.");
            for(FlowchartComponent comp : components){
                System.out.println("Press event: (" +me.getX()+","+me.getY()+") - " + comp.contains(me.getX(), me.getY()));
                System.out.println("Component Point: (" +comp.getX()+","+comp.getY());

                if(comp.contains(me.getX(), me.getY())){
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
                //dragged.
                repaint();
            }
        }
        
        @Override
        public void mouseReleased(java.awt.event.MouseEvent me){
            dragged = null;
            lastLocation = null;
        }
        
    };
    
    public void addComponent(FlowchartComponent comp){
        System.out.println("Component added.");
        components.add(comp);
    }
}
