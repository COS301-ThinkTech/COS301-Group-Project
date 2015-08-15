/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.geom.GeneralPath;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;

/**
 *
 * @author tshepiso
 */
public class CommentBlock extends JBlock{

    public CommentBlock(Flowchart parent) {
        super(Type.COMMENT, parent);
    }
    
    @Override
    public void shape(){
        prepareText();
        GeneralPath commentPolygon = new GeneralPath();
        double xPoints[] = {bound.getX()+15,bound.getX()+30,bound.getX()+35,bound.getX()+35,bound.getX()+15,bound.getX()+15};
        double yPoints[] = {bound.getY()+15,bound.getY()+15,bound.getY()+20,bound.getY()+35,bound.getY()+35,bound.getY()+15};
        
        commentPolygon.moveTo(xPoints[0], yPoints[0]);
        
        for(int index = 1; index < xPoints.length; index++){
            commentPolygon.lineTo(xPoints[index], yPoints[index]);
        }
        
        commentPolygon.moveTo(bound.getX()+30, bound.getY()+15);
        commentPolygon.lineTo(bound.getX()+30, bound.getY()+20);
        commentPolygon.lineTo(bound.getX()+35, bound.getY()+20);
        shape = commentPolygon;
        afterShape();
    }    
}
