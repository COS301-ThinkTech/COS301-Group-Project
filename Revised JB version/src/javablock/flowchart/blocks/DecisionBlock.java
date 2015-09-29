/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javablock.flowchart.blocks;
import config.Global;
import config.translator;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;
import javablock.flowchart.*;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
//import javablock.flowchart.blockEditors.DecisionEditor;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import widgets.ComboText;

public class DecisionBlock extends JBlock {
   // public static DecisionEditor editor = new DecisionEditor();
    public DecisionBlock(Flowchart parent){
        super(Type.DECISION, parent);
    }
    
    @Override
    public boolean isSwitchable(){return false;}
    public String var1 = "", var2 = "";
    public String compOperator;
    public String logicalOperator;
    public List<Comparison> comparisons = new ArrayList();
    // @Override
//    public BlockEditor getEditor(){
//        return editor;
//    }

    @Override
    public Flowline connectTo(JBlock n){
        Flowline c=new Flowline(this, n);
        if(type==Type.DECISION){
            if(connects.size()>0){
                if(connects.get(connects.size()-1).value.equals("true"))
                   c.setValue("false");
                else
                   c.setValue("true");
            }
            else
                c.setValue("true");
            while(connects.size()>1){
                connects.get(0).delete();
                connects.remove(0);
            }
        }
        flow.historyAdd();
        connects.add(c);
        n.addInConnect(c);
        return c;
    }

    @Override
    public JBlock executeCode(ScriptEngine script){
        String txt=this.code;
        try {
            String ev="true";
            if(txt.length()>0)
                ev = script.eval(getCode()).toString();
            //System.out.println(ev);
            for(int i=0; i<connects.size(); i++)
                if(connects.get(i).value.equals(ev))
            return connects.get(i).n.nextExe();
        } catch (ScriptException ex) {
            JOptionPane.showMessageDialog(null,"Script error:\n"+this.code);
        }
        return null;
    }

    JBlock nextCon(String con){
        for(int i=0; i<connects.size(); i++)
            if(connects.get(i).value.equals(con))
                return connects.get(i).n.nextExe();
        return null;
    }

    @Override
    public String getScriptFragmentForJavaScript(){
        String code="";
        //code+="case "+ID+":\n";
        String w=getCode();
        if(connects.size()==2){
            int T=nextCon("true").ID, F=nextCon("false").ID;
            code+="\t\t\tif("+w+") "+flow.getName()+"_block="+T+"\n";
            code+="\t\t\telse "+flow.getName()+"_block="+F+"\n";;
            
        }
        else if(connects.size()==1)
            code+="\t\t\t"+flow.getName()+"_block="+connects.get(0).n.nextExe()+"\n";
        else
            code+="\t\t\treturn 0;\n";
        code+="\t\t\tbreak;\n";
        return code;
    }
    
    @Override
    public void shape(){
        prepareText();
        GeneralPath deci=new GeneralPath();
            deci.moveTo(bound.getX()+bound.getWidth()/2, bound.getY()-10-bound.getWidth()/6);
            deci.lineTo(bound.getX()+bound.getWidth()+20, bound.getY()+bound.getHeight()/2);
            deci.lineTo(bound.getX()+bound.getWidth()/2, bound.getY()+bound.getHeight()+10+bound.getWidth()/6);
            deci.lineTo(bound.getX()+-20, bound.getY()+bound.getHeight()/2);
            deci.lineTo(bound.getX()+bound.getWidth()/2, bound.getY()-10-bound.getWidth()/6);
        shape=deci;
        afterShape();
    }

    @Override
    protected String labelStyle(){
        return "align=\"center\"";
    }
    @Override
    public void drawText(Graphics2D g2d){
        if(Global.useJLabels){
            super.drawText(g2d);
            return ;
        }
        g2d.setStroke(Global.strokeNormal);
        g2d.translate(bound.getX(), bound.getY()+height+1);
        g2d.setColor(textColor);
        for (int i = 0; i < txtList.size(); i++) {
            double w = txtList.get(i).getBounds().getWidth();
            txtList.get(i).draw(g2d, (float) (bound.getWidth() / 2 - w / 2), (height + 2) * i);
        }
        g2d.translate(-bound.getX(), -bound.getY()-height-1);
    }

    public void clear() {
        comparisons.clear();
    }
    
       public void addComparison(String variable1, String variable2){
        Comparison c=new Comparison();
        c.setVar1(variable1);
        c.setVar2(variable2);
       // fields.add(f);
    }
       
       public String[][] getComparisons(){
        String f[][]=new String[comparisons.size()][2];
        int i=0;
        for(Comparison comp:comparisons){
            f[i][0]=comp.var1;
            f[i][1]=comp.var2;
            i++;
        }
        return f;
    }
    class Comparison{
        String var1, var2;
        Comparison()
        {
            var1 = "";
            var2 = "";
        }
        public void setVar1(String v1)
        {
            var1 = v1;
        }
        public void setVar2(String v2)
        {
            var2 = v2;
        }
     
     
        }
    

}
