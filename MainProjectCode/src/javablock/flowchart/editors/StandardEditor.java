/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.editors;
import javablock.flowchart.Component;
import javablock.flowchart.ComponentEditor;


/**
 *
 * @author GreaterThanSolomon
 */
public class StandardEditor extends javax.swing.JPanel implements ComponentEditor{
    public StandardEditor(){
        initComponents();
    }
    
    /*
        All variable declarations must come here.
    */
    
    private Component editing = null;
    private String beforeCode = "";
    private String beforeComment = "";
    
    public javax.swing.JTabbedPane editors;
    
    private javax.swing.JEditorPane Content;
    private javax.swing.JScrollPane commendPane;
    private javax.swing.JEditorPane comment;
    private javax.swing.JCheckBox commentDisplay;
    private javax.swing.JCheckBox isHTML;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    
    // ------------------------------------------ End variable declarations ---------------------------------------------------    
    
    // ------------------------------------------ Helpers ------------------------------------------------------------------------------
    
    private void commentDisplayStateChanged(javax.swing.event.ChangeEvent evt){
            saveEditedComponent();
    }
    
    // -------------------------------------------- End helpers --------------------------------------------------------------------
    
    private void initComponents(){
        //System.out.println("Start building");
        editors = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Content = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        commentDisplay = new javax.swing.JCheckBox();
        commendPane = new javax.swing.JScrollPane();
        comment = new javax.swing.JEditorPane();
        isHTML = new javax.swing.JCheckBox();
        
        jScrollPane1.setViewportView(Content);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1)
        );
        
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("javablock/flowchart/editors/lang");
        editors.addTab(bundle.getString("blockConfig.code"), jPanel2);
        
        commentDisplay.setText(bundle.getString("blockConfig.displayComment"));
        commentDisplay.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                commentDisplayStateChanged(evt);
            }
        });
        
        comment.setBackground(new java.awt.Color(254, 254, 254));
        comment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comment.setFont(new java.awt.Font("Monospaced", 0, 13));
        comment.setMinimumSize(new java.awt.Dimension(50, 23));
        comment.setPreferredSize(new java.awt.Dimension(150, 19));
        commendPane.setViewportView(comment);
        
        isHTML.setText(bundle.getString("blockConfig"));
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(isHTML)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(commentDisplay)
                .addContainerGap())
            .addComponent(commendPane, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
        );
        
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(commendPane, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentDisplay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isHTML))
        );
        
        editors.addTab(bundle.getString("blockConfig.comment"), jPanel1); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(editors, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(editors, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
        );
        //System.out.println("Finish building");
    }
    
    // ------------------------------------------ Implememtations of methods in ComponetEditor----------
    
    @Override
    public void setEditedComponent(){
        
    }
     
    @Override
    public void saveEditedComponent(){
        // saves a component, one sent from canvas to be edited.
        
        /*
        if(editing==null)
            return ;
        if(editing.deleted)
            return ;
        System.out.println("SAVE");
        editing.setCode(Content.getText());
        editing.setComment(comment.getText());
        editing.commentIsHTML=isHTML.isSelected();
        editing.displayComment=commentDisplay.isSelected();
        editing.requestRepaint();
        editing=null;
                */
    }
     
    @Override
    public Component getComponent(){
        return null; // replace with appropriate return type.
    }
}
