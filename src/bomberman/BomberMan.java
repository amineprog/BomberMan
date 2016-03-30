package bomberman;

import graphics.Game;
import javax.swing.JFrame;

/**
 *
 * @author AMINE IT
 */
public class BomberMan {

    /**
     */
    public static void main(String[] args) {
        JFrame f = new JFrame("BomBerMan");
        Game g = new Game();
        g.setSize(768, 768);
        f.add(g);
        f.setSize(768, 768);
        f.setResizable(false);
        f.setVisible(true);
    }
    
}
