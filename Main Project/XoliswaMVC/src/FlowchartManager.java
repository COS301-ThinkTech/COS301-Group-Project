import components.*;
public class FlowchartManager {

    private ScriptRunner scriptRunner;
    private Flowchart flowchart;


    public FlowchartManager() 
    {
        flowchart = new Flowchart();
    }

    public void updateView() {
            // TODO - implement FlowchartManager.updateView
            throw new UnsupportedOperationException();
    }

    public void displayFullScreen() {
            // TODO - implement FlowchartManager.displayFullScreen
            throw new UnsupportedOperationException();
    }

    public void tab() {
            // TODO - implement FlowchartManager.tab
            throw new UnsupportedOperationException();
    }

    public void updateComponents() {
            // TODO - implement FlowchartManager.updateComponents
            throw new UnsupportedOperationException();
    }
   public FlowchartComponent addNewComponent(FlowchartComponent flow)
   {
        System.out.println("In flowchartManager...");
        flowchart.addToComponentList(flow);
        return flow;
   }

}