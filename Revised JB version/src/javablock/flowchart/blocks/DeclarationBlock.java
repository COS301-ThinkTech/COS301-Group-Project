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
    public String name;
    public String value;

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
        /*NUMBER,*/ INTEGER, STRING, CHARARRAY, LOGIC, ANY
    }
    
    @Override
    public String getScriptFragmentForJavaScript(){
        String code="";
        //code+="\tcase "+ID+":";
        code+="\t\t\tInputReader.reset()\n";
        for(Field field:fields){
            code+="\t\t\tvar "+field.name+"=";
            switch(field.type){
                /*case NUMBER: code+="\t\t\ttoFloat(InputReader.readArgument(\""+field.name+": \"))\n";
                    break;*/
                case INTEGER: code+="\t\t\ttoInt(InputReader.readArgument(\""+field.name+": \"))\n";
                    break;
                case STRING: code+="\t\t\tstr(InputReader.readArgument(\""+field.name+": \"))\n";
                    break;
                case LOGIC: code+="\t\t\ttoLogic(InputReader.readArgument(\""+field.name+": \"))\n";
                    break;
                case CHARARRAY: code+="\t\t\ttoCharArray(InputReader.readArgument(\""+field.name+": \"))\n";
                    break;
                default: code+="\t\t\tInputReader.readArgument(\""+field.name+": \")\n";
            }
        }

        if(connects.size()==1)
            code+="\t\t\t"+flow.getName()+"_block="+connects.get(0).n.ID+"\n";
        else
            code+="\t\t\treturn 0";
        code+="\t\t\tbreak\n";
        return code;
    }
    
    public List<Field> fields=new ArrayList();
    public void clear(){
        fields.clear();
    }
    public void addField(String name, String type, String value){
        Field f=new Field();
        f.setName(name);
        f.setType(type);
        f.setValue(value);
        fields.add(f);
    }
    public String[][] getFields(){
        String f[][]=new String[fields.size()][3];
        int i=0;
        for(Field field:fields){
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
