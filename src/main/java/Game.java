package main.java;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) throws FileNotFoundException
    {
        MainFrame mFrame = new MainFrame("Title");
        mFrame.showFrame();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        File mapTest = new File("src/Resources/Maps/maptest.txt");
        Map map = new Map(mapTest);
        Entity player = new Entity(100, name, map, true, false);
        player.setRow(6);
        player.setCol(6);
        System.out.println("Your current coordinates are: " + player.getRow() + ", " + player.getCol());
        String moveAgain = "y";
        while(moveAgain.equals("y"))
        {
            String d = null;
        	while(Direction.getDirection(d) == null) 
            {
            	System.out.println("In what direction would you want to go?");
            	d = keyboard.nextLine();
            	if(Direction.getDirection(d) == null)
            		System.out.println("Please pick a cardinal direction (North, South, West, East)");
            }
            if(player.move(Direction.getDirection(d)))
            	System.out.print("Here are your new coordinates " + player.getName() + ": " + player.getRow() + ", " + player.getCol() + " ");
            else
            	System.out.print("You can't move in that direction. ");	
            System.out.print("Would you like to move again? (y/n) ");
            moveAgain = keyboard.nextLine();
        }
    }
    
}
