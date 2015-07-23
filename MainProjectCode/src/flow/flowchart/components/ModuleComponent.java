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
public class ModuleComponent implements Icon{
    


    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {
        Graphics2D gObject = (Graphics2D)g;
        GeneralPath modulePolygon = new GeneralPath();
        int xPoints[] = {5,26,26,5,5};
        int yPoints[] = {8,8,23,23,8};
        
        modulePolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            modulePolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        modulePolygon.moveTo(5, 12);
        modulePolygon.lineTo(26, 12);
        
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.draw(modulePolygon);
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
