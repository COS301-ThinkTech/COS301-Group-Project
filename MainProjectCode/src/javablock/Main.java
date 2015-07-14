/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock;

import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.util.Properties;
import javablock.flowchart.editors.StandardEditor;
import javablock.gui.MainDisplay;
import javablock.gui.Splash;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Hlavutelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        
        System.out.println("START Building");
        
        MainDisplay mainDisp = new MainDisplay();
        try {
                        
            /*for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }*/
            Properties props = new Properties();
            props.put("logoString", "Flow");
            NoireLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        if(mainDisp.showSplash)
        {
            System.out.println("SHOW Splash");
            Splash splash = new Splash(20);
            splash.showSplash();
        }
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainDisplay m = new MainDisplay();
                m.setExtendedState(JFrame.MAXIMIZED_BOTH);
                m.setVisible(true);
            }
        });
        
        System.out.println("END Building");
        /*
        StandardEditor se = new StandardEditor();
        JFrame f = new JFrame();
        f.add(se);
        
        f.setVisible(true);
                */
        
    }
    
}
