package main.java;
/*
 * A class to represent an item in a game
 */

public abstract class Item extends GameElement {
    
    private boolean canBeUsed;
    
    public Item(String name, boolean canBeUsed)
    {
        super(name);
        this.canBeUsed = canBeUsed;
    }
    
    public char mapToken()
    {
    	return ITEM;
    }
}
