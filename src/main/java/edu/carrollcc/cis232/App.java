package edu.carrollcc.cis232;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
		//TODO: Fix me
    	Scanner keyboard = new Scanner(System.in); //ctrl+shift+o
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.printf("Hello %s!%n", name); //%s starts String
        System.out.println("Hello " + name + "!");
        keyboard.close();
    }
}
