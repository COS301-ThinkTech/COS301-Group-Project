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
import java.awt.geom.GeneralPath;
import javax.swing.Icon;

/**
 *
 * @author tshepiso
 */
public class InputComponent implements Icon{

    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {
        Graphics2D gObject = (Graphics2D)g;
        GeneralPath inputPolygon = new GeneralPath();
        
        
        int xPoints[] = {10,28,23,5,10};
        int yPoints[] = {8,8,23,23,8};
        
        inputPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            inputPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.fill(inputPolygon);
        gObject.draw(inputPolygon);
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
