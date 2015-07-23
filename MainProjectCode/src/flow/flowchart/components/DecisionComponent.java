/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow.flowchart.components;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import javax.swing.Icon;

/**
 *
 * @author tshepiso
 */
public class DecisionComponent implements Icon{
    
    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {

        Graphics2D gObject = (Graphics2D)g;
        GeneralPath decisionPolygon = new GeneralPath();
        
        
        int xPoints[] = {16,29,16,3,16};
        int yPoints[] = {3,16,29,16,3};
        
        decisionPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            decisionPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.fill(decisionPolygon);
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
}
