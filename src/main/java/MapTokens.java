package main.java;

/*
 * This interface is a collection of tokens that are to be used when constructing the map. They are chars so that
 * there is enough to cover all elements of the game and so that debugging/editing the map can be made easier. 
 * Each element in the game will have some map token assigned to it. The token is DIFFERENT than the name of the element,
 * as the name is what is displayed to the console while the map token is what is used by the map.
 */
public interface MapTokens {
	
	
	/*
	 * This token represents any generic item that any entity might be able to interact with, pick up, use, and/or throw away
	 */
	public final char ITEM = 'I';
	
	
	/*
	 * This token represents a wall or otherwise impassable barrier in the map
	 */
	public final char WALL = '*';
	
	/*
	 * This token represents an open area that entities can move through
	 */
	public final char OPEN_SPACE = 'O';
	
	/*
	 * This token represents a door that can either be open or closed. If it is closed, then it can be locked and require a key 
	 * to open it.
	 */
	public final char DOOR = 'D';
	
}
