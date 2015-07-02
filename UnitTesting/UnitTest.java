import java.util.ArrayList;
public  class UnitTest
{
  //@Test
 //Mock Component Object
  Component testComponent, addedComponent;
  Flowchart chart = new Flowchart();
 
  public void  addFlowchartComponentTest()
  {
      // actual component list
       ArrayList<Component> actual = chart.componentList;
       actual.add(testComponent);
       
       //excpected list after function is called
       ArrayList<Component> expected  = new  ArrayList<>();
       expected.add(testComponent);
       expected.add(addedComponent);
       
       //callfunction 
       chart.addNewFlowchartComponent(addedComponent, actual);
       
       //check if added to list, by checking if component list is equal to expected
       assertThat(actual, is(expected));

  }
          
}