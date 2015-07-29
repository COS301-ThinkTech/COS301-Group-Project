package flow.flowchart.components;

/**
 *
 * @author tshepiso
 */

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import javax.swing.Icon;

public class ProcessComponent extends Component implements Icon{

    public ProcessComponent() {
        
    }

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
    
    public void drawProcess(Graphics2D g, int x, int y){
        redraw(g,x,y);
    }
    
    public void redraw(Graphics2D g, int x, int y){
        Graphics2D gObject = (Graphics2D)g;
        BasicStroke stroke = new BasicStroke(1.0f);
        GeneralPath processPolygon = new GeneralPath();
        
        int xPoints[] = {5+x,200+x,200+x,5+x,5+x};
        int yPoints[] = {8+y,8+y,100+y,100+y,8+y};
        
        processPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int i = 1; i < xPoints.length; i++){
            processPolygon.lineTo(xPoints[i], yPoints[i]);
        }
            
        processPolygon.closePath();
        
        gObject.setStroke(stroke);
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(processPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(processPolygon);
    }
}

