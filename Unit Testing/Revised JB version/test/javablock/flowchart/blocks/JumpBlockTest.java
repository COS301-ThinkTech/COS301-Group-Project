/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javablock.flowchart.Flowline;
import javablock.flowchart.JBlock;
import javax.script.ScriptEngine;
import junit.framework.TestCase;

/**
 *
 * @author Hlavutello
 */
public class JumpBlockTest extends TestCase {
    
    public JumpBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of isEditable method, of class JumpBlock.
     */
    public void testIsEditable() {
        System.out.println("isEditable");
        JumpBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isEditable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeCode method, of class JumpBlock.
     */
    public void testExecuteCode() {
        System.out.println("executeCode");
        ScriptEngine script = null;
        JumpBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.executeCode(script);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addedToScene method, of class JumpBlock.
     */
    public void testAddedToScene() {
        System.out.println("addedToScene");
        JumpBlock instance = null;
        instance.addedToScene();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shape method, of class JumpBlock.
     */
    public void testShape() {
        System.out.println("shape");
        JumpBlock instance = null;
        instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class JumpBlock.
     */
    public void testUpdate() {
        System.out.println("update");
        JumpBlock instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of needDraw method, of class JumpBlock.
     */
    public void testNeedDraw() {
        System.out.println("needDraw");
        boolean n = false;
        JumpBlock instance = null;
        boolean expResult = false;
        boolean result = instance.needDraw(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class JumpBlock.
     */
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g2d = null;
        boolean n = false;
        JumpBlock instance = null;
        instance.draw(g2d, n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of highLight method, of class JumpBlock.
     */
    public void testHighLight() {
        System.out.println("highLight");
        Graphics2D g2d = null;
        JumpBlock instance = null;
        boolean expResult = false;
        boolean result = instance.highLight(g2d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawShadow method, of class JumpBlock.
     */
    public void testDrawShadow() {
        System.out.println("drawShadow");
        Graphics2D g2d = null;
        JumpBlock instance = null;
        instance.drawShadow(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextExe method, of class JumpBlock.
     */
    public void testNextExe() {
        System.out.println("nextExe");
        JumpBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.nextExe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextBlock method, of class JumpBlock.
     */
    public void testNextBlock() {
        System.out.println("nextBlock");
        JumpBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.nextBlock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectPoint method, of class JumpBlock.
     */
    public void testConnectPoint() {
        System.out.println("connectPoint");
        float angle = 0.0F;
        JumpBlock instance = null;
        Point2D expResult = null;
        Point2D result = instance.connectPoint(angle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class JumpBlock.
     */
    public void testContains() {
        System.out.println("contains");
        double x = 0.0;
        double y = 0.0;
        JumpBlock instance = null;
        boolean expResult = false;
        boolean result = instance.contains(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawArrow method, of class JumpBlock.
     */
    public void testDrawArrow_0args() {
        System.out.println("drawArrow");
        JumpBlock instance = null;
        boolean expResult = false;
        boolean result = instance.drawArrow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawArrow method, of class JumpBlock.
     */
    public void testDrawArrow_Flowline() {
        System.out.println("drawArrow");
        Flowline c = null;
        JumpBlock instance = null;
        boolean expResult = false;
        boolean result = instance.drawArrow(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
