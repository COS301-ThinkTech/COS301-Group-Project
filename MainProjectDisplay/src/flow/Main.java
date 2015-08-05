package flow;

import com.jtattoo.plaf.texture.TextureLookAndFeel;
import flow.gui.MainDisplay;
import flow.gui.Splash;
import java.beans.PropertyVetoException;
import java.util.Properties;
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
    public static void main(String args[]) throws PropertyVetoException 
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
            TextureLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        if(mainDisp.showSplash)
        {
            System.out.println("SHOW Splash");
            Splash splash = new Splash(30);
            splash.showSplash();
        }
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainDisplay m = null;
                m = new MainDisplay();
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
