package main.java;
/*
 * A class to represent a player in a game
 */

public class Player extends Entity {

    private static final int STARTING_HEALTH = 100;
    
    public Player(String name)
    {
        super(STARTING_HEALTH, name);
        this.setDirection(Direction.NORTH);
    }
    

}
