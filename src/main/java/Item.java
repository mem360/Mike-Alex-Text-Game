package main.java;/*
 * A class to represent an item in a game
 */

public abstract class Item {
    
    private String name;
    private boolean canBeUsed;
    
    public Item(String name)
    {
        this.name = name;
        this.canBeUsed = false;
    }
    
}
