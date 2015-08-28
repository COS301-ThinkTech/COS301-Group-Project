/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import javablock.flowchart.BlockEditor;
import javablock.flowchart.JBlock;
import javax.script.ScriptEngine;
import junit.framework.TestCase;
import org.w3c.dom.Element;

/**
 *
 * @author Hlavutello
 */
public class StartBlockTest extends TestCase {
    
    public StartBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of isSwitchable method, of class StartBlock.
     */
    public void testIsSwitchable() {
        System.out.println("isSwitchable");
        StartBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isSwitchable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditable method, of class StartBlock.
     */
    public void testIsEditable() {
        System.out.println("isEditable");
        StartBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isEditable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditor method, of class StartBlock.
     */
    public void testGetEditor() {
        System.out.println("getEditor");
        StartBlock instance = null;
        BlockEditor expResult = null;
        BlockEditor result = instance.getEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canBeConnected method, of class StartBlock.
     */
    public void testCanBeConnected() {
        System.out.println("canBeConnected");
        JBlock b = null;
        StartBlock instance = null;
        boolean expResult = false;
        boolean result = instance.canBeConnected(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of popUpEditor method, of class StartBlock.
     */
    public void testPopUpEditor() {
        System.out.println("popUpEditor");
        StartBlock instance = null;
        boolean expResult = false;
        boolean result = instance.popUpEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeCode method, of class StartBlock.
     */
    public void testExecuteCode() {
        System.out.println("executeCode");
        ScriptEngine script = null;
        StartBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.executeCode(script);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class StartBlock.
     */
    public void testClear() {
        System.out.println("clear");
        StartBlock instance = null;
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addField method, of class StartBlock.
     */
    public void testAddField() {
        System.out.println("addField");
        String name = "";
        String type = "";
        StartBlock instance = null;
        instance.addField(name, type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFields method, of class StartBlock.
     */
    public void testGetFields() {
        System.out.println("getFields");
        StartBlock instance = null;
        String[][] expResult = null;
        String[][] result = instance.getFields();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScriptFragmentForJavaScript method, of class StartBlock.
     */
    public void testGetScriptFragmentForJavaScript() {
        System.out.println("getScriptFragmentForJavaScript");
        StartBlock instance = null;
        String expResult = "";
        String result = instance.getScriptFragmentForJavaScript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateIntro method, of class StartBlock.
     */
    public void testGenerateIntro() {
        System.out.println("generateIntro");
        boolean var = false;
        StartBlock instance = null;
        String expResult = "";
        String result = instance.generateIntro(var);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareText method, of class StartBlock.
     */
    public void testPrepareText() {
        System.out.println("prepareText");
        StartBlock instance = null;
        instance.prepareText();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shape method, of class StartBlock.
     */
    public void testShape() {
        System.out.println("shape");
        StartBlock instance = null;
        instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of capitalize method, of class StartBlock.
     */
    public void testCapitalize() {
        System.out.println("capitalize");
        String s = "";
        String expResult = "";
        String result = StartBlock.capitalize(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlSave method, of class StartBlock.
     */
    public void testSpecialXmlSave() {
        System.out.println("specialXmlSave");
        Element xml = null;
        StartBlock instance = null;
        instance.specialXmlSave(xml);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlLoad method, of class StartBlock.
     */
    public void testSpecialXmlLoad() {
        System.out.println("specialXmlLoad");
        Element xml = null;
        boolean connect = false;
        StartBlock instance = null;
        instance.specialXmlLoad(xml, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
