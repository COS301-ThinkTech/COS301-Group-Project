/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blocks;

import java.awt.geom.Point2D;
import javablock.flowchart.BlockEditor;
import junit.framework.TestCase;
import org.w3c.dom.Element;

/**
 *
 * @author Hlavutello
 */
public class IOBlockTest extends TestCase {
    
    public IOBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of popUpEditor method, of class IOBlock.
     */
    public void testPopUpEditor() {
        System.out.println("popUpEditor");
        IOBlock instance = null;
        boolean expResult = false;
        boolean result = instance.popUpEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditor method, of class IOBlock.
     */
    public void testGetEditor() {
        System.out.println("getEditor");
        IOBlock instance = null;
        BlockEditor expResult = null;
        BlockEditor result = instance.getEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shape method, of class IOBlock.
     */
    public void testShape() {
        System.out.println("shape");
        IOBlock instance = null;
        instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nonCodeBased method, of class IOBlock.
     */
    public void testNonCodeBased() {
        System.out.println("nonCodeBased");
        boolean ncb = false;
        IOBlock instance = null;
        instance.nonCodeBased(ncb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlSave method, of class IOBlock.
     */
    public void testSpecialXmlSave() {
        System.out.println("specialXmlSave");
        Element xml = null;
        IOBlock instance = null;
        instance.specialXmlSave(xml);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlLoad method, of class IOBlock.
     */
    public void testSpecialXmlLoad() {
        System.out.println("specialXmlLoad");
        Element xml = null;
        boolean connect = false;
        IOBlock instance = null;
        instance.specialXmlLoad(xml, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectPoint method, of class IOBlock.
     */
    public void testConnectPoint() {
        System.out.println("connectPoint");
        float angle = 0.0F;
        IOBlock instance = null;
        Point2D expResult = null;
        Point2D result = instance.connectPoint(angle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
