package players;

import java.awt.geom.Dimension2D;

/**
 *
 * @author AMINE IT
 */
public abstract class Sprite {
    private Dimension2D location;

    public Sprite() {
    }

    public void setLocation(Dimension2D location) {
        this.location = location;
    }

    public Dimension2D getLocation() {
        return location;
    }
    
}
