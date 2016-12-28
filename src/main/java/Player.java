package main.java;/*
 * A class to represent a player in a game
 */

public class Player extends Entity {

    private static final int STARTING_HEALTH = 100;
    private int bonusHealth;
    
    public Player(String name)
    {
        super(STARTING_HEALTH, name);
    }
    
}
