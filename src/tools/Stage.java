package tools;

import java.util.Arrays;
import players.Sprite;

/**
 *
 * @author AMINE IT
 */
public class Stage {

    private Sprite[][] tray;

    public Stage() {
        tray = new Sprite[12][12];
    }

    public void setTray(Sprite[][] tray) {
        this.tray = tray;
    }

    public Sprite[][] getTray() {
        return tray;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (tray[i][j] != null) {
                    str += "|" + "X => " + i + "__Y => " + j + "|";
                    System.out.println("X => " + i + "__Y => " + j);
                } else {
                    str += "|vide|";
                }
            }
            str += "\n";
        }
        return str;
    }
}
