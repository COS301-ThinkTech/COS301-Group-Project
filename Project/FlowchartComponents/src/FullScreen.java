
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Goodness
 */
public class FullScreen extends JFrame{
    
     private GraphicsDevice vc;

    public FullScreen(){
     super();

     GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
     vc= e.getDefaultScreenDevice();



     JButton b = new JButton("exit");
     b.addActionListener(
             new ActionListener(){
                 public void actionPerformed(ActionEvent arg0) { 
                     dispose();
                     System.exit(0);

                 }
             }
             );
     this.setLayout(new FlowLayout());
     this.add(b);
     setFullScreen(this);
 }

 public void setFullScreen(JFrame f){

     f.setUndecorated(true);
     f.setResizable(false);
     vc.setFullScreenWindow(f);

}
}