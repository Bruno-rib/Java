package first1;

import java.util.Scanner;

public class object14 {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		tuna tunaObject = new tuna ();
		System.out.println("Enter name of first gf here: ");
		String temp = input.nextLine();
		tunaObject.setName(temp);
		tunaObject.saying();
	}
}
