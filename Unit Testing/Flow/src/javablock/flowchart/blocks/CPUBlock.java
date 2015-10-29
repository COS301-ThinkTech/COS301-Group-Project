/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javablock.flowchart.blocks;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;


public class CPUBlock extends JBlock {
    public CPUBlock(Flowchart parent){
        super(Type.CPU, parent);
        comment="i = j+5";
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
