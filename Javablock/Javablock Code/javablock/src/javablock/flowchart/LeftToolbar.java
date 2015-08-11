/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart;

import config.global;
import config.translator;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author razi
 */
public class LeftToolbar extends JToolBar{
    public LeftToolbar(Flowchart flow){
        setFloatable(false);
        setRollover(true);
        setOrientation(JToolBar.VERTICAL);
        JButton b;

        JToolBar blocks = new JToolBar("Blocks");
        blocks.setFloatable(false);
        blocks.setOrientation(JToolBar.VERTICAL);
        {
            JToolBar std = new JToolBar("Standard");
            std.setFloatable(false);
            std.setOrientation(JToolBar.VERTICAL);
            for (JBlock.Type T : JBlock.StandardTypes) {
                b = new JButton();
                b.setActionCommand("add/" + T.toString());
                //b.setToolTipText(T.toString());
                b.setToolTipText(translator.tooltips.getString(T.toString() + ".help"));
                b.setPreferredSize(new Dimension(32, 32));
                b.setIcon(new javax.swing.ImageIcon(JBlock.getIcon(T)));
                std.add(b);
                b.addActionListener(flow);
            }
            blocks.add(std);
            JToolBar he = new JToolBar("Standard2");
            he.setFloatable(false);
            he.setOrientation(JToolBar.VERTICAL);
            for (JBlock.Type T : JBlock.HelpingTypes) {
                b = new JButton();
                //b.setToolTipText(T.toString());
                b.setToolTipText(translator.tooltips.getString(T.toString() + ".help"));
                b.setActionCommand("add/" + T.toString());
                b.setPreferredSize(new Dimension(32, 32));
                b.setIcon(new javax.swing.ImageIcon(JBlock.getIcon(T)));
                he.add(b);
                b.addActionListener(flow);
            }
            blocks.add(he);
        }
        add(blocks);
        //b = new JButton();
        //b.setIcon(new javax.swing.ImageIcon(JBlock.getIcon(JBlock.Type.LOGO)));
        //b.setActionCommand("showOthers");
        //b.addActionListener(menus);
        //add(b);
        {
            JToolBar tools = new JToolBar();
            if (!global.snapToGrid) {
                tools.setLayout(new GridLayout(2, 2));
            } else {
                tools.setLayout(new GridLayout(1, 2));
            }
            tools.setFloatable(false);
            tools.setRollover(true);
            /*b = new JButton();
            //b.setToolTipText(flow.name);
            b.setActionCommand("align/ver");
            b.setIcon(icons.icons.alignVer);
            b.addActionListener(flow);
            //tools.add(b);

            b = new JButton();
            b.setActionCommand("align/hor");
            b.setIcon(icons.icons.alignHor);
            b.addActionListener(flow);
            //tools.add(b);
           /* if (!global.snapToGrid) {
                b = new JButton();
                b.setActionCommand("align/grid");
                b.setIcon(icons.icons.alignGrid);
                b.addActionListener(flow);
                //tools.add(b);
            }*/
            add(tools);
            //addSeparator();
        }
        {
            validate();
            revalidate();
            //widgets.ColorClass c = new widgets.ColorClass(flow);
            //c.setPreferredSize(new Dimension(60, 150));
            //add(c);
        }
    }
}
