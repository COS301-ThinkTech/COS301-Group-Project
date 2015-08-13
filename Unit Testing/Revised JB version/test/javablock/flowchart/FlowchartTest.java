/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.util.List;
import javablock.gui.ScriptRunner;
import junit.framework.TestCase;
import org.w3c.dom.Element;

/**
 *
 * @author Hlavutello
 */
public class FlowchartTest extends TestCase {
    
    public FlowchartTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of close method, of class Flowchart.
     */
    public void testClose() {
        System.out.println("close");
        Flowchart instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Flowchart.
     */
    public void testDelete() {
        System.out.println("delete");
        Flowchart instance = null;
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class Flowchart.
     */
    public void testFinalize() {
        System.out.println("finalize");
        Flowchart instance = null;
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRunner method, of class Flowchart.
     */
    public void testGetRunner() {
        System.out.println("getRunner");
        Flowchart instance = null;
        ScriptRunner expResult = null;
        ScriptRunner result = instance.getRunner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Flowchart.
     */
    public void testGetName() {
        System.out.println("getName");
        Flowchart instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of optimizeID method, of class Flowchart.
     */
    public void testOptimizeID() {
        System.out.println("optimizeID");
        Flowchart instance = null;
        instance.optimizeID();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of groupsUpdate method, of class Flowchart.
     */
    public void testGroupsUpdate() {
        System.out.println("groupsUpdate");
        Flowchart instance = null;
        instance.groupsUpdate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectBlock method, of class Flowchart.
     */
    public void testSelectBlock() {
        System.out.println("selectBlock");
        JBlock toSelect = null;
        Flowchart instance = null;
        instance.selectBlock(toSelect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseXml method, of class Flowchart.
     */
    public void testParseXml() {
        System.out.println("parseXml");
        Element f = null;
        Flowchart instance = null;
        instance.parseXml(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveXml method, of class Flowchart.
     */
    public void testSaveXml() {
        System.out.println("saveXml");
        Element root = null;
        Flowchart instance = null;
        instance.saveXml(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBlockById method, of class Flowchart.
     */
    public void testGetBlockById() {
        System.out.println("getBlockById");
        int id = 0;
        Flowchart instance = null;
        JBlock expResult = null;
        JBlock result = instance.getBlockById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupById method, of class Flowchart.
     */
    public void testGetGroupById() {
        System.out.println("getGroupById");
        int id = 0;
        Flowchart instance = null;
        JBlock expResult = null;
        JBlock result = instance.getGroupById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of blockAt method, of class Flowchart.
     */
    public void testBlockAt() {
        System.out.println("blockAt");
        float x = 0.0F;
        float y = 0.0F;
        Flowchart instance = null;
        JBlock expResult = null;
        JBlock result = instance.blockAt(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArgumentsList method, of class Flowchart.
     */
    public void testGetArgumentsList() {
        System.out.println("getArgumentsList");
        Flowchart instance = null;
        String[] expResult = null;
        String[] result = instance.getArgumentsList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArgumentsTypes method, of class Flowchart.
     */
    public void testGetArgumentsTypes() {
        System.out.println("getArgumentsTypes");
        Flowchart instance = null;
        String[] expResult = null;
        String[] result = instance.getArgumentsTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSignature method, of class Flowchart.
     */
    public void testGetSignature() {
        System.out.println("getSignature");
        Flowchart instance = null;
        String expResult = "";
        String result = instance.getSignature();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPredefiniedArguments method, of class Flowchart.
     */
    public void testGetPredefiniedArguments() {
        System.out.println("getPredefiniedArguments");
        Flowchart instance = null;
        String[] expResult = null;
        String[] result = instance.getPredefiniedArguments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeJavaScript method, of class Flowchart.
     */
    public void testMakeJavaScript() {
        System.out.println("makeJavaScript");
        Flowchart instance = null;
        String expResult = "";
        String result = instance.makeJavaScript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makePythonScript method, of class Flowchart.
     */
    public void testMakePythonScript() {
        System.out.println("makePythonScript");
        Flowchart instance = null;
        String expResult = "";
        String result = instance.makePythonScript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makePythonFunctions method, of class Flowchart.
     */
    public void testMakePythonFunctions() {
        System.out.println("makePythonFunctions");
        Flowchart instance = null;
        String expResult = "";
        String result = instance.makePythonFunctions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawGrid method, of class Flowchart.
     */
    public void testDrawGrid() {
        System.out.println("drawGrid");
        Graphics2D g2d = null;
        Flowchart instance = null;
        instance.drawGrid(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canvasScan method, of class Flowchart.
     */
    public void testCanvasScan() {
        System.out.println("canvasScan");
        Flowchart instance = null;
        instance.canvasScan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImageSrc method, of class Flowchart.
     */
    public void testDrawImageSrc() {
        System.out.println("drawImageSrc");
        Flowchart instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.drawImageSrc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawForImage method, of class Flowchart.
     */
    public void testDrawForImage() {
        System.out.println("drawForImage");
        Graphics2D g2d = null;
        Flowchart instance = null;
        instance.drawForImage(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAsImage method, of class Flowchart.
     */
    public void testSaveAsImage_String_String() {
        System.out.println("saveAsImage");
        String url = "";
        String docName = "";
        Flowchart instance = null;
        instance.saveAsImage(url, docName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveAsImage method, of class Flowchart.
     */
    public void testSaveAsImage_0args() {
        System.out.println("saveAsImage");
        Flowchart instance = null;
        instance.saveAsImage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Flowchart.
     */
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g2d = null;
        Flowchart instance = null;
        instance.draw(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateScrolls method, of class Flowchart.
     */
    public void testUpdateScrolls() {
        System.out.println("updateScrolls");
        Flowchart instance = null;
        instance.updateScrolls();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintFlow method, of class Flowchart.
     */
    public void testPaintFlow() {
        System.out.println("paintFlow");
        Graphics2D g2 = null;
        Flowchart instance = null;
        instance.paintFlow(g2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditable method, of class Flowchart.
     */
    public void testSetEditable() {
        System.out.println("setEditable");
        boolean editing = false;
        Flowchart instance = null;
        instance.setEditable(editing);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of historyAdd method, of class Flowchart.
     */
    public void testHistoryAdd() {
        System.out.println("historyAdd");
        Flowchart instance = null;
        instance.historyAdd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseClicked method, of class Flowchart.
     */
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        Flowchart instance = null;
        instance.mouseClicked(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mousePressed method, of class Flowchart.
     */
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        Flowchart instance = null;
        instance.mousePressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseReleased method, of class Flowchart.
     */
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        Flowchart instance = null;
        instance.mouseReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseEntered method, of class Flowchart.
     */
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        Flowchart instance = null;
        instance.mouseEntered(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseExited method, of class Flowchart.
     */
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        Flowchart instance = null;
        instance.mouseExited(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseDragged method, of class Flowchart.
     */
    public void testMouseDragged() {
        System.out.println("mouseDragged");
        MouseEvent e = null;
        Flowchart instance = null;
        instance.mouseDragged(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseMoved method, of class Flowchart.
     */
    public void testMouseMoved() {
        System.out.println("mouseMoved");
        MouseEvent e = null;
        Flowchart instance = null;
        instance.mouseMoved(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelMoving method, of class Flowchart.
     */
    public void testCancelMoving() {
        System.out.println("cancelMoving");
        Flowchart instance = null;
        instance.cancelMoving();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Flowchart.
     */
    public void testUpdate() {
        System.out.println("update");
        Flowchart instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBgColor method, of class Flowchart.
     */
    public void testSetBgColor() {
        System.out.println("setBgColor");
        Color c = null;
        Flowchart instance = null;
        instance.setBgColor(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyTyped method, of class Flowchart.
     */
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        Flowchart instance = null;
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class Flowchart.
     */
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        Flowchart instance = null;
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class Flowchart.
     */
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        Flowchart instance = null;
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseWheelMoved method, of class Flowchart.
     */
    public void testMouseWheelMoved() {
        System.out.println("mouseWheelMoved");
        MouseWheelEvent e = null;
        Flowchart instance = null;
        instance.mouseWheelMoved(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zoomOut method, of class Flowchart.
     */
    public void testZoomOut() {
        System.out.println("zoomOut");
        Point2D[] t = null;
        Flowchart instance = null;
        instance.zoomOut(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of zoomIn method, of class Flowchart.
     */
    public void testZoomIn() {
        System.out.println("zoomIn");
        Point2D[] t = null;
        Flowchart instance = null;
        instance.zoomIn(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scale method, of class Flowchart.
     */
    public void testScale() {
        System.out.println("scale");
        Flowchart instance = null;
        double expResult = 0.0;
        double result = instance.scale();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of componentResized method, of class Flowchart.
     */
    public void testComponentResized() {
        System.out.println("componentResized");
        ComponentEvent e = null;
        Flowchart instance = null;
        instance.componentResized(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of componentMoved method, of class Flowchart.
     */
    public void testComponentMoved() {
        System.out.println("componentMoved");
        ComponentEvent e = null;
        Flowchart instance = null;
        instance.componentMoved(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of componentShown method, of class Flowchart.
     */
    public void testComponentShown() {
        System.out.println("componentShown");
        ComponentEvent e = null;
        Flowchart instance = null;
        instance.componentShown(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of componentHidden method, of class Flowchart.
     */
    public void testComponentHidden() {
        System.out.println("componentHidden");
        ComponentEvent e = null;
        Flowchart instance = null;
        instance.componentHidden(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Flowchart.
     */
    public void testToString() {
        System.out.println("toString");
        Flowchart instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBlock method, of class Flowchart.
     */
    public void testAddBlock_String() {
        System.out.println("addBlock");
        String type = "";
        Flowchart instance = null;
        JBlock expResult = null;
        JBlock result = instance.addBlock(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBlock method, of class Flowchart.
     */
    public void testAddBlock_String_boolean() {
        System.out.println("addBlock");
        String type = "";
        boolean connect = false;
        Flowchart instance = null;
        JBlock expResult = null;
        JBlock result = instance.addBlock(type, connect);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNonCodeBlock method, of class Flowchart.
     */
    public void testAddNonCodeBlock() {
        System.out.println("addNonCodeBlock");
        String type = "";
        Flowchart instance = null;
        JBlock expResult = null;
        JBlock result = instance.addNonCodeBlock(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBlocksGroup method, of class Flowchart.
     */
    public void testAddBlocksGroup() {
        System.out.println("addBlocksGroup");
        JBlock[] list = null;
        Flowchart instance = null;
        instance.addBlocksGroup(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBlock method, of class Flowchart.
     */
    public void testAddBlock_JBlock() {
        System.out.println("addBlock");
        JBlock n = null;
        Flowchart instance = null;
        instance.addBlock(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBlock method, of class Flowchart.
     */
    public void testAddBlock_JBlock_boolean() {
        System.out.println("addBlock");
        JBlock n = null;
        boolean connect = false;
        Flowchart instance = null;
        instance.addBlock(n, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of align method, of class Flowchart.
     */
    public void testAlign() {
        System.out.println("align");
        String t = "";
        Flowchart instance = null;
        instance.align(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteSelectedBlocks method, of class Flowchart.
     */
    public void testDeleteSelectedBlocks() {
        System.out.println("deleteSelectedBlocks");
        Flowchart instance = null;
        instance.deleteSelectedBlocks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Flowchart.
     */
    public void testSetColor() {
        System.out.println("setColor");
        Color col = null;
        int mode = 0;
        Flowchart instance = null;
        instance.setColor(col, mode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteConnections method, of class Flowchart.
     */
    public void testDeleteConnections() {
        System.out.println("deleteConnections");
        String w = "";
        Flowchart instance = null;
        instance.deleteConnections(w);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveUp method, of class Flowchart.
     */
    public void testMoveUp() {
        System.out.println("moveUp");
        Flowchart instance = null;
        instance.moveUp();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveDown method, of class Flowchart.
     */
    public void testMoveDown() {
        System.out.println("moveDown");
        Flowchart instance = null;
        instance.moveDown();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Flowchart.
     */
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Flowchart instance = null;
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Flowchart.
     */
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Flowchart instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class Flowchart.
     */
    public void testGetSelected() {
        System.out.println("getSelected");
        Flowchart instance = null;
        List<JBlock> expResult = null;
        List<JBlock> result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBlocks method, of class Flowchart.
     */
    public void testGetBlocks() {
        System.out.println("getBlocks");
        Flowchart instance = null;
        List<JBlock> expResult = null;
        List<JBlock> result = instance.getBlocks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copy method, of class Flowchart.
     */
    public void testCopy() {
        System.out.println("copy");
        Flowchart instance = null;
        instance.copy();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cut method, of class Flowchart.
     */
    public void testCut() {
        System.out.println("cut");
        Flowchart instance = null;
        instance.cut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paste method, of class Flowchart.
     */
    public void testPaste() {
        System.out.println("paste");
        Flowchart instance = null;
        instance.paste();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeJavaScriptFunctions method, of class Flowchart.
     */
    public void testMakeJavaScriptFunctions() {
        System.out.println("makeJavaScriptFunctions");
        Flowchart instance = null;
        String expResult = "";
        String result = instance.makeJavaScriptFunctions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of genId method, of class Flowchart.
     */
    public void testGenId() {
        System.out.println("genId");
        Flowchart instance = null;
        long expResult = 0L;
        long result = instance.genId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
