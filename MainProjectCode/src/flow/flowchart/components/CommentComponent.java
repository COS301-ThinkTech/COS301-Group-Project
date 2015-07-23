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
import java.awt.GridLayout;
import java.awt.geom.GeneralPath;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tshepiso
 */
public class CommentComponent extends Component implements Icon{

    @Override
    public void paintIcon(Component cmpnt, Graphics g, int i, int i1) {
        Graphics2D gObject = (Graphics2D)g;
        GeneralPath commentPolygon = new GeneralPath();
        int xPoints[] = {5,20,25,25,5,5};
        int yPoints[] = {5,5,10,25,25,5};
        
        commentPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            commentPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        commentPolygon.moveTo(20, 5);
        commentPolygon.lineTo(20, 10);
        commentPolygon.lineTo(25, 10);
        
        commentPolygon.closePath();
        
        
        //gObject.setColor(Color.decode("#079CCE"));
        gObject.setPaint(Color.decode("#079CCE"));
        gObject.fill(commentPolygon);
        gObject.setPaint(Color.BLACK);
        gObject.draw(commentPolygon);
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
        GeneralPath commentPolygon = new GeneralPath();
        int xPoints[] = {5,20,25,25,5,5};
        int yPoints[] = {5,5,10,25,25,5};
        
        commentPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            commentPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        commentPolygon.moveTo(20, 5);
        commentPolygon.lineTo(20, 10);
        commentPolygon.lineTo(25, 10);
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.setStroke(new BasicStroke());
        gObject.fill(commentPolygon);
        gObject.draw(commentPolygon);
    }
    
    
    public static void main(String args[]){
        
        Component cc = new CommentComponent();
        
        JFrame f = new JFrame("Something.");
        f.setLayout(new GridLayout(3,4));
        JPanel jp = new JPanel();
        jp.setSize(10, 15);
        jp.setBackground(Color.red);
        
        jp.add(cc);
        
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(cc);
        f.setVisible(true);
    }
}
