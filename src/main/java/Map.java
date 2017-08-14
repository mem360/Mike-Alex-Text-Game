package main.java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* A class to represent a map using a 2D array of ints
*/
public class Map implements MapTokens {
    
    private static final int DEFAULT_SIZE = 10;
    private final int ROWS;
    private final int COLS;
    private char[][] map;
    
    //constructs a square map of default size with each element set to 0;
    public Map()
    {
        this(DEFAULT_SIZE, DEFAULT_SIZE);
    }
    
    //constructs a map with 'rows' rows and 'cols' columns with each element set to 0
    public Map(int rows, int cols)
    {
        map = new char[rows][cols];
        ROWS = rows;
        COLS = cols;
    }
    
    //creates a map from a specified file; assumes that the file is formatted with the first int as
    //the rows, the second int as the cols, and the rest of the file as the actual map
    public Map(File file) throws FileNotFoundException
    {
    	Scanner fileScanner = new Scanner(file);
    	ROWS = fileScanner.nextInt();
    	COLS = fileScanner.nextInt();
    	fileScanner.nextLine();
    	map = new char[ROWS][COLS];
    	int currentRow = 0;
    	while(fileScanner.hasNextLine() && currentRow < ROWS)
    	{
    		Scanner lineScanner = new Scanner(fileScanner.nextLine());
    	    lineScanner.useDelimiter("");
    	    int col = 0;
    	    while(lineScanner.hasNext() && col < COLS)
    	    {
    	    	map[currentRow][col] = lineScanner.next().charAt(0);
    	    	col++;
    	    }
    	    currentRow++;
    	    lineScanner.close();
    	}
    	fileScanner.close();
    }
    
    //change one value in the map to newValue
    public void changeValue(int row, int col, char newValue)
    {
        map[row][col] = newValue;
    }
    
    //changes changeLength values in a line starting from [startRow][startCol] to newValue.
    //dRow and dCol represent how the rows and columns will change
    //dRow and dCol should be -1, 0, or 1.
    public void changeLine(int startRow, int startCol, int changeLength, char newValue, int dRow, int dCol)
    {
        int row = startRow;
        int col = startCol;
        for(int i = 0; i < changeLength; i++)
        {
            if(inBounds(row, col))
            {
                changeValue(row, col, newValue);
            }
            row += dRow;
            col += dCol;
        }
    }
    
    //returns true if the given row and col is in bounds, false otherwise
    public boolean inBounds(int row, int col)
    {
        return row >= 0 && row < ROWS && col >=0 && col < COLS && getValue(row, col) != WALL;
    }
    
    public int getValue(int row, int col)
    {
    	return map[row][col];
    }
    
    //returns the number of rows in the map
    public int getRows()
    {
        return ROWS;
    }
    
    //returns the number of cols in the map
    public int getCols()
    {
        return COLS;
    }
    
    //sets this map back to 0's
    public void reset()
    {
       map = new char[ROWS][COLS];
    }
    
    //returns a string representation of the map's current state
    public String toString()
    {
        StringBuilder mapString = new StringBuilder();
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                mapString.append(map[row][col]);
                mapString.append(' ');
            }
            mapString.append('\n');
        }
        return mapString.toString();
    }
}
