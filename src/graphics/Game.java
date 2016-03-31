package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import players.Sprite;
import players.TypeSprite;
import tools.Location;
import tools.Stage;

/**
 *
 * @author AMINE IT
 */
public class Game extends JPanel implements Runnable {

    static int bgSize = 64;
    static int nbTiles = 12;
    private Stage currentStage;
    static int currentX = 1;
    static int currentY = 1;
    private Image Player;

    public Game(Stage currentStage) {
        this.currentStage = currentStage;
        Player = new ImageIcon("assets\\Bomberman\\Front\\Bman_F_f00.png").getImage();
        this.setFocusable(true);
        run();
    }

    public static int getBgSize() {
        return bgSize;
    }

    public static int getNbTiles() {
        return nbTiles;
    }

    public Stage getCurrentStage() {
        return currentStage;
    }

    public static void setBgSize(int bgSize) {
        Game.bgSize = bgSize;
    }

    public static void setNbTiles(int nbTiles) {
        Game.nbTiles = nbTiles;
    }

    public void setCurrentStage(Stage currentStage) {
        this.currentStage = currentStage;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.red);
        Image bgImage, BlockSolid, BlockEx;
        bgImage = new ImageIcon("assets\\Blocks\\BackgroundTile.png").getImage();
        BlockSolid = new ImageIcon("assets\\Blocks\\SolidBlock.png").getImage();
        BlockEx = new ImageIcon("assets\\Blocks\\ExplodableBlock.png").getImage();
        for (int i = 0; i < nbTiles; i++) {
            for (int j = 0; j < nbTiles; j++) {
                g.drawImage(bgImage, i * bgSize, j * bgSize, this);
            }
        }
        for (int i = 0; i < nbTiles; i++) {
            Image imgDraw = null;
            for (int j = 0; j < nbTiles; j++) {
                imgDraw = null;
                if (currentStage.getTray()[i][j] != null) {
                    switch (currentStage.getTray()[i][j].getSpritType()) {
                        case Block:
                            imgDraw = BlockSolid;
                            break;
                        case BlockEx:
                            imgDraw = BlockEx;
                            break;
                        case Player:
                            imgDraw = Player;
                            break;

                    }
                    g.drawImage(imgDraw, i * 64, j * 64, this);
                }
            }
        }
    }

    @Override
    public void run() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyCode());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                 Player = new ImageIcon("assets\\Bomberman\\Front\\Bman_F_f00.png").getImage();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Sprite[][] tray = new Sprite[12][12];
                tray = currentStage.getTray();
                int newX = currentX, newY = currentY;
                if (e.getKeyCode() == 38) {
                    newY--;
                    Player = new ImageIcon("assets\\Bomberman\\Back\\Bman_F_f00.png").getImage();
                }
                if (e.getKeyCode() == 39) {
                    newX++;
                    Player = new ImageIcon("assets\\Bomberman\\Side\\Bman_F_f00.png").getImage();
                }
                if (e.getKeyCode() == 40) {
                    newY++;
                    Player = new ImageIcon("assets\\Bomberman\\Back\\Bman_F_f00.png").getImage();
                }
                if (e.getKeyCode() == 37) {
                    newX--;
                    Player = new ImageIcon("assets\\Bomberman\\Side\\Bman_F_f00.png").getImage();
                }
                Location l = new Location(newX, newY);
                if (tray[newX][newY] == null) {
                    tray[newX][newY] = new Sprite(l, TypeSprite.Player);
                    tray[currentX][currentY] = null;
                    currentX = newX;
                    currentY = newY;
                    currentStage.setTray(tray);
                    repaint();
                }
                //tray[currentX][currentY] = (tray[currentX][currentY] == null) ? new Sprite(l, TypeSprite.Player) : tray[currentX][currentY];

            }
        });
        System.out.println(" OK ");
    }

    /*
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
     */
}
