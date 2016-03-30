package players;

import java.awt.geom.Dimension2D;

/**
 *
 * @author AMINE IT
 */
public abstract class Sprite {

    private Dimension2D location;
    private TypeSprite spritType;

    public Sprite() {
    }

    public Sprite(TypeSprite spritType) {
        this.spritType = spritType;
    }

    public Sprite(Dimension2D location) {
        this.location = location;
    }

    public Sprite(Dimension2D location, TypeSprite spritType) {
        this.location = location;
        this.spritType = spritType;
    }

    public void setLocation(Dimension2D location) {
        this.location = location;
    }

    public Dimension2D getLocation() {
        return location;
    }

    public TypeSprite getSpritType() {
        return spritType;
    }

    public void setSpritType(TypeSprite spritType) {
        this.spritType = spritType;
    }

}
