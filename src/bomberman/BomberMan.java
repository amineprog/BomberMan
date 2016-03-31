package bomberman;

import graphics.Game;
import java.util.ArrayList;
import javax.swing.JFrame;
import players.Sprite;
import players.TypeSprite;
import tools.Location;
import tools.Stage;

/**
 *
 * @author AMINE IT
 */
public class BomberMan {

    /**
     */
    public static void main(String[] args) {
        Stage st1 = new Stage();
        ArrayList<Sprite> table = new ArrayList<>();
        table = buildTiles(table);
        JFrame f = new JFrame("BomberMan");
        Sprite[][] tray = new Sprite[12][12];
        for (Sprite sp : table) {
            tray[sp.getLocation().getX()][sp.getLocation().getY()] = sp;
        }
        st1.setTray(tray);
        System.out.println(st1.toString());
        Game g = new Game(st1);
        g.setSize(768, 768);
        f.add(g);
        f.setSize(768, 796);
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static ArrayList<Sprite> buildTiles(ArrayList<Sprite> table) {
        Location location;
        for (int i = 0; i < 12; i++) {
            location = new Location(0, i);
            table.add(new Sprite(location, TypeSprite.Block));
            location = new Location(i, 0);
            table.add(new Sprite(location, TypeSprite.Block));
            location = new Location(11, i);
            table.add(new Sprite(location, TypeSprite.Block));
            location = new Location(i, 11);
            table.add(new Sprite(location, TypeSprite.Block));
        }
        location = new Location(1, 2);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(1, 1);
        table.add(new Sprite(location, TypeSprite.Player));
        location = new Location(2, 2);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(3, 2);
        table.add(new Sprite(location, TypeSprite.BlockEx));
        location = new Location(4, 2);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(6, 2);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(1, 6);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(2, 6);
        table.add(new Sprite(location, TypeSprite.Block));
        /*  location = new Location(3, 6);
        table.add(new Sprite(location, TypeSprite.BlockEx));*/
        location = new Location(4, 6);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(4, 2);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(4, 3);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(4, 4);
        table.add(new Sprite(location, TypeSprite.Block));
        location = new Location(4, 5);
        table.add(new Sprite(location, TypeSprite.Block));
        return table;
    }

}
