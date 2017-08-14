package main.java;
/*
 * A class to represent an item in a game
 */

public abstract class Item extends GameElement {
    
    
    public Item(String name)
    {
        super(name);
    }
    
    public char mapToken()
    {
    	return ITEM;
    }
}
