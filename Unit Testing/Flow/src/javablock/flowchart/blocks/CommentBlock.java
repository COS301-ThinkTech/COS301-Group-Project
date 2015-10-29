/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;

/**
 *
 * @author tshepiso
 */
public class CommentBlock extends JBlock{

    public CommentBlock(Flowchart parent) {
        super(Type.COMMENT, parent);
        comment = "comment";
    }
    
    @Override
    public void shape(){
        prepareText();
        RoundRectangle2D cpu=new RoundRectangle2D.Double(
                        bound.getX()-10,
                        bound.getY()-10,
                        bound.getWidth()+20,
                        bound.getHeight()+20,
                        25,25
                        );
                shape=cpu;
        afterShape();
    }    
}
