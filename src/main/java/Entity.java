package main.java;

/*
 * A class to represent an entity in a game
 */
public abstract class Entity extends GameElement{
    
    private int health; //this is the entity's health
    private boolean isPlayer;
    private boolean isEnemy;
    
    private Direction direction; //this is the direction that the entity is facing 
    
    /*
     * Initializes an entity with some health and a name
     */
    public Entity(int health, String name)
    {
        super(name);
        this.health = health;
    }
    
    /*
     * returns this entity's health
     */
    public int getHealth()
    {
        return health;
    }
    
    /*
     * returns true if this entity is hostile, false otherwise
     */
    public boolean isEnemy()
    {
        return isEnemy;
    }
    
    public boolean isPlayer()
    {
    	return isPlayer;
    }
    
    /*
     * changes the direction that this entity is facing in
     */
    public void setDirection(Direction d)
    {
    	direction = d;
    }
    
    /*
     * returns the direction that this entity is facing in
     */
    public Direction getDirection()
    {
    	return direction;
    }
    
    /*
     * constants to be used for directions in the map
     */
    public enum Direction
    {
    	NORTH, SOUTH, EAST, WEST;
    }
    
    public void move(Direction d)
    {
    	
    }
    
    /*
     * this is used by the map and corresponds to the token that will be used to represent this entity on the map.
     */
    public char mapToken() 
    {
    	return ENTITY;
    }
}
