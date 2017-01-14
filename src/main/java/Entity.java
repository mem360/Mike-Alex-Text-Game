package main.java;

/*
 * A class to represent an entity in a game
 */
public abstract class Entity {
    
    private int health;
    private String name;
    private int row;
    private int col;
    private Direction direction;
    
    public Entity(int health, String name)
    {
        this.health = health;
        this.name = name;
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public String getName()
    {
        return name;
    }
    
    public boolean isEnemy()
    {
        return false;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public void setRow(int newRow)
    {
        row = newRow;
    }
    
    public void setCol(int newCol)
    {
        col = newCol;
    }
    
    public void setDirection(Direction d)
    {
    	direction = d;
    }
    
    public int getCol()
    {
        return col;
    }
    
    public Direction getDirection()
    {
    	return direction;
    }
    
    public enum Direction
    {
    	NORTH, SOUTH, EAST, WEST;
    }
}
