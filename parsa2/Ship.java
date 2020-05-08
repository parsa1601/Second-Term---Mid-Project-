package parsa2;

import javafx.scene.Parent;

public class Ship extends Parent {
    public int type;

    public int health;

    public Ship(int type) {
        this.type = type;
        if(type != 4) {
            health = type*type*2;
        }
        else health = 2;
    }

    public void hit() {
        health--;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "type=" + type +
                ", health=" + health/2 +
                '}';
    }
}
