package entity;

import math.Vector2d;

public class Meteorite extends Projectile {
    //TODO: Set Sprite
    public Meteorite(float speed, Vector2d position) {
        super(speed, position, Vector2d.downwards());
    }
}
