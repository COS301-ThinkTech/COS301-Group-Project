/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.Color;
import java.awt.Graphics2D;
import javablock.flowchart.JBlock;
import javax.script.ScriptEngine;
import junit.framework.TestCase;
import org.w3c.dom.Element;

/**
 *
 * @author Hlavutello
 */
public class LinkBlockTest extends TestCase {
    
    public LinkBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of isSwitchable method, of class LinkBlock.
     */
    public void testIsSwitchable() {
        System.out.println("isSwitchable");
        LinkBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isSwitchable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addedToScene method, of class LinkBlock.
     */
    public void testAddedToScene() {
        System.out.println("addedToScene");
        LinkBlock instance = null;
        instance.addedToScene();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oneOut method, of class LinkBlock.
     */
    public void testOneOut() {
        System.out.println("oneOut");
        LinkBlock instance = null;
        boolean expResult = false;
        boolean result = instance.oneOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveWhenAdded method, of class LinkBlock.
     */
    public void testMoveWhenAdded() {
        System.out.println("moveWhenAdded");
        LinkBlock instance = null;
        boolean expResult = false;
        boolean result = instance.moveWhenAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class LinkBlock.
     */
    public void testDelete() {
        System.out.println("delete");
        LinkBlock instance = null;
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shape method, of class LinkBlock.
     */
    public void testShape() {
        System.out.println("shape");
        LinkBlock instance = null;
        instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class LinkBlock.
     */
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g2d = null;
        LinkBlock instance = null;
        instance.draw(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawSelection method, of class LinkBlock.
     */
    public void testDrawSelection() {
        System.out.println("drawSelection");
        Graphics2D g2d = null;
        LinkBlock instance = null;
        instance.drawSelection(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareToExe method, of class LinkBlock.
     */
    public void testPrepareToExe() {
        System.out.println("prepareToExe");
        LinkBlock instance = null;
        instance.prepareToExe();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextExe method, of class LinkBlock.
     */
    public void testNextExe() {
        System.out.println("nextExe");
        LinkBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.nextExe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeCode method, of class LinkBlock.
     */
    public void testExecuteCode() {
        System.out.println("executeCode");
        ScriptEngine script = null;
        LinkBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.executeCode(script);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class LinkBlock.
     */
    public void testExecute() {
        System.out.println("execute");
        ScriptEngine script = null;
        boolean highlight = false;
        LinkBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.execute(script, highlight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class LinkBlock.
     */
    public void testSetColor() {
        System.out.println("setColor");
        Color c = null;
        LinkBlock instance = null;
        instance.setColor(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode method, of class LinkBlock.
     */
    public void testSetCode() {
        System.out.println("setCode");
        String c = "";
        LinkBlock instance = null;
        instance.setCode(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlSave method, of class LinkBlock.
     */
    public void testSpecialXmlSave() {
        System.out.println("specialXmlSave");
        Element xml = null;
        LinkBlock instance = null;
        instance.specialXmlSave(xml);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlLoad method, of class LinkBlock.
     */
    public void testSpecialXmlLoad() {
        System.out.println("specialXmlLoad");
        Element xml = null;
        boolean connect = false;
        LinkBlock instance = null;
        instance.specialXmlLoad(xml, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
