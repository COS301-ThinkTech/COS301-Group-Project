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
public class JumpComponent implements Icon{
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setColor(Color.BLUE);
        g2.fillOval(36, 5, 20, 20);
    }

    @Override
    public int getIconHeight(){
        return 20;
    }

    @Override
    public int getIconWidth(){
        return 60;
    }
}
