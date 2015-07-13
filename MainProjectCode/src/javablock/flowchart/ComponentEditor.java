/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart;

/**
 *
 * @author GreaterThanSolomon
 */
public interface ComponentEditor {
    // edit component sent as parameter (Object)
    public void setEditedComponent(); // Remember it takes a component as parameter.
    
    // keep edited component somewhere in memory.
    public void saveEditedComponent();
    
    // return the edited component, componentType still to be defined.
    public Component getComponent();    
}
