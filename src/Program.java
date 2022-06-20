
import actors.Human;
import console.ConsoleListener;
import console.impl.ConsoleListenerImpl;
import primitives.Vector2;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Vector2 vector2 = new Vector2(0,0);
        int speed = 100;
        Human human = new Human(vector2, speed,"Jhon", "Whick");
        ConsoleListener consoleListener = new ConsoleListenerImpl();
        consoleListener.listen();
    }

}
