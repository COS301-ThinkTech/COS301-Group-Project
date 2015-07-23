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
import java.awt.Polygon;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tshepiso
 */
public class ModuleComponent extends Component implements Icon{
    


    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {
        Graphics2D gObject = (Graphics2D)g;
        
        int xPoints[] = {5,26,26,5,5};
        int yPoints[] = {8,8,23,23,8};
        
        GeneralPath modulePolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        modulePolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            modulePolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        
        modulePolygon.moveTo(5, 12);
        modulePolygon.lineTo(26, 12);
        
        modulePolygon.closePath();
                
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(modulePolygon);
        gObject.setPaint(Color.BLACK);
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
    
    @Override
    public void paint(Graphics g){
        Graphics2D gObject = (Graphics2D)g;
        
        int xPoints[] = {5,200,200,5,5};
        int yPoints[] = {8,8,100,100,8};
        
        GeneralPath modulePolygon = new GeneralPath(GeneralPath.WIND_EVEN_ODD,xPoints.length);
        
        modulePolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            modulePolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        modulePolygon.moveTo(5, 20);
        modulePolygon.lineTo(200, 20);
        
        modulePolygon.closePath();
                
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(modulePolygon);
        gObject.setPaint(Color.BLACK);
        /*AffineTransform moving = new AffineTransform();
        moving.translate(190, 200);
        modulePolygon.transform(moving);*/
        gObject.draw(modulePolygon);
    }
    
    /*
    public static void main(String args[]){
        
        JPanel random = new JPanel();
        random.setBackground(Color.red);
        Component mod = new ModuleComponent();
        mod.getGraphics().tr
        mod.setBackground(Color.yellow);
        
        random.add(mod);
        
        JFrame frame = new JFrame("Nothing.");
        
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        frame.add(mod);
    }*/
}
