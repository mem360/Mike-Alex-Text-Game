package main.java;

import java.util.ArrayList;

/*
 * A class to represent an entity in a game
 */
public class Entity extends GameElement{
    
    private int health; //this is the entity's health
    private boolean isPlayer;
    private boolean isEnemy;
    private ArrayList<Item> inventory;
    private Map currentMap;
    private Direction direction; //this is the direction that the entity is facing 
    
    /*
     * Initializes an entity with some health and a name
     */
    public Entity(int health, String name, Map startingMap, boolean isPlayer, boolean isEnemy)
    {
        super(name);
        this.health = health;
        this.isPlayer = isPlayer;
        this.isEnemy = isEnemy;
        inventory = new ArrayList<>();
        currentMap = startingMap;
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
    
    
    public boolean move(Direction d)
    {
    	int oldRow = getRow();
    	int oldCol = getCol();
    	int newRow = oldRow;
    	int newCol = oldCol;
    	if(d.equals(Direction.NORTH) && currentMap.inBounds(newRow - 1, newCol))
    		newRow--;
    	else if(d.equals(Direction.SOUTH) && currentMap.inBounds(newRow + 1, newCol))
    		newRow++;
    	else if(d.equals(Direction.EAST) && currentMap.inBounds(newRow, newCol + 1))
    		newCol++;
    	else if(d.equals(Direction.WEST) && currentMap.inBounds(newRow, newCol - 1))
    		newCol--;
    	setRow(newRow);
    	setCol(newCol);
    	return newCol != oldCol || newRow != oldRow;
    }
    
    public void pickUp(Item item)
    {
    	inventory.add(item);
    }
    
    public void drop(Item item)
    {
    	inventory.remove(item);
    }
    
    public void damage(int damage)
    {
    	health -= damage;
    }
    
    public boolean isDead()
    {
    	return health <= 0;
    }
    
    public void heal(int restoredHealth)
    {
    	health += restoredHealth;
    }
    
    public String listInventory()
    {
    	return inventory.toString();
    }
    
    public void changeMap(Map newMap)
    {
    	currentMap = newMap;
    }
}
