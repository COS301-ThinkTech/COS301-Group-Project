/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package javablock.gui;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
/**
 *
 * @author Mpumpu
 */
public class MainDisplay extends javax.swing.JFrame 
{

    /**
     * Creates new form MainDisplay
     */
    public MainDisplay() throws PropertyVetoException {
        initComponents();
        getContentPane().setBackground(Color.DARK_GRAY.darker());
        jPanel2.setBackground(Color.white);       
        
        try {
                this.setIconImage(ImageIO.read(getClass().getResource("icons/icon.png")));
            } catch (Exception ex) {}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        newFile = new javax.swing.JButton();
        open = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        undo = new javax.swing.JButton();
        redo = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        run = new javax.swing.JButton();
        step = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        bin = new javax.swing.JButton();
        componentsInternalFrame = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        ioComponent = new javax.swing.JButton();
        decisionComponent = new javax.swing.JButton();
        processingComponent = new javax.swing.JButton();
        returnComponent = new javax.swing.JButton();
        moduleComponent = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        MenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newFileMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        openMenuItem = new javax.swing.JMenuItem();
        renameMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        undoMenuItem = new javax.swing.JMenuItem();
        redoMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        deleteMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        componentsMenuItem = new javax.swing.JMenuItem();
        consoleMenuItem = new javax.swing.JMenuItem();
        gridMenuItem = new javax.swing.JMenuItem();
        fullScreenMenuItem = new javax.swing.JCheckBoxMenuItem();
        settingsMenu = new javax.swing.JMenu();
        aboutMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flow");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        newFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/24/document-new.png"))); // NOI18N
        newFile.setToolTipText("New");
        newFile.setActionCommand("New");
        newFile.setFocusable(false);
        newFile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newFile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jToolBar1.add(newFile);

        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/24/document-open.png"))); // NOI18N
        open.setToolTipText("Open");
        open.setFocusable(false);
        open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        jToolBar1.add(open);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/24/document-save.png"))); // NOI18N
        save.setToolTipText("Save");
        save.setFocusable(false);
        save.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        save.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(save);
        jToolBar1.add(jSeparator6);

        undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/24/edit-undo.png"))); // NOI18N
        undo.setToolTipText("Undo");
        undo.setEnabled(false);
        undo.setFocusable(false);
        undo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        undo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(undo);

        redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/24/edit-redo.png"))); // NOI18N
        redo.setToolTipText("Redo");
        redo.setEnabled(false);
        redo.setFocusable(false);
        redo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        redo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(redo);
        jToolBar1.add(jSeparator8);

        run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/media-playback-start.png"))); // NOI18N
        run.setToolTipText("Run");
        run.setFocusable(false);
        run.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        run.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(run);

        step.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/step.png"))); // NOI18N
        step.setToolTipText("Step");
        step.setEnabled(false);
        step.setFocusable(false);
        step.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        step.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(step);

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/media-playback-stop.png"))); // NOI18N
        stop.setToolTipText("Stop");
        stop.setEnabled(false);
        stop.setFocusable(false);
        stop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(stop);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator1);

        jSpinner1.setMaximumSize(new java.awt.Dimension(63, 30));
        jSpinner1.setPreferredSize(new java.awt.Dimension(63, 30));
        jToolBar1.add(jSpinner1);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("run speed");
        jToolBar1.add(jLabel1);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        bin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/48/delete.png"))); // NOI18N
        bin.setFocusable(false);
        bin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(bin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 504, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        componentsInternalFrame.setBorder(javax.swing.BorderFactory.createTitledBorder("Components"));
        componentsInternalFrame.setClosable(true);
        componentsInternalFrame.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        componentsInternalFrame.setIconifiable(true);
        componentsInternalFrame.setMaximizable(true);
        componentsInternalFrame.setResizable(true);
        componentsInternalFrame.setAutoscrolls(true);
        componentsInternalFrame.setFocusCycleRoot(false);
        componentsInternalFrame.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/jframeicon.png"))); // NOI18N
        componentsInternalFrame.setPreferredSize(new java.awt.Dimension(297, 150));
        componentsInternalFrame.setRequestFocusEnabled(false);
        try {
            componentsInternalFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        componentsInternalFrame.setVerifyInputWhenFocusTarget(false);
        componentsInternalFrame.setVisible(true);

        ioComponent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/tempcomponents/32/io.png"))); // NOI18N
        ioComponent.setToolTipText("");
        ioComponent.setBorder(null);
        ioComponent.setBorderPainted(false);
        ioComponent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        decisionComponent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/tempcomponents/32/decision.png"))); // NOI18N
        decisionComponent.setBorder(null);
        decisionComponent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        processingComponent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/tempcomponents/32/processing.png"))); // NOI18N
        processingComponent.setBorder(null);
        processingComponent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        processingComponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processingComponentActionPerformed(evt);
            }
        });

        returnComponent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/tempcomponents/32/return.png"))); // NOI18N
        returnComponent.setBorder(null);
        returnComponent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        moduleComponent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/tempcomponents/32/module.png"))); // NOI18N
        moduleComponent.setBorder(null);
        moduleComponent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(processingComponent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moduleComponent))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(returnComponent)
                            .addComponent(ioComponent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decisionComponent)))
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processingComponent)
                    .addComponent(moduleComponent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(decisionComponent)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(returnComponent)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ioComponent)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        ioComponent.getAccessibleContext().setAccessibleName("io");
        processingComponent.getAccessibleContext().setAccessibleName("processingComponent");
        returnComponent.getAccessibleContext().setAccessibleName("returnComponent");

        javax.swing.GroupLayout componentsInternalFrameLayout = new javax.swing.GroupLayout(componentsInternalFrame.getContentPane());
        componentsInternalFrame.getContentPane().setLayout(componentsInternalFrameLayout);
        componentsInternalFrameLayout.setHorizontalGroup(
            componentsInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        componentsInternalFrameLayout.setVerticalGroup(
            componentsInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(componentsInternalFrameLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jInternalFrame2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jInternalFrame2.setClosable(true);
        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/jframeicon.png"))); // NOI18N
        jInternalFrame2.setVisible(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("=A Flowchart Planning and Simulation Tool=\nProudly brought to you by ThinkTech!");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setText("File");
        fileMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        newFileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFileMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/document-new.png"))); // NOI18N
        newFileMenuItem.setText("New");
        newFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newFileMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/document-save.png"))); // NOI18N
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        saveAsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/document-saveas.png"))); // NOI18N
        saveAsMenuItem.setText("Save As");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);
        fileMenu.add(jSeparator4);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/document-open.png"))); // NOI18N
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        renameMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/rename.png"))); // NOI18N
        renameMenuItem.setText("Rename");
        fileMenu.add(renameMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/exit.png"))); // NOI18N
        exitMenuItem.setText("Exit");
        fileMenu.add(exitMenuItem);

        MenuBar.add(fileMenu);

        editMenu.setText("Edit");
        editMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        undoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        undoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/edit-undo.png"))); // NOI18N
        undoMenuItem.setText("Undo");
        editMenu.add(undoMenuItem);

        redoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        redoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/edit-redo.png"))); // NOI18N
        redoMenuItem.setText("Redo");
        redoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redoMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(redoMenuItem);
        editMenu.add(jSeparator2);

        cutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/edit-cut.png"))); // NOI18N
        cutMenuItem.setText("Cut");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        copyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/edit-copy.png"))); // NOI18N
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/edit-paste.png"))); // NOI18N
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);
        editMenu.add(jSeparator3);

        deleteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        deleteMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javablock/gui/icons/16/delete.png"))); // NOI18N
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        MenuBar.add(editMenu);

        viewMenu.setText("View");
        viewMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        componentsMenuItem.setText("Components");
        componentsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                componentsMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(componentsMenuItem);

        consoleMenuItem.setText("Console");
        consoleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consoleMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(consoleMenuItem);

        gridMenuItem.setText("Grid");
        viewMenu.add(gridMenuItem);

        fullScreenMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        fullScreenMenuItem.setText("Full Screen");
        fullScreenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullScreenMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(fullScreenMenuItem);

        MenuBar.add(viewMenu);

        settingsMenu.setText("Settings");
        settingsMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuBar.add(settingsMenu);

        aboutMenu.setText("About");
        aboutMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MenuBar.add(aboutMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jInternalFrame2)
                    .addComponent(componentsInternalFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(componentsInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jInternalFrame2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newFileMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void redoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redoMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newFileActionPerformed

    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openActionPerformed

    
    private void componentsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_componentsMenuItemActionPerformed
        // TODO add your handling code here:
        if(componentsInternalFrame.isVisible())
           componentsInternalFrame.setVisible(false);
       else
           componentsInternalFrame.setVisible(true);
    }//GEN-LAST:event_componentsMenuItemActionPerformed

    private void fullScreenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullScreenMenuItemActionPerformed
        // TODO add your handling code here:
        displayFullScreeen();
    }//GEN-LAST:event_fullScreenMenuItemActionPerformed

    private void consoleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consoleMenuItemActionPerformed
        // TODO add your handling code here:
       if(jInternalFrame2.isVisible())
           jInternalFrame2.setVisible(false);
       else
           jInternalFrame2.setVisible(true);
    }//GEN-LAST:event_consoleMenuItemActionPerformed

    private void processingComponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processingComponentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_processingComponentActionPerformed

    public void displayFullScreeen()
    {        
        if(fullscreen == true)
            fullscreen = false;        
        else
            fullscreen = true;
        
        if(fullscreen)
        {
            windowSize=this.getBounds();
            this.setVisible(false);
            this.dispose();
            this.setUndecorated(true);
            Toolkit tk = Toolkit.getDefaultToolkit();
            this.setBounds(0,0,tk.getScreenSize().width, tk.getScreenSize().height);
            jToolBar1.setVisible(false);
            componentsInternalFrame.setVisible(false);
            jInternalFrame2.setVisible(false);
            this.setVisible(true);
        }
        else
        {
            this.setVisible(false);
            this.dispose();
            this.setUndecorated(false);
            setBounds(windowSize);
            jToolBar1.setVisible(true);
            componentsInternalFrame.setVisible(true);
            jInternalFrame2.setVisible(true);
            this.setVisible(true);
        }
    }
    boolean fullscreen=false;
    Rectangle windowSize;
    /**
     * @param args the command line arguments
     */
    
public static boolean showSplash=true;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton bin;
    private javax.swing.JInternalFrame componentsInternalFrame;
    private javax.swing.JMenuItem componentsMenuItem;
    private javax.swing.JMenuItem consoleMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JButton decisionComponent;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JCheckBoxMenuItem fullScreenMenuItem;
    private javax.swing.JMenuItem gridMenuItem;
    private javax.swing.JButton ioComponent;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton moduleComponent;
    private javax.swing.JButton newFile;
    private javax.swing.JMenuItem newFileMenuItem;
    private javax.swing.JButton open;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JButton processingComponent;
    private javax.swing.JButton redo;
    private javax.swing.JMenuItem redoMenuItem;
    private javax.swing.JMenuItem renameMenuItem;
    private javax.swing.JButton returnComponent;
    private javax.swing.JButton run;
    private javax.swing.JButton save;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenu settingsMenu;
    private javax.swing.JButton step;
    private javax.swing.JButton stop;
    private javax.swing.JButton undo;
    private javax.swing.JMenuItem undoMenuItem;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}

