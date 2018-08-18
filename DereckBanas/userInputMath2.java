package DereckBanas;

// * uploads all libraries
import java.util.Scanner;

//same as the name as your java file
public class userInputMath2 {
	
	//input from user
	//scanner is object. System.in specifies the keyboard
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Your favorite number: ");
		
		//if: conditional action if something is true
		//hasNextInt method: if the next thing typed in the keyboard is an integer 
		//works for .hasNextDouble float boolean byte long short
		if (userInput.hasNextInt()) {
			
			//can be nextDouble or Float or Line. Program will crash in case of wrong input
			int numberEntered = userInput.nextInt();
			System.out.println("You entered " + numberEntered);
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
			
			int numEnteredMinus2 = numberEntered - 2;
			System.out.println(numberEntered + " - " + 2 + " = " + numEnteredMinus2);
			
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
			
			int numEnteredDivide2 = numberEntered / 2;
			System.out.println(numberEntered + " / " + 2 + " = " + numEnteredDivide2);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % " + 2 + " = " + numEnteredRemainder);
			
			numberEntered += 2;
			numberEntered -= 1;
			
			//print number and then performed unit operation
			numberEntered--;
			numberEntered++;
			
			//perform unit operation and then print the number
			++numberEntered;
			
			//absolute value
			int numberABS = Math.abs(numberEntered);
			System.out.println("The absolute value is: " + numberABS);
			
			//evaluate which number is bigger
			int whichIsBigger = Math.max(5, 7); //7
			int whichIsSmaller = Math.min(5, 7); //5
			System.out.printf("The greatest value is %d and the smallest value is %d\n", whichIsBigger, whichIsSmaller);
			
			//square root Math class using sqrt method
			double numSqrt = Math.sqrt(24);
			System.out.println("Square root of 24 is: " + numSqrt);
			
			//to use ceiling you must transform variable to integer. GOES RIGHT
			int numCeiling = (int) Math.ceil(numSqrt);
			System.out.println("Ceiling = " + numCeiling);
			//GOES LEFT
			int numFloor = (int) Math.floor(numSqrt);
			System.out.println("Floor = " + numFloor);
			//round to closer integer
			int numRound = (int) Math.round(numSqrt);
			System.out.println("Round = " + numRound);
			
			numSqrt *= -1;
			System.out.println("Sqrt of 24 * -1 = " + numSqrt);
			//to use ceiling you must transform variable to integer. GOES RIGHT
			int numCeilingNeg = (int) Math.ceil(numSqrt);
			System.out.println("Ceiling = " + numCeilingNeg);
			//GOES LEFT
			int numFloorNeg = (int) Math.floor(numSqrt);
			System.out.println("Floor = " + numFloorNeg);
			//round to closer integer
			int numRoundNeg = (int) Math.round(numSqrt);
			System.out.println("Round = " + numRoundNeg);
			
			//can be any type, but int makes sense. format requires outer parenthesis
			int randomNumber = (int) (Math.random() * 100);
			System.out.println("Random number between 0 and 100 = " +  randomNumber);
			
			
		} else {
			
			System.out.println("Enter an integer next time");
			
		}
		
		
	}
	

}
