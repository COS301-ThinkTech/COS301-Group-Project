/**
	References made in this document will be made to 
	the original JavaBlock master zip folder files
**/

*Workspace.java 
- As the name entails, it is the container upon which work is done
- The Workspace allows for multiple flowcharts to be viewed and edited in one project
- The Workspace container facilitates this by using a "JTabbedPane" from which multiple Sheets may be accessed (line 30)
//Sheets will be explained in the next section, 
//but from current evaluation it appears to be the actual pane onto which flowcharts are drawn
- These tabs to access the sheets are seen in the JavaBlock GUI at the bottom (line 31), normally named the same as the flowchart Start node name
- The Workspace contains the multiple Sheets in a List Structure, this structure of course allows for the removal and addition of the Sheets

*FlowchartManager.java
- This class appears to be responsible for the following:
	- What happens when the user presses the close button to close the application  (close dialog)
	- What happens when the user opens the flowchart (loading the last opened flowchart, parsing its entire state from XML)
	- What happens while the user is busy with the application, if a user clicks on a block, it focuses the blocks and opens the responsible editors in the left pane (line 791)
	- Keeps track of the user history such that redo and undo actions can carry through their actions by reading from the history and restoring the state of the Sheet 
	- Loading the workspace when the user opens the application
	
*Sheet.java
- Each Sheet has a FlowchartManager
- The Sheet is the unit on which the user creates the flowchart

