/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import config.global;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;
import javablock.*;
import javablock.flowchart.connector;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.JOptionPane;

public class forloopBlock extends JBlock{

    public forloopBlock(Flowchart parent) {
       super(JBlock.Type.FORLOOP, parent);
    }

    @Override
    public void shape(){
        prepareText();
        Rectangle2D cpu=new Rectangle.Double(
                        bound.getX()-10,
                        bound.getY()-10,
                        bound.getWidth()+20,
                        bound.getHeight()+20
                        );
                shape=cpu;
        afterShape();
    }

   
}
