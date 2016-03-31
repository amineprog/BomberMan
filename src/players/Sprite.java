package players;

import tools.Location;

/**
 *
 * @author AMINE IT
 */
public class Sprite {

    private Location location;
    private TypeSprite spritType;

    public Sprite() {
    }

    public Sprite(TypeSprite spritType) {
        this.spritType = spritType;
    }

    public Sprite(Location location) {
        this.location = location;
    }

    public Sprite(Location location, TypeSprite spritType) {
        this.location = location;
        this.spritType = spritType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public TypeSprite getSpritType() {
        return spritType;
    }

    public void setSpritType(TypeSprite spritType) {
        this.spritType = spritType;
    }

}
