package tools;

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
        return "Stage{" + "tray=" + tray + '}';
    }
}
