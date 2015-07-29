package components;

/**
 *
 * @author tshepiso
 */

import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.Icon;

public class ProcessComponent extends FlowchartComponent implements Icon{

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D gObject = (Graphics2D)g;
        BasicStroke stroke = new BasicStroke(1.0f);
        Rectangle2D processPolygon = new Rectangle2D.Double(9, 5, 15, 20);
        
        gObject.setStroke(stroke);
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(processPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(processPolygon);
        
    }

    @Override
    public int getIconHeight(){
        return 20;
    }

    @Override
    public int getIconWidth(){
        return 60;
    }
}

