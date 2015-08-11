import java.util.ArrayList;
public class Flowchart
{
   public  ArrayList<Component> componentList = new ArrayList<>();
    
    public boolean addNewFlowchartComponent(Component toAdd,ArrayList<Component> List)
    {
        if(List== null)
        {
            return false;
        }
        else
        {
            List.add(toAdd);
            return true;
        }
   
    }
}