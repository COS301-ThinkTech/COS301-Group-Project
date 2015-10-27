/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javablock.flowchart.BlockEditor;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;
import javablock.flowchart.blockEditors.DeclarationEditor;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class ModuleBlock extends JBlock{

    public String name="module";
    public String arguments="";
    public boolean silent=true;
    public boolean displayName=false;
    
   
    public ModuleBlock(Flowchart parent) {
       super(Type.MODULE, parent);
    }

    
   
    @Override
    public void shape(){
        
        /*prepareText();
        GeneralPath module = new GeneralPath();
        double xPoints[] = {bound.getX(), bound.getX()+bound.getWidth()+20, bound.getX()+bound.getWidth()+20, bound.getX(), bound.getX()};
        double yPoints[] = {bound.getY(), bound.getY(), bound.getY()+bound.getHeight()+20, bound.getY()+bound.getHeight()+20, bound.getY()};
         
        module.moveTo(xPoints[0], yPoints[0]);
        for(int i = 1; i < xPoints.length; i++)
        {
            module.lineTo(xPoints[i], yPoints[i]);
        }
        module.moveTo(bound.getX(), bound.getY()+10);
        module.lineTo(bound.getX()+bound.getWidth()+20, bound.getY()+10);

        shape=module;
        afterShape();*/
        
        /*prepareText();
        Rectangle2D cpu=new Rectangle.Double(
                        bound.getX()-10,
                        bound.getY()-10,
                        bound.getWidth()+50,
                        bound.getHeight()+15
                        );
                shape=cpu;
        afterShape();*/
        
        prepareText();
        GeneralPath mod=new GeneralPath();
            
            mod.moveTo(bound.getX()-10, bound.getY()-10);
            mod.lineTo(bound.getX()+bound.getWidth()+13, bound.getY()-10);
            mod.lineTo(bound.getX()+bound.getWidth()+13, bound.getY()+bound.getHeight()+10);
            mod.lineTo(bound.getX()-10, bound.getY()+bound.getHeight()+10);
            mod.lineTo(bound.getX()-10, bound.getY()-10);
            
            mod.moveTo(bound.getX()-10, bound.getY()-0.5);
            mod.lineTo(bound.getX()+bound.getWidth()+13, bound.getY()-0.5);
            
        shape=mod;
        afterShape();
        
    }
}
