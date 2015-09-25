/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import javablock.flowchart.BlockEditor;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;
import javablock.flowchart.blockEditors.DeclarationEditor;

/**
 *
 * @author tshepiso
 */
public class DeclarationBlock extends JBlock{

    public static DeclarationEditor editor=new DeclarationEditor();
    public DeclarationBlock(Flowchart parent) {
        super(Type.DECLARATION, parent);
    }

    //public DeclarationBlock(Flowchart parent) {
        //super(Type.DECLARATION, parent);
    //}

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
    
    class Field{
        DataType type=DataType.ANY;
        String name;
        String value;
        Field(){
            type=DataType.INTEGER;
            name="";
            value = "";
        }
        public void setType(String t){
            try{
                type= DataType.valueOf(t);
            } catch(Exception e){
                type=DataType.ANY;
            }
        }
        public void setName(String n){
            name=n;
        }
        
        public void setValue(String val){
            value = val;
        }
    }
    public enum DataType{
        NUMBER, INTEGER, STRING, CHARARRAY, LOGIC, ANY
    }
    
    public List<DeclarationBlock.Field> fields=new ArrayList();
    public void clear(){
        fields.clear();
    }
    public void addField(String name, String type, String value){
        DeclarationBlock.Field f=new DeclarationBlock.Field();
        f.setName(name);
        f.setType(type);
        f.setValue(value);
        fields.add(f);
    }
    public String[][] getFields(){
        String f[][]=new String[fields.size()][3];
        int i=0;
        for(DeclarationBlock.Field field:fields){
            f[i][0]=field.name;
            f[i][1]=field.type.toString();
            f[i][2]=field.value;
            i++;
        }
        return f;
    }
    
    @Override
    public boolean isEditable(){
        return true;
    }
    @Override
    public BlockEditor getEditor(){
        return editor;
    }
    @Override
    public boolean canBeConnected(JBlock b){
        return false;
    }
    @Override
    public boolean popUpEditor(){return false;}
}
