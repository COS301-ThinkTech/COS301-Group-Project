
package flow.flowchart.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.Icon;

/**
 *
 * @author tshepiso
 */
public class JumpComponent extends Component implements Icon{
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D gObject = (Graphics2D)g;
        
        gObject.setColor(Color.decode("#079CCE"));
        gObject.fillOval(10, 10, 10, 10);
    }

    @Override
    public int getIconHeight(){
        return 20;
    }

    @Override
    public int getIconWidth(){
        return 60;
    }
}
