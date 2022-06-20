package actions.impl;

import actions.BaseMovement;
import configs.Constants;
import primitives.Vector2;

public class MovementImpl implements BaseMovement<Vector2> {

    private Vector2 vector;
    private int speed;

    public MovementImpl(Vector2 vector, int speed) {
        this.vector = vector;
        this.speed = speed;
    }

    @Override
    public Vector2 up() {
        vector.y -= Constants.BASE_MOVEMENT_POINT * speed;
        return vector;
    }

    @Override
    public Vector2 right() {
        vector.x += Constants.BASE_MOVEMENT_POINT * speed;
        return vector;
    }

    @Override
    public Vector2 left() {
        vector.x -= Constants.BASE_MOVEMENT_POINT * speed;
        return vector;
    }

    @Override
    public Vector2 down() {
        vector.y += Constants.BASE_MOVEMENT_POINT * speed;
        return vector;
    }

    public void printCurrentLocation() {
        System.out.println("x " + vector.x + " : " + "y " + vector.y);
    }

}
