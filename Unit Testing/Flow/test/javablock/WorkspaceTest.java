/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock;

import java.util.List;
import javax.swing.JComponent;
import junit.framework.TestCase;

/**
 *
 * @author Hlavutello
 */
public class WorkspaceTest extends TestCase {
    
    public WorkspaceTest(String testName) {
        super(testName);
    }

    /**
     * Test of addSheet method, of class Workspace.
     */
    public void testAddSheet() {
        System.out.println("addSheet");
        Sheet add = null;
        Workspace instance = null;
        Boolean expResult = null;
        Boolean result = instance.addSheet(add);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeSheet method, of class Workspace.
     */
    public void testRemoveSheet() {
        System.out.println("removeSheet");
        Sheet rem = null;
        Workspace instance = null;
        instance.removeSheet(rem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeAll method, of class Workspace.
     */
    public void testRemoveAll() {
        System.out.println("removeAll");
        Workspace instance = null;
        instance.removeAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActive method, of class Workspace.
     */
    public void testGetActive() {
        System.out.println("getActive");
        Workspace instance = null;
        Sheet expResult = null;
        Sheet result = instance.getActive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActive method, of class Workspace.
     */
    public void testSetActive() {
        System.out.println("setActive");
        String name = "";
        Workspace instance = null;
        instance.setActive(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renameSheetName method, of class Workspace.
     */
    public void testRenameSheetName() {
        System.out.println("renameSheetName");
        String newName = "";
        Sheet sheet = null;
        Workspace instance = null;
        instance.renameSheetName(newName, sheet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSheets method, of class Workspace.
     */
    public void testGetSheets() {
        System.out.println("getSheets");
        Workspace instance = null;
        List<Sheet> expResult = null;
        List<Sheet> result = instance.getSheets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSheetList method, of class Workspace.
     */
    public void testSetSheetList() {
        System.out.println("setSheetList");
        List<Sheet> list = null;
        Workspace instance = null;
        instance.setSheetList(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComponent method, of class Workspace.
     */
    public void testGetComponent() {
        System.out.println("getComponent");
        Workspace instance = null;
        JComponent expResult = null;
        JComponent result = instance.getComponent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
