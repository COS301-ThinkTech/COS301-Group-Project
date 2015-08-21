
package javablock.flowchart.blocks;

import java.awt.geom.QuadCurve2D;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;

public class WhileLoopBlock extends JBlock{

    public WhileLoopBlock(Flowchart parent) {
       super(JBlock.Type.WHILELOOP, parent);
    }

    /**
     *
     */
    @Override
    public void shape(){
        prepareText();
        QuadCurve2D cpu=new QuadCurve2D.Double(
                        bound.getX()+40,
                        bound.getY()+5,
                        bound.getWidth()+20,
                        bound.getY()+5,
                        bound.getY()+10,
                        bound.getX()+10
                        );
                shape=cpu;
        afterShape();
    }

   
}
