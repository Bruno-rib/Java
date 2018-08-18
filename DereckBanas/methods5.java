package DereckBanas;

import java.util.Scanner;// scanner is a class that contain pre made methods

public class methods5 {

	// "class" variable needs "static" to be accessible
	static double myPI = 3.14159;
	static int randomNumber;
	//creates a Scanner object that monitors keyboard input
	static Scanner userInput = new Scanner(System.in);
	
	//access modifier: determines who can execute a method (visibility)
	//static: be executed without an object
	//return type: The data type of value returned after a methodexecutes (void if none)
	//method name: must start with a letter
	//(parameters) : values passed to a method
	public static void main (String[] args) {
		
		//random number
		System.out.println("Random number: " + getRandomNum());
		int randomGuess = 0;
		int guessResult = 1;
		while (guessResult != -1) {
			System.out.print("Guess a number between 0 and 50: ");
			randomGuess = userInput.nextInt();
			guessResult = checkGuess (randomGuess);
		}
		System.out.println("Yes the random number is " + randomGuess);
		System.out.println();
		
		//pass by value
		int d = 5;
		tryToChange(d);//this method is receiving the value of d and not the variable d
		//then it can perform an operation using the value without changing the variable
		System.out.println("main d = " + d + "\n");
		
		
		System.out.println("Global: " + myPI);
		System.out.println(addThem (1, 2)); 
	}
	
	//random number method
	public static int getRandomNum () {
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
	}
	
	//guessing method
	public static int checkGuess (int guess) {
		if (guess == randomNumber) 
			return -1;
		else
			return guess;
	}
	
	//change values this "d" is a new variable from main
	public static void tryToChange (int d) {
		d = d + 1;
		System.out.println("tryToChange d = " + d);
	}
	
	
	//add numbers global vs local variable
	public static int addThem (int a, int b) {
		double smallPi = 3.140; //local variable
		double myPI = 3.0; //overwrite the value of global variable myPI
		System.out.println("Local: " + myPI);
		
		int c = a + b;
		return c;
	}
	
}
