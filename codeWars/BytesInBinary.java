package codeWars;

import java.util.Scanner;

public class BytesInBinary {
	
	static Scanner userInput = new Scanner (System.in);
	
	
	public static void main (String[] args) {
		
		System.out.print("Enter a integer: ");
		int input = userInput.nextInt();
		
		int d = 0;
		double dn = 0;
		
		for (int i = 0; input > 0; i++) {
	        d = input % 2;
	        input = input / 2;
	        dn = dn + d * Math.pow (10, i);
	    }
		input = (int) dn;
	    System.out.println(input);
		
		
		
		
		
		
		
		
	}

}
