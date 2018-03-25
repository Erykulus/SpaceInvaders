package entity;

import math.Vector2d;

public class Projectile extends Entity {
    public Projectile(float speed, Vector2d position, Vector2d direction) { //direction - ustawienie czy pocisk bedzie sie poruszal w gore/w dol
        super(speed, position);
        moveDirection = direction;
    }
}
