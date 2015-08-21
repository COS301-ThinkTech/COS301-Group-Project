/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablock.flowchart.blockEditors;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javablock.flowchart.blocks.DecisionBlock;
import javablock.flowchart.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Goodness
 */
public final class DecisionEditor extends javax.swing.JPanel implements BlockEditor{

    /**
     * Creates new form DecisionEditor
     */
    private final ImageIcon delIcon;
    public DecisionEditor() {
        initComponents();
        delIcon = new javax.swing.ImageIcon(getClass().getResource("/icons/16/list-remove.png"));
        Comparison c = new Comparison(this);
        comparisons.add(c);
        makeList();
    }
    DecisionBlock editing;
    private String beforeCode="";
    private String beforeComment="";
     List<Comparison> comparisons = new ArrayList();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        codePanel = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        commentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comment = new javax.swing.JEditorPane();

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(212, 331));

        addButton.setText("Add comparison");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout codePanelLayout = new javax.swing.GroupLayout(codePanel);
        codePanel.setLayout(codePanelLayout);
        codePanelLayout.setHorizontalGroup(
            codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        codePanelLayout.setVerticalGroup(
            codePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(codePanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(addButton)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Code", codePanel);

        jScrollPane1.setViewportView(Comment);

        javax.swing.GroupLayout commentPanelLayout = new javax.swing.GroupLayout(commentPanel);
        commentPanel.setLayout(commentPanelLayout);
        commentPanelLayout.setHorizontalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        commentPanelLayout.setVerticalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Comment", commentPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Comparison c = new Comparison(this);
        comparisons.add(c);
        makeList();
    }//GEN-LAST:event_addButtonActionPerformed
    
    @Override
     public JBlock getBlock(){
        return editing;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane Comment;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel codePanel;
    private javax.swing.JPanel commentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
   
     
        void makeList(){
        //codePanel.removeAll();
        //fieldsPane.setPreferredSize(new Dimension(1,1));
        for(Comparison comp:comparisons)
        {
            codePanel.add(comp);
        }
            
        codePanel.add(addButton);
        JLabel l = new JLabel("if");
        codePanel.add(l);
        //fieldsScroll.se
        repaint();
    }
    @Override
    public void saveBlock() {
        editing.clear();
       
        System.out.println("SAVE");
        for(Comparison comp:comparisons)
        {
             editing.addComparison(comp.comparisonVariable1.getText(), comp.comparisonVariable2.getText());
             editing.setCode(comp.comparisonVariable1.getText() + " " /*+ comp.comparisonOperators.getSelectedItem().toString() + " "*/ + comp.comparisonVariable2.getText());
        }
        editing.setComment(Comment.getText());
        editing.shape();
        editing.flow.update();
       // editing.requestRepaint();
        //editing=null;
        
       // makeList();
    }

    @Override
    public void setEditedBlock(JBlock b) {
        if(b==editing) return ;
        if(editing!=null)
            finishEdit();
//        beforeCode=b.code;
//        beforeComment=b.comment;
//        addons.Syntax.clearUndos(Comment);
//        addons.Syntax.clearUndos();
      
        editing=(DecisionBlock)b;
        comparisons.clear();
        codePanel.removeAll();
       // comparisonVariable1.setText(editing.variable1);
        //comparisonVariable2.setText(editing.variable2);
        String I[][] = editing.getComparisons();
        
        for(String c[]:I)
        {
            Comparison comparison = new Comparison(this);
            comparison.comparisonVariable1.setText(c[0]);
            comparison.comparisonVariable2.setText(c[1]);
            
            comparisons.add(comparison);
        }
        
        makeList();
    }

    @Override
    public void finishEdit() {
         saveBlock();
         editing=null;
    }

    @Override
    public boolean changes() {
        return false;
    }

    void removeComparison(Comparison c){
        comparisons.remove(c);
        makeList();
    }
    
     class Comparison extends JPanel{
     
        JLabel ifLabel;
        JTextField comparisonVariable1;
        JTextField comparisonVariable2;
        JComboBox comparisonOperators;
        JComboBox logicalOperators;
        DecisionEditor d;
        Comparison c;
        
        Comparison(final DecisionEditor d){
            this.d = d;
            comparisonOperators = new JComboBox();
            comparisonOperators.addItem("==");
            comparisonOperators.addItem("<");
            comparisonOperators.addItem(">");
            comparisonOperators.addItem("!=");
            
            comparisonVariable1= new JTextField();
            comparisonVariable2 = new JTextField();
            JButton delete = new JButton();
            delete.setIcon(delIcon);
            this.setLayout(new BorderLayout());
            codePanel.add(comparisonVariable1, BorderLayout.WEST);
            add(comparisonVariable2, BorderLayout.EAST);
            add(comparisonOperators, BorderLayout.CENTER);
            add(delete, BorderLayout.EAST);
            c = this;
            
             delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    d.removeComparison(c);
                }
            });
        }
                
     
    }
}
