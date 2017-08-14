package main.java;

public abstract class GameElement implements MapTokens{

	private String name;
	private int row;
	private int col;
	
	public GameElement(String name) 
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public int getCol()
	{
		return col;
	}
	
	public void setRow(int newRow)
	{
		row = newRow;
	}
	
	public void setCol(int newCol)
	{
		col = newCol;
	}
	
	public char mapToken()
	{
		return ' ';
	}
}
