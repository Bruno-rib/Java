package DereckBanas;

public class relationalLogicalSwitch3 {
	public static void main (String[] args) {
		
		int randomNumber = (int) (Math.random() * 50);
		//randomNumber = 44;
		
		//Relational Operators > < == != >= <=
		
		if (randomNumber < 25)
			System.out.println("The random number is less than 25");
		else if (randomNumber > 45)
			System.out.println("The random number is greater than 45");
		else if (randomNumber <= 40)
			System.out.println("Random number is less than 40");
		else 
			System.out.println("What a great number!");
		System.out.println("The random number is: " + randomNumber);
		
		/* Logical Operators
		 * Place before the statement
		 * !:    - Converts the to its right to its opposite
		 * &&:   - returns true if boolean values on the right and left are true
		 * Also && wont check the right value if left value is false
		 *  &:   - will check the right value even if left value is false
		 *  ||:  - Returns true if either boolean on the right or left are true, or both
		 *  if first is true it will ignore second one
		 *  |:   - wont ignore second one
		 *  ^:   - only if one is true and other false
		 * */
		
		if (!(false))
			System.out.println("\nWe made false into true");
		if ((true) && (true))
			System.out.println("Both have to be true");
		if ((false) || (true))
			System.out.println("Will print if any is true");
		if ((true) ^ (false))
			System.out.println("Needs one true and one false\n");
		
		
		int valueOne = (int) (1 + Math.random() * 6);
		int valueTwo = (int) (1 + Math.random() * 6);
		
		//ternary operator
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		System.out.println("Largest value between " + valueOne + " and " + valueTwo + " is equal to " + biggestValue);
		
		//switch statement needs a limited number of possible values
		char theGrade = 'F';
		
		switch (theGrade) {
		case 'a':
		case 'A': 
			System.out.println("Great Job");
			break; //optional if you wanna stop checking after statement is true
		case 'b':
		case 'B':
			System.out.println("Good Job");
			break;
		case 'c':
		case 'C':
			System.out.println("Ouch");
			break;
		case 'd':
		case 'D':
			System.out.println("You did ok");
			break;
		case 'f':
		case 'F':
			System.out.println("See you here next semester!");
			break;
		default:
			System.out.println("Invalid entry");
		}
		
		
		
	}
	
	
	
}
