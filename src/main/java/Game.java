package main.java;

import java.util.Scanner;

public class Game {
    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        Player player = new Player(name);
        System.out.println(player.getName() + " " + player.getHealth() + " " + player.isEnemy());
    }
    
}
