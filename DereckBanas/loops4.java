package DereckBanas;

import java.util.Scanner;

public class loops4 {
	static Scanner userInput = new Scanner(System.in); //required for user input
	public static void main (String[] args) {
		
		//for loop (declare iterator; conditional statement; change iterator)
		//can declare multiple iterators separated by commas
		for (int l = 10; l >= 1; l--) {
			System.out.print(l + " ");
		}
		System.out.println("\n");
		
		// doWhile loop at least once
		int k = 1000;
		do {
			System.out.println(k);
			k++;
		} while (k < 10);
		System.out.println();
		
		//while loop controlled by the user
		String contYorN = "Y";
		int h = 1;
		while (contYorN.equalsIgnoreCase("y")) { //uppercase or lowercase
			System.out.println(h);
			System.out.println("Continue y or n? ");
			contYorN = userInput.nextLine(); //read input entire line
			h++;
		}

		//CALCULATING Pi (4 - 4/3 + 4/5 - 4/7)
		double myPi = 4.0;
		double j = 3.0;
		
		while (j < 11) { // for 100000 = 3.14161
			myPi = myPi - (4/j) + (4/(j+2));
			j += 4;
			System.out.println(myPi + " ");
		}
		System.out.println("Value of PI: " + Math.PI + "\n");

		//WHILE
		int i = 1;
		while (i <= 20) {
			
			if (i == 3) { // skipping 3 and jump to five
				i += 2;
				continue;
			}
			
			System.out.printf("%d ", i);
			i++;
			
			if ((i % 2) == 0) { //only odd numbers
				i++;
			}
			
			if (i > 10) { //ends loop premature
				break;
			}
			
		}
		
	}
}
