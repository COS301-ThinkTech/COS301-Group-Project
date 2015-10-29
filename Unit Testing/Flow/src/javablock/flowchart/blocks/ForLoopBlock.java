
package javablock.flowchart.blocks;

import java.awt.Rectangle;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;

public class ForLoopBlock extends JBlock{

    public ForLoopBlock(Flowchart parent) {
       super(JBlock.Type.FORLOOP, parent);
    }

    /**
     *
     */
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

    @Override
    public void prepareText(){
        displayComment=true;
        if(comment.length()==0)
            this.comment=" for ";
        super.prepareText();
    }
}
