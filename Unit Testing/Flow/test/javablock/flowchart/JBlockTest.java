/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javablock.FlowchartManager;
import javax.script.ScriptEngine;
import junit.framework.TestCase;
import org.w3c.dom.Element;

/**
 *
 * @author Hlavutello
 */
public class JBlockTest extends TestCase {
    
    public JBlockTest(String testName) {
        super(testName);
    }

    /**
     * Test of getCustomTypes method, of class JBlock.
     */
    public void testGetCustomTypes() {
        System.out.println("getCustomTypes");
        ArrayList<Class<JBlock>> expResult = null;
        ArrayList<Class<JBlock>> result = JBlock.getCustomTypes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomType method, of class JBlock.
     */
    public void testAddCustomType() {
        System.out.println("addCustomType");
        Class newType = null;
        String name = "";
        JBlock.addCustomType(newType, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeFromString method, of class JBlock.
     */
    public void testGetTypeFromString() {
        System.out.println("getTypeFromString");
        String type = "";
        JBlock.Type expResult = null;
        JBlock.Type result = JBlock.getTypeFromString(type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeftLine method, of class JBlock.
     */
    public void testGetLeftLine() {
        System.out.println("getLeftLine");
        String[] expResult = null;
        String[] result = JBlock.getLeftLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRightLine method, of class JBlock.
     */
    public void testGetRightLine() {
        System.out.println("getRightLine");
        String[] expResult = null;
        String[] result = JBlock.getRightLine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class JBlock.
     */
    public void testGetType() {
        System.out.println("getType");
        JBlock instance = null;
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class JBlock.
     */
    public void testMake_3args_1() {
        System.out.println("make");
        String t = "";
        boolean codeBased = false;
        Flowchart parent = null;
        JBlock expResult = null;
        JBlock result = JBlock.make(t, codeBased, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeCustom method, of class JBlock.
     */
    public void testMakeCustom() {
        System.out.println("makeCustom");
        String type = "";
        Flowchart parent = null;
        JBlock expResult = null;
        JBlock result = JBlock.makeCustom(type, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class JBlock.
     */
    public void testMake_3args_2() {
        System.out.println("make");
        JBlock.Type type = null;
        boolean codeBased = false;
        Flowchart parent = null;
        JBlock expResult = null;
        JBlock result = JBlock.make(type, codeBased, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class JBlock.
     */
    public void testMake_JBlockType_Flowchart() {
        System.out.println("make");
        JBlock.Type type = null;
        Flowchart parent = null;
        JBlock expResult = null;
        JBlock result = JBlock.make(type, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class JBlock.
     */
    public void testMake_String_Flowchart() {
        System.out.println("make");
        String t = "";
        Flowchart parent = null;
        JBlock expResult = null;
        JBlock result = JBlock.make(t, parent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addedToScene method, of class JBlock.
     */
    public void testAddedToScene() {
        System.out.println("addedToScene");
        JBlock instance = null;
        instance.addedToScene();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nonCodeBased method, of class JBlock.
     */
    public void testNonCodeBased() {
        System.out.println("nonCodeBased");
        boolean ncb = false;
        JBlock instance = null;
        instance.nonCodeBased(ncb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getManager method, of class JBlock.
     */
    public void testGetManager() {
        System.out.println("getManager");
        JBlock instance = null;
        FlowchartManager expResult = null;
        FlowchartManager result = instance.getManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEditable method, of class JBlock.
     */
    public void testIsEditable() {
        System.out.println("isEditable");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isEditable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSwitchable method, of class JBlock.
     */
    public void testIsSwitchable() {
        System.out.println("isSwitchable");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isSwitchable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canBeConnected method, of class JBlock.
     */
    public void testCanBeConnected() {
        System.out.println("canBeConnected");
        JBlock b = null;
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.canBeConnected(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of oneOut method, of class JBlock.
     */
    public void testOneOut() {
        System.out.println("oneOut");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.oneOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of popUpEditor method, of class JBlock.
     */
    public void testPopUpEditor() {
        System.out.println("popUpEditor");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.popUpEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDefinitionBlock method, of class JBlock.
     */
    public void testIsDefinitionBlock() {
        System.out.println("isDefinitionBlock");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isDefinitionBlock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditor method, of class JBlock.
     */
    public void testGetEditor() {
        System.out.println("getEditor");
        JBlock instance = null;
        BlockEditor expResult = null;
        BlockEditor result = instance.getEditor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveWhenAdded method, of class JBlock.
     */
    public void testMoveWhenAdded() {
        System.out.println("moveWhenAdded");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.moveWhenAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectTo method, of class JBlock.
     */
    public void testConnectTo() {
        System.out.println("connectTo");
        JBlock n = null;
        JBlock instance = null;
        Flowline expResult = null;
        Flowline result = instance.connectTo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reverseValues method, of class JBlock.
     */
    public void testReverseValues() {
        System.out.println("reverseValues");
        JBlock instance = null;
        instance.reverseValues();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeInConnects method, of class JBlock.
     */
    public void testRemoveInConnects() {
        System.out.println("removeInConnects");
        JBlock instance = null;
        instance.removeInConnects();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeOutConnects method, of class JBlock.
     */
    public void testRemoveOutConnects() {
        System.out.println("removeOutConnects");
        JBlock instance = null;
        instance.removeOutConnects();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addInConnect method, of class JBlock.
     */
    public void testAddInConnect() {
        System.out.println("addInConnect");
        Flowline c = null;
        JBlock instance = null;
        instance.addInConnect(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConnectFrom method, of class JBlock.
     */
    public void testRemoveConnectFrom() {
        System.out.println("removeConnectFrom");
        JBlock b = null;
        JBlock instance = null;
        instance.removeConnectFrom(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConnectTo method, of class JBlock.
     */
    public void testRemoveConnectTo() {
        System.out.println("removeConnectTo");
        JBlock b = null;
        JBlock instance = null;
        instance.removeConnectTo(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConnectWith method, of class JBlock.
     */
    public void testRemoveConnectWith() {
        System.out.println("removeConnectWith");
        JBlock b = null;
        JBlock instance = null;
        instance.removeConnectWith(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class JBlock.
     */
    public void testDelete() {
        System.out.println("delete");
        JBlock instance = null;
        instance.delete();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalize method, of class JBlock.
     */
    public void testFinalize() {
        System.out.println("finalize");
        JBlock instance = null;
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class JBlock.
     */
    public void testSetColor() {
        System.out.println("setColor");
        Color c = null;
        JBlock instance = null;
        instance.setColor(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBorderColor method, of class JBlock.
     */
    public void testSetBorderColor() {
        System.out.println("setBorderColor");
        Color c = null;
        JBlock instance = null;
        instance.setBorderColor(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTextColor method, of class JBlock.
     */
    public void testSetTextColor() {
        System.out.println("setTextColor");
        Color c = null;
        JBlock instance = null;
        instance.setTextColor(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPos method, of class JBlock.
     */
    public void testSetPos_float_float() {
        System.out.println("setPos");
        float x = 0.0F;
        float y = 0.0F;
        JBlock instance = null;
        instance.setPos(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPos method, of class JBlock.
     */
    public void testSetPos_double_double() {
        System.out.println("setPos");
        double x = 0.0;
        double y = 0.0;
        JBlock instance = null;
        instance.setPos(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareToExe method, of class JBlock.
     */
    public void testPrepareToExe() {
        System.out.println("prepareToExe");
        JBlock instance = null;
        instance.prepareToExe();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of releaseFromExe method, of class JBlock.
     */
    public void testReleaseFromExe() {
        System.out.println("releaseFromExe");
        JBlock instance = null;
        instance.releaseFromExe();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextExe method, of class JBlock.
     */
    public void testNextExe() {
        System.out.println("nextExe");
        JBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.nextExe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextBlock method, of class JBlock.
     */
    public void testNextBlock() {
        System.out.println("nextBlock");
        JBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.nextBlock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRound method, of class JBlock.
     */
    public void testGetRound() {
        System.out.println("getRound");
        JBlock instance = null;
        Shape expResult = null;
        Shape result = instance.getRound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode method, of class JBlock.
     */
    public void testGetCode() {
        System.out.println("getCode");
        JBlock instance = null;
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isReadyCode method, of class JBlock.
     */
    public void testIsReadyCode() {
        System.out.println("isReadyCode");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isReadyCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class JBlock.
     */
    public void testGetId() {
        System.out.println("getId");
        JBlock instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class JBlock.
     */
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        JBlock instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScriptFragmentForJavaScript method, of class JBlock.
     */
    public void testGetScriptFragmentForJavaScript() {
        System.out.println("getScriptFragmentForJavaScript");
        JBlock instance = null;
        String expResult = "";
        String result = instance.getScriptFragmentForJavaScript();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeCode method, of class JBlock.
     */
    public void testExecuteCode() {
        System.out.println("executeCode");
        ScriptEngine script = null;
        JBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.executeCode(script);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class JBlock.
     */
    public void testExecute_ScriptEngine() {
        System.out.println("execute");
        ScriptEngine script = null;
        JBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.execute(script);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of execute method, of class JBlock.
     */
    public void testExecute_ScriptEngine_boolean() {
        System.out.println("execute");
        ScriptEngine script = null;
        boolean highlight = false;
        JBlock instance = null;
        JBlock expResult = null;
        JBlock result = instance.execute(script, highlight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shape method, of class JBlock.
     */
    public void testShape() {
        System.out.println("shape");
        JBlock instance = null;
        instance.shape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class JBlock.
     */
    public void testUpdate() {
        System.out.println("update");
        JBlock instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of labelStyle method, of class JBlock.
     */
    public void testLabelStyle() {
        System.out.println("labelStyle");
        JBlock instance = null;
        String expResult = "";
        String result = instance.labelStyle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeHTML method, of class JBlock.
     */
    public void testMakeHTML() {
        System.out.println("makeHTML");
        String txt = "";
        JBlock instance = null;
        String expResult = "";
        String result = instance.makeHTML(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareText method, of class JBlock.
     */
    public void testPrepareText() {
        System.out.println("prepareText");
        JBlock instance = null;
        instance.prepareText();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawText method, of class JBlock.
     */
    public void testDrawText() {
        System.out.println("drawText");
        Graphics2D g2d = null;
        JBlock instance = null;
        instance.drawText(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afterShape method, of class JBlock.
     */
    public void testAfterShape() {
        System.out.println("afterShape");
        JBlock instance = null;
        instance.afterShape();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeGradient method, of class JBlock.
     */
    public void testMakeGradient() {
        System.out.println("makeGradient");
        JBlock instance = null;
        instance.makeGradient();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode method, of class JBlock.
     */
    public void testSetCode() {
        System.out.println("setCode");
        String c = "";
        JBlock instance = null;
        instance.setCode(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComment method, of class JBlock.
     */
    public void testSetComment() {
        System.out.println("setComment");
        String c = "";
        JBlock instance = null;
        instance.setComment(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of requestRepaint method, of class JBlock.
     */
    public void testRequestRepaint() {
        System.out.println("requestRepaint");
        JBlock instance = null;
        instance.requestRepaint();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawIcon method, of class JBlock.
     */
    public void testDrawIcon() {
        System.out.println("drawIcon");
        JBlock instance = null;
        BufferedImage expResult = null;
        BufferedImage result = instance.drawIcon();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIcon method, of class JBlock.
     */
    public void testGetIcon() {
        System.out.println("getIcon");
        JBlock.Type t = null;
        BufferedImage expResult = null;
        BufferedImage result = JBlock.getIcon(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class JBlock.
     */
    public void testDraw_Graphics2D() {
        System.out.println("draw");
        Graphics2D g2d = null;
        JBlock instance = null;
        instance.draw(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class JBlock.
     */
    public void testDraw_Graphics2D_boolean() {
        System.out.println("draw");
        Graphics2D g2d = null;
        boolean drawFull = false;
        JBlock instance = null;
        instance.draw(g2d, drawFull);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawSelection method, of class JBlock.
     */
    public void testDrawSelection() {
        System.out.println("drawSelection");
        Graphics2D g2d = null;
        JBlock instance = null;
        instance.drawSelection(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHighligted method, of class JBlock.
     */
    public void testSetHighligted() {
        System.out.println("setHighligted");
        boolean set = false;
        JBlock instance = null;
        instance.setHighligted(set);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isHighlighted method, of class JBlock.
     */
    public void testIsHighlighted() {
        System.out.println("isHighlighted");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.isHighlighted();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of highLight method, of class JBlock.
     */
    public void testHighLight() {
        System.out.println("highLight");
        Graphics2D g2d = null;
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.highLight(g2d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawHighlight method, of class JBlock.
     */
    public void testDrawHighlight() {
        System.out.println("drawHighlight");
        Graphics2D g2d = null;
        JBlock instance = null;
        instance.drawHighlight(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawShadow method, of class JBlock.
     */
    public void testDrawShadow() {
        System.out.println("drawShadow");
        Graphics2D g2d = null;
        JBlock instance = null;
        instance.drawShadow(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawConnections method, of class JBlock.
     */
    public void testDrawConnections() {
        System.out.println("drawConnections");
        Graphics2D g2d = null;
        JBlock instance = null;
        instance.drawConnections(g2d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of translate method, of class JBlock.
     */
    public void testTranslate() {
        System.out.println("translate");
        float x = 0.0F;
        float y = 0.0F;
        JBlock instance = null;
        instance.translate(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetT method, of class JBlock.
     */
    public void testResetT() {
        System.out.println("resetT");
        JBlock instance = null;
        instance.resetT();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setT method, of class JBlock.
     */
    public void testSetT() {
        System.out.println("setT");
        JBlock instance = null;
        instance.setT();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of translateT method, of class JBlock.
     */
    public void testTranslateT() {
        System.out.println("translateT");
        float x = 0.0F;
        float y = 0.0F;
        JBlock instance = null;
        instance.translateT(x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bound2D method, of class JBlock.
     */
    public void testBound2D() {
        System.out.println("bound2D");
        JBlock instance = null;
        Rectangle2D expResult = null;
        Rectangle2D result = instance.bound2D();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bound method, of class JBlock.
     */
    public void testBound() {
        System.out.println("bound");
        JBlock instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.bound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class JBlock.
     */
    public void testContains_double_double() {
        System.out.println("contains");
        double x = 0.0;
        double y = 0.0;
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.contains(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class JBlock.
     */
    public void testContains_3args() {
        System.out.println("contains");
        double x = 0.0;
        double y = 0.0;
        double prec = 0.0;
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.contains(x, y, prec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intersects method, of class JBlock.
     */
    public void testIntersects() {
        System.out.println("intersects");
        Shape s = null;
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.intersects(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectPoint method, of class JBlock.
     */
    public void testConnectPoint() {
        System.out.println("connectPoint");
        float angle = 0.0F;
        JBlock instance = null;
        Point2D expResult = null;
        Point2D result = instance.connectPoint(angle);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectPointBezier method, of class JBlock.
     */
    public void testConnectPointBezier() {
        System.out.println("connectPointBezier");
        float angle = 0.0F;
        Point2D s = null;
        float mult = 0.0F;
        JBlock instance = null;
        Point2D expResult = null;
        Point2D result = instance.connectPointBezier(angle, s, mult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawArrow method, of class JBlock.
     */
    public void testDrawArrow_0args() {
        System.out.println("drawArrow");
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.drawArrow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawArrow method, of class JBlock.
     */
    public void testDrawArrow_Flowline() {
        System.out.println("drawArrow");
        Flowline c = null;
        JBlock instance = null;
        boolean expResult = false;
        boolean result = instance.drawArrow(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parseXml method, of class JBlock.
     */
    public void testParseXml() {
        System.out.println("parseXml");
        Element b = null;
        boolean connect = false;
        JBlock instance = null;
        instance.parseXml(b, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loadXml method, of class JBlock.
     */
    public void testLoadXml() {
        System.out.println("loadXml");
        Element b = null;
        boolean connect = false;
        JBlock instance = null;
        instance.loadXml(b, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeXml method, of class JBlock.
     */
    public void testMakeXml_Element() {
        System.out.println("makeXml");
        Element root = null;
        JBlock instance = null;
        Element expResult = null;
        Element result = instance.makeXml(root);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeXml method, of class JBlock.
     */
    public void testMakeXml_Element_boolean() {
        System.out.println("makeXml");
        Element root = null;
        boolean connect = false;
        JBlock instance = null;
        Element expResult = null;
        Element result = instance.makeXml(root, connect);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlSave method, of class JBlock.
     */
    public void testSpecialXmlSave() {
        System.out.println("specialXmlSave");
        Element xml = null;
        JBlock instance = null;
        instance.specialXmlSave(xml);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of specialXmlLoad method, of class JBlock.
     */
    public void testSpecialXmlLoad() {
        System.out.println("specialXmlLoad");
        Element xml = null;
        boolean connect = false;
        JBlock instance = null;
        instance.specialXmlLoad(xml, connect);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeXml method, of class JBlock.
     */
    public void testMakeXml_3args() {
        System.out.println("makeXml");
        Element root = null;
        boolean connect = false;
        int IDs = 0;
        JBlock instance = null;
        Element expResult = null;
        Element result = instance.makeXml(root, connect, IDs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveXml method, of class JBlock.
     */
    public void testSaveXml() {
        System.out.println("saveXml");
        Element root = null;
        JBlock instance = null;
        instance.saveXml(root);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numOfInConnects method, of class JBlock.
     */
    public void testNumOfInConnects() {
        System.out.println("numOfInConnects");
        JBlock instance = null;
        int expResult = 0;
        int result = instance.numOfInConnects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numOfOutConnects method, of class JBlock.
     */
    public void testNumOfOutConnects() {
        System.out.println("numOfOutConnects");
        JBlock instance = null;
        int expResult = 0;
        int result = instance.numOfOutConnects();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class JBlockImpl extends JBlock {

        public JBlockImpl() {
            super(null, null);
        }
    }
    
}
