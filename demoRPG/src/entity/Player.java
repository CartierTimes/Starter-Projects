package entity;

import main.RPGPanel;
import main.Movement;

/**
 * Class for building the Player
 * will hold any values that will tie or relate to the
 * player
 */
public class Player extends Entity {

    RPGPanel panel;
    Movement movement;

    public Player(RPGPanel panel, Movement movement) {

        this.panel = panel;
        this.movement = movement;

    }

    public void setDefaultValues() {
        x = 100;
        y = 100;
        speed = 4;
    }


}
