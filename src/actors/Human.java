package actors;

import actions.impl.MovementImpl;
import primitives.Vector2;

public class Human extends MovementImpl {

    private String name;

    private String surname;

    public Human(Vector2 vector2, int speed, String name, String surname) {
        super(vector2, speed);
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

}
