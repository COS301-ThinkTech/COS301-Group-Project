/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.Graphics2D;
import javablock.flowchart.BlockEditor;
import javablock.flowchart.Flowline;
import javablock.flowchart.JBlock;
import javax.script.ScriptEngine;
import junit.framework.TestCase;

/**
 *
 * @author Hlavutello
 */
public class DecisionBlockTest extends TestCase {
    
    public DecisionBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of isSwitchable method, of class DecisionBlock.
     */
    public void testIsSwitchable() {
        System.out.println("isSwitchable");
        DecisionBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isSwitchable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditor method, of class DecisionBlock.
     */
    public void testGetEditor() {
        System.out.println("getEditor");
        DecisionBlock instance = null;
        BlockEditor expResult = null;
        BlockEditor result = instance.getEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectTo method, of class DecisionBlock.
     */
    public void testConnectTo() {
        System.out.println("connectTo");
        JBlock n = null;
        DecisionBlock instance = null;
        Flowline expResult = null;
        Flowline result = instance.connectTo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeCode method, of class DecisionBlock.
     */
    public void testExecuteCode() {
        System.out.println("executeCode");
        ScriptEngine script = null;
        DecisionBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.executeCode(script);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextCon method, of class DecisionBlock.
     */
    public void testNextCon() {
        System.out.println("nextCon");
        String con = "";
        DecisionBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.nextCon(con);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScriptFragmentForJavaScript method, of class DecisionBlock.
     */
    public void testGetScriptFragmentForJavaScript() {
        System.out.println("getScriptFragmentForJavaScript");
        DecisionBlock instance = null;
        String expResult = "";
        String result = instance.getScriptFragmentForJavaScript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shape method, of class DecisionBlock.
     */
    public void testShape() {
        System.out.println("shape");
        DecisionBlock instance = null;
        instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of labelStyle method, of class DecisionBlock.
     */
    public void testLabelStyle() {
        System.out.println("labelStyle");
        DecisionBlock instance = null;
        String expResult = "";
        String result = instance.labelStyle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawText method, of class DecisionBlock.
     */
    public void testDrawText() {
        System.out.println("drawText");
        Graphics2D g2d = null;
        DecisionBlock instance = null;
        instance.drawText(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class DecisionBlock.
     */
    public void testClear() {
        System.out.println("clear");
        DecisionBlock instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addComparison method, of class DecisionBlock.
     */
    public void testAddComparison() {
        System.out.println("addComparison");
        String variable1 = "";
        String variable2 = "";
        DecisionBlock instance = null;
        instance.addComparison(variable1, variable2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComparisons method, of class DecisionBlock.
     */
    public void testGetComparisons() {
        System.out.println("getComparisons");
        DecisionBlock instance = null;
        String[][] expResult = null;
        String[][] result = instance.getComparisons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
