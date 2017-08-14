package main.java;

/*
 * A class used to represent an element in a map
 */
public class MapElement 
{
    private int value;
    private boolean hasPlayer;
    private boolean hasEnemy;
    private boolean hasItem;
    
    public MapElement(int val)
    {
    	value = val;
    }
    
    public int getValue()
    {
    	return value;
    }
    
    public void changePlayerStatus()
    {
    	hasPlayer = !hasPlayer;
    }
    
    public void changeEnemyStatus()
    {
    	hasPlayer = !hasPlayer;
    }
    
    public void changeItemStatus()
    {
    	hasPlayer = !hasItem;
    }
    
    public boolean hasPlayer()
    {
    	return hasPlayer;
    }
    
    public boolean hasEnemy()
    {
    	return hasEnemy;
    }
    
    public boolean hasItem()
    {
    	return hasItem;
    }
    
    public String toString()
    {
    	return "" + value;
    }
    
}
