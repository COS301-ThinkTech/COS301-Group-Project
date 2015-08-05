package flow.flowchart.components;

import flow.flowchart.FlowComponent;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.Icon;

/**
 *
 * @author tshepiso
 */
public class ReturnComponent extends FlowComponent implements Icon{

    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {
       
    }

    @Override
    public int getIconWidth() {
       return 20;
    }

    @Override
    public int getIconHeight() {
       return 20; 
    }
    
    @Override
    public void shape(){
        prepareText();
        Ellipse2D st1=new Ellipse2D.Double(
            bound.getX()-10,
            bound.getY()-10,
            40,
            bound.getHeight()+20
        );
        Ellipse2D st2=new Ellipse2D.Double(
            bound.getX() + bound.getWidth()-30,
            bound.getY()-10,
            40,
            bound.getHeight()+20
        );
        Rectangle2D r=new Rectangle2D.Double(
            bound.getX()+10,
            bound.getY()-10,
            bound.getWidth()-20,
            bound.getHeight()+20
            );
        Area s=new Area(st1);
        s.add(new Area(st2));
        s.add(new Area(r));
        shape=s;
        afterShape();
    }
    
}
