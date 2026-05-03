
package Images;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author boo
 */
public class icon extends javax.swing.JLabel
{
    int x, y; //variaveis globais de nostro panel
    public icon(JPanel panel){
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }
    
    public void paint(Graphics g){
        ImageIcon img = new ImageIcon(getClass().getResource("src/Images/logoMars.png"));
        g.drawImage(img.getImage(), 0, 0,x , y, null);
    }
}
