/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow.flowchart.components;

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
public class OutputComponent implements Icon{

    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {
        Graphics2D gObject = (Graphics2D)g;

        int xPoints[] = {10,28,23,5,10};
        int yPoints[] = {8,8,23,23,8};
        
        GeneralPath outputPolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        outputPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            outputPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        
        outputPolygon.closePath();
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(outputPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(outputPolygon);
        
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
