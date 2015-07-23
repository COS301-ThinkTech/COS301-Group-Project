/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow.flowchart;

import javax.swing.JComponent;
import javax.swing.JPanel;

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
