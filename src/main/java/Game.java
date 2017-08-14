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
        System.out.println(map);


    }
    
}
