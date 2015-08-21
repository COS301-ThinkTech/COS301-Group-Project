package javablock;

import java.awt.Color;
import java.util.List;
import javablock.flowchart.JBlock;
import javablock.gui.Interpreter;
import javax.swing.JComponent;
import javax.swing.JSplitPane;
import org.w3c.dom.Element;


public abstract class Sheet extends JComponent
{
    protected FlowchartManager manager;
    public Interpreter I;
    public int interval=200;
    public JSplitPane split;
    
    
    public Sheet(FlowchartManager manager){
        this.manager=manager;
    }
    
    public FlowchartManager getManager(){
        return manager;
    }
    
    JComponent workspaceInstance;
    public JComponent getWorkspace()
    {
        return workspaceInstance;
    }
    public void setWorkspace(JComponent set)
    {
        workspaceInstance=set;
    }
    /**
     * Method called to close sheet and end working over it<br/>
     * Should close all running threads
     */
    public abstract void close();
    
    /**
     * Method used to delete sheet from document
     */
    public abstract void delete();
    
    /**
     * Returns this sheet name
     * @return returns string
     */
    @Override
    public abstract String getName();
    /**
     * Set new name
     */
    @Override
    public abstract void setName(String name);
    
    /**
     * Sets color to selected items
     * @param c
     * @param mode
     */
    public abstract void setColor(Color c, int mode);
    
    /**
     * Used to block editing
     * @param editing 
     */
    public abstract void setEditable(boolean editing);
    /**
     * optimize all sheets elements id's
     * 
     */
   
    public abstract void optimizeID();
    
    /**
     * Returns all selected elements
     * @return 
     * 
     */
    public abstract List<JBlock> getSelected();
    public abstract List<JBlock> getBlocks();
    public  abstract void copy();
    public  abstract void cut();
    public  abstract void paste();
    public abstract void update();
    /**
     * Method used to save sheet as image do file (defined by url)
     * @param url
     * @param name
     */
    public abstract void saveAsImage(String url, String name);
    /**
     * Method used to save sheet as image do file (opens dialog)
     */
    public abstract void saveAsImage();
    /**
     * Saves sheet to exists XML DOM
     * @param root 
     */
    public abstract void saveXml(Element root);
    /**
     * 
     * @param f - node
     */
    public abstract void parseXml(Element f); 
    
    
    /**
     * Generates JavaScript script to use in Global scope
     * @return Ready JavaScript script
     */
    public abstract String makeJavaScriptFunctions();
    public void generateBlocks()
    {}
}


