/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editors;

import components.FlowchartComponent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hlavutelo
 *  
 *  Only has option for name of the  Module being created. Could be in the form of popUp.
 */
public class ModuleComponentEditor implements ComponentEditor{
    
    public ModuleComponentEditor(JButton button){
        // Frame where the button is added to
        final JFrame parent = new JFrame();
        // Frame where button is added to.
         button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String name = JOptionPane.showInputDialog(parent,
                        "Ehter the name of the module", null);
            }
        });
    }
     
    @Override
    public void setEditedComponent(){

    }
     
    @Override
    public void saveEditedComponent(){

    }
     
    @Override
    public FlowchartComponent getComponent(){
        return null; // replace with appropriate return type.
    }
}
