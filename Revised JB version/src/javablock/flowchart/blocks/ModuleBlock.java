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
       comment = "fun(x)";
    }

    
   
    @Override
    public void shape(){
        
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
