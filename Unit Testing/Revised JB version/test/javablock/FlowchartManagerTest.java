/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock;

import java.awt.event.ActionEvent;
import java.io.File;
import javablock.flowchart.Flowchart;
import javablock.flowchart.JBlock;
import javablock.gui.Interpreter;
import javablock.gui.ScriptRunner;
import static junit.framework.Assert.*;
import junit.framework.TestCase;

/**
 *
 * @author Hlavutello
 */
public class FlowchartManagerTest extends TestCase {
    
    public FlowchartManagerTest(String testName) {
        super(testName);
    }

    /**
     * Test of close method, of class FlowchartManager.
     */
    public void testClose() {
        System.out.println("close");
        FlowchartManager instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasRunner method, of class FlowchartManager.
     */
    public void testHasRunner() {
        System.out.println("hasRunner");
        ScriptRunner r = null;
        FlowchartManager instance = null;
        boolean expResult = false;
        boolean result = instance.hasRunner(r);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveExit method, of class FlowchartManager.
     */
    public void testSaveExit() {
        System.out.println("saveExit");
        FlowchartManager instance = null;
        int expResult = 0;
        int result = instance.saveExit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveClose method, of class FlowchartManager.
     */
    public void testSaveClose() {
        System.out.println("saveClose");
        FlowchartManager instance = null;
        int expResult = 0;
        int result = instance.saveClose();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadLast method, of class FlowchartManager.
     */
    public void testLoadLast() {
        System.out.println("loadLast");
        FlowchartManager instance = null;
        instance.loadLast();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeUI method, of class FlowchartManager.
     */
    public void testMakeUI() {
        System.out.println("makeUI");
        boolean floated = false;
        FlowchartManager instance = null;
        instance.makeUI(floated);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInterpreter method, of class FlowchartManager.
     */
    public void testSetInterpreter() {
        System.out.println("setInterpreter");
        Interpreter set = null;
        FlowchartManager instance = null;
        instance.setInterpreter(set);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActiveSheet method, of class FlowchartManager.
     */
    public void testSetActiveSheet() {
        System.out.println("setActiveSheet");
        Sheet f = null;
        FlowchartManager instance = null;
        instance.setActiveSheet(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newFileChooser method, of class FlowchartManager.
     */
    public void testNewFileChooser() {
        System.out.println("newFileChooser");
        FlowchartManager instance = null;
        instance.newFileChooser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of New method, of class FlowchartManager.
     */
    public void testNew_0args() {
        System.out.println("New");
        FlowchartManager instance = null;
        instance.New();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of New method, of class FlowchartManager.
     */
    public void testNew_String() {
        System.out.println("New");
        String type = "";
        FlowchartManager instance = null;
        instance.New(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFlowchart method, of class FlowchartManager.
     */
    public void testAddFlowchart() {
        System.out.println("addFlowchart");
        FlowchartManager instance = null;
        instance.addFlowchart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFlowchart method, of class FlowchartManager.
     */
    public void testRemoveFlowchart() {
        System.out.println("removeFlowchart");
        FlowchartManager instance = null;
        instance.removeFlowchart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of renameFlowchart method, of class FlowchartManager.
     */
    public void testRenameFlowchart() {
        System.out.println("renameFlowchart");
        Flowchart fl = null;
        FlowchartManager instance = null;
        instance.renameFlowchart(fl);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class FlowchartManager.
     */
    public void testCopy() {
        System.out.println("copy");
        FlowchartManager instance = null;
        instance.copy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cut method, of class FlowchartManager.
     */
    public void testCut() {
        System.out.println("cut");
        FlowchartManager instance = null;
        instance.cut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paste method, of class FlowchartManager.
     */
    public void testPaste() {
        System.out.println("paste");
        FlowchartManager instance = null;
        instance.paste();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewBySelected method, of class FlowchartManager.
     */
    public void testAddNewBySelected() {
        System.out.println("addNewBySelected");
        FlowchartManager instance = null;
        JBlock expResult = null;
        JBlock result = instance.addNewBySelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historyAdd method, of class FlowchartManager.
     */
    public void testHistoryAdd() {
        System.out.println("historyAdd");
        FlowchartManager instance = null;
        instance.historyAdd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historyUndo method, of class FlowchartManager.
     */
    public void testHistoryUndo() {
        System.out.println("historyUndo");
        FlowchartManager instance = null;
        instance.historyUndo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historyRedo method, of class FlowchartManager.
     */
    public void testHistoryRedo() {
        System.out.println("historyRedo");
        FlowchartManager instance = null;
        instance.historyRedo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historyClear method, of class FlowchartManager.
     */
    public void testHistoryClear() {
        System.out.println("historyClear");
        FlowchartManager instance = null;
        instance.historyClear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelMoving method, of class FlowchartManager.
     */
    public void testCancelMoving() {
        System.out.println("cancelMoving");
        FlowchartManager instance = null;
        instance.cancelMoving();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAsImages method, of class FlowchartManager.
     */
    public void testSaveAsImages() {
        System.out.println("saveAsImages");
        String url = "";
        String name = "";
        FlowchartManager instance = null;
        instance.saveAsImages(url, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFileAs method, of class FlowchartManager.
     */
    public void testSaveFileAs() {
        System.out.println("saveFileAs");
        FlowchartManager instance = null;
        instance.saveFileAs();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFile method, of class FlowchartManager.
     */
    public void testSaveFile_0args() {
        System.out.println("saveFile");
        FlowchartManager instance = null;
        instance.saveFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveFile method, of class FlowchartManager.
     */
    public void testSaveFile_boolean() {
        System.out.println("saveFile");
        boolean exp = false;
        FlowchartManager instance = null;
        instance.saveFile(exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFile method, of class FlowchartManager.
     */
    public void testLoadFile_0args() {
        System.out.println("Testing loadFile() method ********* Loadflowchart");
        FlowchartManager instance = null;
        int expResult = 0;
        int result = instance.loadFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFile method, of class FlowchartManager.
     */
    public void testLoadFile_boolean() {
        System.out.println("loadFile");
        boolean imp = false;
        FlowchartManager instance = null;
        int expResult = 0;
        int result = instance.loadFile(imp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadFile method, of class FlowchartManager.
     */
    public void testLoadFile_String() {
        System.out.println("loadFile ********* with file name");
        FlowchartManager instance = null;
        //assertTrue(instance.loadFile("Last.jbf"), true);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of saveXml method, of class FlowchartManager.
     */
    public void testSaveXml() {
        System.out.println("saveXml");
        FlowchartManager instance = null;
        String expResult = "";
        String result = instance.saveXml();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadHistoryXml method, of class FlowchartManager.
     */
    public void testLoadHistoryXml() {
        System.out.println("loadHistoryXml");
        String in = "";
        FlowchartManager instance = null;
        instance.loadHistoryXml(in);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadXml method, of class FlowchartManager.
     */
    public void testLoadXml_String() {
        System.out.println("loadXml");
        String in = "";
        FlowchartManager instance = null;
        boolean expResult = false;
        boolean result = instance.loadXml(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadXml method, of class FlowchartManager.
     */
    public void testLoadXml_File() {
        System.out.println("loadXml");
        File in = null;
        FlowchartManager instance = null;
        boolean expResult = false;
        boolean result = instance.loadXml(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zoom method, of class FlowchartManager.
     */
    public void testZoom() {
        System.out.println("zoom");
        int value = 0;
        FlowchartManager instance = null;
        instance.zoom(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFocus method, of class FlowchartManager.
     */
    public void testUpdateFocus() {
        System.out.println("updateFocus");
        FlowchartManager instance = null;
        instance.updateFocus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectedBlock method, of class FlowchartManager.
     */
    public void testSelectedBlock() {
        System.out.println("selectedBlock");
        Sheet f = null;
        FlowchartManager instance = null;
        instance.selectedBlock(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class FlowchartManager.
     */
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        FlowchartManager instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
