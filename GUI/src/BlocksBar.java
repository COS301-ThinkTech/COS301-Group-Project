import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class BlocksBar extends JToolBar{
    public BlocksBar()
    {
        setFloatable(true);
        setRollover(true);
        setOrientation(JToolBar.VERTICAL);
        JButton b;

        JToolBar blocks = new JToolBar("BlocksBar");
        blocks.setFloatable(true);
        blocks.setOrientation(JToolBar.VERTICAL);
        
        JToolBar std = new JToolBar("Standard");
        std.setFloatable(false);
        std.setOrientation(JToolBar.VERTICAL);
        for (int i = 0; i < 2; i++){
            b = new JButton();
            b.setPreferredSize(new Dimension(32, 32));
            b.setIcon(new javax.swing.ImageIcon("icons/16/delete.png"));
            std.add(b);
        }
        blocks.add(std); 
        validate();
        revalidate();        
    }
}