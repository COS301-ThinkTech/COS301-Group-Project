package javablock.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.TimerTask;
import javax.swing.*;

public class Splash extends JWindow implements MouseListener {

    private final int duration;

    public Splash(int d) {
        duration = d;
    }

    public JPanel content;
    
    public void showSplash() {
        content = (JPanel)getContentPane();
        content.setBackground(Color.white);
        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/javablock/gui/splash.png")));
        int width = label.getIcon().getIconWidth();
        int height =label.getIcon().getIconHeight()+20;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
        
        
        JLabel copyrt = new JLabel("Author: ThinkTech, University of Pretoria (2015)");
        copyrt.setFont(new Font("Sans-Serif", Font.BOLD, 12));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        setVisible(true);
        this.addMouseListener(this);

    }
  


    @Override
    public void show(){
        closer c=new closer(this);
        super.show();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setVisible(false);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}


class closer extends TimerTask
{
    java.util.Timer timer;
    Splash s=null;
    public closer(Splash s)
    {
        this.s=s;
        timer = new java.util.Timer( );
        timer.schedule(this, 5000, 5000);
    }


    @Override
    public void run() 
    {
        s.setVisible(false);
        timer.cancel();
    }
}
