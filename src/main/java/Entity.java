/*
 * A class to represent an entity in a game
 */
public abstract class Entity {
    
    private int health;
    private String name;
    private int row;
    private int col;
    
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
    
    public int getCol()
    {
        return col;
    }
}
