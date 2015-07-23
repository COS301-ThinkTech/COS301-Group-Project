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
        gObject.setColor(Color.decode("#079CCE"));
        gObject.fillOval(4, 8, 24, 16);
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
