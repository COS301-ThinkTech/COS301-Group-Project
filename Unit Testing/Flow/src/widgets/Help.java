/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package widgets;

/**
 *
 * 
 * @author Goodness
 */
public class Help extends javax.swing.JFrame {

    /** Creates new form help */
    public Help() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();

        setTitle("Help");

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setContentType("text/html");
        jTextPane1.setEditable(false);
        jTextPane1.setText("<html>\n" +
"  <head></head>\n" +
"   <h1>Flowchart Symbols</h1>\n" +
"   </br>\n" +
"   <h2>Declaration Block</h2>\n" +
"   <p>The declaration block is used to declare variables which will be used in the flowchart. In addition to declaration \n" +
"          the variables also have to  initialized accordingly e.g string variables can be initialised to an empty string\n" +
"	string variable = \"\".\n" +
"   </p>\n" +
"   </br>\n" +
"    <h2>Processing Block</h2>\n" +
"    <p>The processing block is used for  updating the values of the variables used in the flowchart for example calculations.</p>\n" +
"    </br>\n" +
"    <h2>Decision Block<h2>\n" +
"    <p> The decision block is used to specify conditions based on the value of the variable.  Meaning the variables are\n" +
"          compared to certain values using the following comparison operators:-\n" +
"	<ul>\n" +
"	<li>== - is equal</li>\n" +
"	<li>!= - is not equal</li>\n" +
"	<li>&lt;- is less than</li>\n" +
"	<li>> - is greater than</li>\n" +
"	<li>&lt;= - is less than or equal</li>\n" +
"	<li>>= - is greater than or equal</li>\n" +
"     <ul>\n" +
"    </p>\n" +
"   </br>\n" +
"    <h2>Module Block</h2>\n" +
"    <p>The module block is used to call functions. Specify the function name and also the parameters it requires.\n" +
"           The function being called should exist i.e. Has a flowchart. \n" +
"    </p>\n" +
"    </br>\n" +
"    <h2>Jump Block</h2>\n" +
"    <p>The jump block is used to join components in a more structured manner.</p>\n" +
"    </br>\n" +
"    <h2>Comment Block</h2>\n" +
"    <p>The comment block is used for comments in the code. The comment block code is not executed.</p>\n" +
"</html>"); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jTabbedPane1.addTab("Flowchart Symbols", jScrollPane1);

        jTextPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane2.setContentType("text/html");
        jTextPane2.setEditable(false);
        jTextPane2.setText("<html>\n" +
"  <head></head>\n" +
"   <h1>Loop Blocks</h1>\n" +
"   <p>The loop blocks are used to specify loop structures. They genereated through the use of a loop structure dialog box.</p>\n" +
"</html>"); // NOI18N
        jScrollPane2.setViewportView(jTextPane2);

        jTabbedPane1.addTab("Loop Structures", jScrollPane2);

        jTextPane3.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane3.setContentType("text/html");
        jTextPane3.setEditable(false);
        jTextPane3.setText("<html>\n" +
"  <head></head>\n" +
"   <h1>Input/Output</h1>\n" +
"   <h2>Input Block</h2>\n" +
"   <p>The input block is used to accept user input.The prefix part is used to specify the prompt message displayed to the user.\n" +
"	The input block can also be used to initialize a certain variable, specified to the Variable option.\n" +
"   </p>\n" +
"   <h2>Output Block</h2>\n" +
"   <p>The output block is used to print output to the user. You can also print variable values and include a prefix and suffix message. </p>\n" +
"</html>");
        jScrollPane3.setViewportView(jTextPane3);

        jTabbedPane1.addTab("Input/Output", jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Basic");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    */
    public static void showHelp() {
        new Help().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    // End of variables declaration//GEN-END:variables

}
