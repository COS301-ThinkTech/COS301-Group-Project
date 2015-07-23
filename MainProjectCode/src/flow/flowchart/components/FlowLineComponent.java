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
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import javax.swing.Icon;

/**
 *
 * @author tshepiso
 */
public class FlowLineComponent implements Icon{
    
    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {

        Graphics2D gObject = (Graphics2D)g;
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.setStroke(new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL));
        gObject.draw(new Line2D.Double(5,15,25,15));
        
        
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
