
package flow.flowchart.components;


import flow.flowchart.FlowComponent;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author tshepiso
 */
public class EndComponent extends FlowComponent implements Icon{


    
    public EndComponent(){

    }
    
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
    
    public void paint(Graphics g){
        Ellipse2D endPolygon = new Ellipse2D.Double(4, 8, 24, 16);
        Graphics2D gObject = (Graphics2D)g;
        
        BasicStroke stroke = new BasicStroke(1.0f);
        
        gObject.setStroke(stroke);
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(endPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(endPolygon);
    }
    
    public void redraw(Graphics2D gObject, int x, int y){
        BasicStroke stroke = new BasicStroke(1.0f);
        Ellipse2D endPolygon = new Ellipse2D.Double(4, 8, 24, 16);
        
        
        gObject.setStroke(stroke);
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(endPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(endPolygon);
    }
    
    public void drawEnd(Graphics2D g, int x, int y){
        redraw(g,x,y);
    }
    
    public static void main(String args[]){
        
        /*JPanel random = new JPanel();
        random.setBackground(Color.red);
        Component mod = new EndComponent();
        System.out.println("-->"+mod.getGraphics());
        //mod.getGraphics().translate(90, 90);
        mod.setBackground(Color.yellow);
        
        random.add(mod);
        
        JFrame frame = new JFrame("Nothing.");
        
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        frame.add(mod);
        System.out.println("-->"+mod.getGraphics());*/
    }
    
}
