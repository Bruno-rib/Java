package DereckBanas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/***java.lang.RuntimeException: exceptions that can be thrown during the normal
 * operation of the Java Virtual Machine. These exceptions are your responsibility
 * **Java.lang.Exception: exceptions that are checked for by the java compiler
 * 
 * both exceptions will crash the program but the RuntimeException will try to run nefore crashing
 */

//use all methods from java.util
//after done with program press shift + control + o to make specific


public class exceptionHandler6 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		//4 same example as below but using throws
		try {
		getAFile1("./somestuff.txt");
		} 
		catch (IOException e) {
			System.out.println("An IO error occurred");
		}
		
		//3 catch a non existent file
		getAFile("./somestuff.txt");
		System.out.println();
		
		//2
		System.out.println("How old are you?");
		int age = checkValidAge();
		
		if (age != 0) {
			System.out.println("You are " + age + " years old");
		}
		
		//1 try and catch example
		System.out.println();
		divideByZero(2);
		
	}
	
//4 same example as below but using throws
// this method throws the error back to main to handle or program crash
	public static void getAFile1(String fileName) throws IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream(fileName);
	}
	
//3 try and catch non existent file
	public static void getAFile(String fileName) {
		try {
			FileInputStream file = new FileInputStream(fileName);
		} 
		//specific catch favorable
		catch (FileNotFoundException e) {
			System.out.println("Sorry can't find that file");
		}
		
		//general IO catch least specific after
		//I can catch an error and do not perform any action
		//can check two at same time
		catch (ArithmeticException | IOException e) {}		
		
		//most general. The developer don't know and looks bad to use
		catch (Exception e){
			System.out.println("Some error occurred");
		}
		//Always execute whether there was an exception or not
		//Used for clean up work like closing files and database connections
		finally {
			System.out.println(" ");
		}
		
	}

//2 new method
	public static int checkValidAge () {
		
		try {
			return userInput.nextInt ();
		} catch (InputMismatchException e) {
			userInput.next();
			System.out.println("That isn't a whole number");
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
//1 new method	
	public static void divideByZero (int a) {
		try {
			System.out.println(a/0);
		} catch (ArithmeticException e) {
			System.out.println("Sorry bruh!");
			//pre made java messages (error type)
			System.out.println(e.getMessage());
			//exception type and name
			System.out.println(e.toString());
		}
	}

}
