/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow.flowchart.components;


import java.awt.*;
import javax.swing.*;
/**
 *
 * @author tshepiso
 */
public class EndComponent implements Icon{

    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {

        Graphics2D gObject = (Graphics2D)g;
        gObject.setColor(Color.BLUE);
        gObject.fillOval(10, 10, 30, 10);
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
    
}
