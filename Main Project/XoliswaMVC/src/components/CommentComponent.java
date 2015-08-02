package components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author tshepiso
 */
public class CommentComponent extends FlowchartComponent implements Icon{

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
    public void paint(Graphics g){
        Graphics2D gObject = (Graphics2D)g;
        GeneralPath commentPolygon = new GeneralPath();
        int xPoints[] = {5,20,25,25,5,5};
        int yPoints[] = {5,5,10,25,25,5};
        
        commentPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            commentPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        commentPolygon.moveTo(20, 5);
        commentPolygon.lineTo(20, 10);
        commentPolygon.lineTo(25, 10);
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.setStroke(new BasicStroke());
        gObject.fill(commentPolygon);
        gObject.draw(commentPolygon);
    }
    
    /*
    public static void main(String args[]){
        
        Component cc = new CommentComponent();
        
        JFrame f = new JFrame("Something.");
        f.setLayout(new GridLayout(3,4));
        JPanel jp = new JPanel();
        jp.setSize(10, 15);
        jp.setBackground(Color.red);
        
        jp.add(cc);
        
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(cc);
        f.setVisible(true);
    }*/

    @Override
    public int getIconWidth() {
        return 20;
    }

    @Override
    public int getIconHeight() {
        return 20;
    }
    
}
