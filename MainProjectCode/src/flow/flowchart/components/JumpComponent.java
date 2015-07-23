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
public class JumpComponent extends Component implements Icon{
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D gObject = (Graphics2D)g;
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.fillOval(10, 10, 10, 10);
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