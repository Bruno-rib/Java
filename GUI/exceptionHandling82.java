package GUI;

import java.util.*;

public class exceptionHandling82 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		int x = 1;
		
		do {
			try {
				System.out.println("Enter first num: ");
				int n1 = input.nextInt ();
				System.out.println("Enter second num: ");
				int n2 = input.nextInt ();
				int sum = n1/n2;
				System.out.println(sum);
				x = 2;
			} catch (Exception e) {
				System.out.println("You cant use: " + e);
			}
		} while (x == 1);
		
		
		
		
	}
	
}