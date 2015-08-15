/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import javablock.flowchart.Flowline;
import javablock.flowchart.JBlock;
import javax.script.ScriptEngine;
import junit.framework.TestCase;
import org.w3c.dom.Element;

/**
 *
 * @author Hlavutello
 */
public class ReturnBlockTest extends TestCase {
    
    public ReturnBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of isSwitchable method, of class ReturnBlock.
     */
    public void testIsSwitchable() {
        System.out.println("isSwitchable");
        ReturnBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isSwitchable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditable method, of class ReturnBlock.
     */
    public void testIsEditable() {
        System.out.println("isEditable");
        ReturnBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isEditable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeCode method, of class ReturnBlock.
     */
    public void testExecuteCode() {
        System.out.println("executeCode");
        ScriptEngine script = null;
        ReturnBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.executeCode(script);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oneOut method, of class ReturnBlock.
     */
    public void testOneOut() {
        System.out.println("oneOut");
        ReturnBlock instance = null;
        boolean expResult = false;
        boolean result = instance.oneOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareText method, of class ReturnBlock.
     */
    public void testPrepareText() {
        System.out.println("prepareText");
        ReturnBlock instance = null;
        instance.prepareText();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScriptFragmentForJavaScript method, of class ReturnBlock.
     */
    public void testGetScriptFragmentForJavaScript() {
        System.out.println("getScriptFragmentForJavaScript");
        ReturnBlock instance = null;
        String expResult = "";
        String result = instance.getScriptFragmentForJavaScript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScriptFragmentForPython method, of class ReturnBlock.
     */
    public void testGetScriptFragmentForPython() {
        System.out.println("getScriptFragmentForPython");
        ReturnBlock instance = null;
        String expResult = "";
        String result = instance.getScriptFragmentForPython();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shape method, of class ReturnBlock.
     */
    public void testShape() {
        System.out.println("shape");
        ReturnBlock instance = null;
        instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectTo method, of class ReturnBlock.
     */
    public void testConnectTo() {
        System.out.println("connectTo");
        JBlock n = null;
        ReturnBlock instance = null;
        Flowline expResult = null;
        Flowline result = instance.connectTo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlSave method, of class ReturnBlock.
     */
    public void testSpecialXmlSave() {
        System.out.println("specialXmlSave");
        Element xml = null;
        ReturnBlock instance = null;
        instance.specialXmlSave(xml);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlLoad method, of class ReturnBlock.
     */
    public void testSpecialXmlLoad() {
        System.out.println("specialXmlLoad");
        Element xml = null;
        boolean connect = false;
        ReturnBlock instance = null;
        instance.specialXmlLoad(xml, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
