package main.java;

/*
 * constants to be used for directions in the map
 */
public enum Direction
{
	NORTH, SOUTH, EAST, WEST;
	
	public static Direction getDirection(String d)
	{
		if(d != null){
			d = d.toLowerCase();
			if(d.equals("north"))
				return NORTH;
			else if(d.equals("south"))
				return SOUTH;
			else if(d.equals("east"))
				return EAST;
			else if(d.equals("west"))
				return WEST;
		}
		return null;
					
	}
}
