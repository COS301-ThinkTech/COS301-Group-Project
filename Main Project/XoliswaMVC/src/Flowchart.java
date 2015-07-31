
import components.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Flowchart {

    private List<FlowchartComponent> listOfComponents = new ArrayList<>();

    public Flowchart() 
    {
       //  listOfComponents = listOfComponents;
    }
    
    void addToComponentList(FlowchartComponent flow)
    {
       listOfComponents.add(flow);
       System.out.println("Number of components: "+ listOfComponents.size() );
    }

}