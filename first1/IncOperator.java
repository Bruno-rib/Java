package first1;

import java.util.Scanner;

public class IncOperator {
	public static void main (String args[]) {
		Scanner bucky = new Scanner(System.in);
		
		int tuna = 5;
		int bass = 18;
		tuna++;
		--tuna;
		System.out.println (++tuna);
		
		bass += 5;
		System.out.println(bass);
		
		bucky.close();
	}
}
