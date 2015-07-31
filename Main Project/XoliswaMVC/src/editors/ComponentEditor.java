package editors;

import components.FlowchartComponent;

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
    public FlowchartComponent getComponent();    
}
