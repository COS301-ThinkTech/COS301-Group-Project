
package flow.flowchart.components;


import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author tshepiso
 */
public class EndComponent extends Component implements Icon{

    private Ellipse2D endPolygon;
    private Graphics2D gObject;
    
    public EndComponent(){
        addMouseListener(new MouseAdapter(){
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
                endPolygon = new Ellipse2D.Double(4+me.getX(), 8+me.getY(), 24+me.getX(), 16+me.getY());
                BasicStroke stroke = new BasicStroke(1.0f);
                gObject.setStroke(stroke);
                gObject.setPaint(Color.decode("#079CCE"));
                gObject.fill(endPolygon);
                gObject.setPaint(Color.BLACK);
                gObject.draw(endPolygon);
                    }
        });
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
        gObject = (Graphics2D)g;
        BasicStroke stroke = new BasicStroke(1.0f);
        endPolygon = new Ellipse2D.Double(4, 8, 24, 16);
        
        
        gObject.setStroke(stroke);
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(endPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(endPolygon);
    }
    
    public static void main(String args[]){
        
        JPanel random = new JPanel();
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
        System.out.println("-->"+mod.getGraphics());
    }
    
}
