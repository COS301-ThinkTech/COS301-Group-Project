
package flow.flowchart.components;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;
/**
 *
 * @author tshepiso
 */
public class EndComponent extends Component implements Icon{

    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {

        Graphics2D gObject = (Graphics2D)g;
        BasicStroke stroke = new BasicStroke(1.0f);
        Ellipse2D endPolygon = new Ellipse2D.Double(4, 8, 24, 16);
        
        
        gObject.setStroke(stroke);
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(endPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(endPolygon);

        //gObject.
    }

    @Override
    public int getIconWidth() {
        return 20;
    }

    @Override
    public int getIconHeight() {
        return 20;
    }
    
}
