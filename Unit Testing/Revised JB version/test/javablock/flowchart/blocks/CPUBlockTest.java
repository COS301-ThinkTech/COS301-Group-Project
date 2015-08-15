/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import javablock.FlowchartManager;
import javablock.flowchart.Flowchart;
import javablock.gui.MainWindow;
import junit.framework.TestCase;

/**
 *
 * @author Hlavutello
 */
public class CPUBlockTest extends TestCase {
    
    public CPUBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of shape method, of class CPUBlock.
     */
    public void testShape() {
        System.out.println(" *** Check creation of CPUBlock");
        
        // Create an instace of CPUBlock
        
        CPUBlock instance = new CPUBlock(new Flowchart(new FlowchartManager(new MainWindow())));        
        
        //instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
