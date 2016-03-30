package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author AMINE IT
 */
public class Game extends JPanel implements KeyListener {

    static int bgSize = 64;
    static int nbTiles = 12;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.addKeyListener(this);
        this.setBackground(Color.red);
        Image bgImage;
        bgImage = new ImageIcon("assets\\Blocks\\BackgroundTile.png").getImage();
        for (int i = 0; i < nbTiles; i++) {
            for (int j = 0; j < nbTiles; j++) {
                g.drawImage(bgImage, i * bgSize, j * bgSize, this);
            }
        }
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

}
