package first1;

import java.util.Scanner;

public class calculator {
	public static void main (String asgs[]) {
		Scanner bucky = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = bucky.nextDouble ();
		System.out.println("Enter second num: ");
		snum = bucky.nextDouble ();
		answer = fnum + snum;
		System.out.println(answer);
		
		bucky.close();
}
