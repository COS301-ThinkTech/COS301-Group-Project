package flow.flowchart;

import javax.swing.JComponent;

/**
 *
 * @author GreaterThanSolomon
 */
public abstract class Component extends JComponent{
    // complete, required by editors
 //   public boolean deleted  = false;
    
    protected String componentCode;
    
    public Component(){
        componentCode = "";
    }
}
