package main.java;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        Player player = new Player(name);
        System.out.println(player.getName() + " " + player.getHealth() + " " + player.isEnemy());
        File mapTest = new File("src/Resources/Maps/maptest.txt");
        Map map = new Map(mapTest);
        System.out.println(map);
        
    }
    
}
