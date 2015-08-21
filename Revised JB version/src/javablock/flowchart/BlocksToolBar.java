/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart;

import config.translator;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JToolBar;


public class BlocksToolBar extends JToolBar{
    public BlocksToolBar(Flowchart flow){
        setFloatable(false);
        setRollover(true);
        setOrientation(JToolBar.VERTICAL);
        JButton b;

        JToolBar blocks = new JToolBar("Blocks");
        blocks.setFloatable(false);
        blocks.setOrientation(JToolBar.HORIZONTAL);
        {
            JToolBar std = new JToolBar("Standard");
            std.setFloatable(false);
            std.setOrientation(JToolBar.VERTICAL);
            for (JBlock.Type T : JBlock.StandardTypes) {
                b = new JButton(); 
                b.setToolTipText(translator.tooltips.getString(T.toString() + ".help"));
                if(T == JBlock.StandardTypes[4])
                {
                    b.setActionCommand("foraction/FORLOOP" + T.toString());
                    b.setName("foraction/FORLOOP" + T.toString());
                }                
                else if(T == JBlock.StandardTypes[3])
                {
                    b.setActionCommand("moduleaction/MODULE" + T.toString());
                    b.setName("moduleaction/MODULE" + T.toString());
                }
                else{
                     b.setActionCommand("add/" + T.toString());
                     b.setName("add/" + T.toString());
                }
                b.setPreferredSize(new Dimension(32, 32));
                b.setIcon(new javax.swing.ImageIcon(JBlock.getIcon(T)));
                std.add(b);
                b.addActionListener(flow);
                b.addMouseMotionListener(flow);
            }
            for (JBlock.Type T : JBlock.HelpingTypes) {
                b = new JButton();
                b.setToolTipText(translator.tooltips.getString(T.toString() + ".help"));
                b.setActionCommand("add/" + T.toString());
                b.setPreferredSize(new Dimension(32, 32));
                b.setIcon(new javax.swing.ImageIcon(JBlock.getIcon(T)));
                std.add(b);
                b.addActionListener(flow);
                b.addMouseMotionListener(flow);
            }
            blocks.add(std);
            add(blocks);       
            validate();
            revalidate();        
        }
    }
}
