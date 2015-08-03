package flow.flowchart.components;

import flow.flowchart.FlowComponent;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.Icon;

/**
 *
 * @author tshepiso
 */
public class DecisionComponent extends FlowComponent implements Icon{
    
    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {

        Graphics2D gObject = (Graphics2D)g;
        
        int xPoints[] = {16,29,16,3,16};
        int yPoints[] = {3,16,29,16,3};
        GeneralPath decisionPolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        decisionPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            decisionPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        decisionPolygon.closePath();
        
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(decisionPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(decisionPolygon);
        
    }

    @Override
    public int getIconWidth() {
        return 20;
    }

    @Override
    public int getIconHeight() {
        return 20;
    }
    
    public void drawDecision(Graphics2D g, int x, int y){
        redraw(g,x,y);
    }
    
        
    public void redraw(Graphics2D g, int x, int y){
        Graphics2D gObject = (Graphics2D)g;
        
        int xPoints[] = {26+x,39+x,26+x,13+x,26+x};
        int yPoints[] = {13+y,26+y,39+y,26+y,13+y};
        GeneralPath decisionPolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        decisionPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            decisionPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        decisionPolygon.closePath();
        
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(decisionPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(decisionPolygon);
    }
    

}
