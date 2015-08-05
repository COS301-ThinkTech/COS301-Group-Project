/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import config.global;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;
import javablock.*;
import javablock.flowchart.connector;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
/**
 *
 * @author Goodness
 */
public class moduleBlock extends JBlock{

    public moduleBlock(Flowchart parent) {
       super(Type.MODULE, parent);
    }

     @Override
    public boolean isSwitchable(){return false;}

    @Override
    public connector connectTo(JBlock n){
        connector c=new connector(this, n);
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
    public String getScriptFragmentForPython(){
        String code="";
        String c[]=getCode().split("\n");
        String w="";
        for(String l: c){
            while(l.charAt(0)==' '||l.charAt(0)=='\t')
                l=l.substring(1);
            w+=l+" ";
        }
        if(connects.size()==2){
            int T=nextCon("true").ID, F=nextCon("false").ID;
            code+="\t\t\tif ("+w+"): "+flow.getName()+"_block="+T+"\n";
            code+="\t\t\telse: "+flow.getName()+"_block="+F+"\n";
        }
        else if(connects.size()==1)
            code+="\t\t\t"+flow.getName()+"_block="+connects.get(0).n.nextExe().ID+"\n";
        else
            code+="\t\t\treturn 0\n";
        //code+="\t\tbreak";
        return code;
    }

    @Override
    public void shape(){
        prepareText();
        GeneralPath module = new GeneralPath();
        double xPoints[] = {bound.getX(), bound.getX()+bound.getWidth()+20, bound.getX()+bound.getWidth()+20, bound.getX(), bound.getX()};
        double yPoints[] = {bound.getY(), bound.getY(), bound.getY()+bound.getHeight()+25, bound.getY()+bound.getHeight()+25, bound.getY()};
         
        module.moveTo(xPoints[0], yPoints[0]);
        for(int i = 1; i < xPoints.length; i++)
        {
            module.lineTo(xPoints[i], yPoints[i]);
        }
        module.moveTo(bound.getX(), bound.getY()+10);
        module.lineTo(bound.getX()+bound.getWidth()+20, bound.getY()+10);

        shape=module;
        afterShape();
    }

    @Override
    protected String labelStyle(){
        return "align=\"center\"";
    }
    @Override
    public void drawText(Graphics2D g2d){
        if(global.useJLabels){
            super.drawText(g2d);
            return ;
        }
        g2d.setStroke(global.strokeNormal);
        g2d.translate(bound.getX(), bound.getY()+height+1);
        g2d.setColor(textColor);
        for (int i = 0; i < txtList.size(); i++) {
            double w = txtList.get(i).getBounds().getWidth();
            txtList.get(i).draw(g2d, (float) (bound.getWidth() / 2 - w / 2), (height + 2) * i);
        }
        g2d.translate(-bound.getX(), -bound.getY()-height-1);
    }
    
}
