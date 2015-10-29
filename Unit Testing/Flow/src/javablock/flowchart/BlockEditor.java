package javablock.flowchart;

public interface BlockEditor {
    public void setEditedBlock(JBlock b);
    public void finishEdit();
    public boolean changes();
    public void saveBlock();
    public JBlock getBlock();
}
