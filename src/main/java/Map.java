/*
* A class to represent a map using a 2D array of ints
*/
public class Map {
    
    private static final int DEFAULT_SIZE = 10;
    private final int ROWS;
    private final int COLS;
    private int[][] map;
    
    //constructs a square map of default size with each element set to 0;
    public Map()
    {
        map = new int[DEFAULT_SIZE][DEFAULT_SIZE];
        ROWS = DEFAULT_SIZE;
        COLS = DEFAULT_SIZE;
    }
    
    //constructs a map with 'rows' rows and 'cols' columns with each element set to 0
    public Map(int rows, int cols)
    {
        map = new int[rows][cols];
        ROWS = rows;
        COLS = cols;
    }
    
    //change one value in the map to newValue
    public void changeValue(int row, int col, int newValue)
    {
        map[row][col] = newValue;
    }
    
    //changes changeLength values in a line starting from [startRow][startCol] to newValue.
    //dRow and dCol represent how the rows and columns will change
    //dRow and dCol should be -1, 0, or 1.
    public void changeLine(int startRow, int startCol, int changeLength, int newValue, int dRow, int dCol)
    {
        int row = startRow;
        int col = startCol;
        for(int i = 0; i < changeLength; i++)
        {
            if(isInBounds(row, col))
            {
                changeValue(row, col, newValue);
            }
            row += dRow;
            col += dCol;
        }
    }
    
    //returns true if the given row and col is in bounds, false otherwise
    public boolean isInBounds(int row, int col)
    {
        return row >= 0 && row < ROWS && col >=0 && col < COLS;
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
       map = new int[ROWS][COLS];
    }
    
    //returns a string representation of the map's current state
    public String toString()
    {
        String mapString = "";
        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                mapString += map[row][col] + " ";
            }
            mapString += "\n";
        }
        return mapString;
    }
}