package Intermediate;

import java.util.*;

public class genericMethods17 {
	public static void main (String[] args) {
		
		Integer[] iray = {1, 2, 3, 4, 5};
		Character[] cray = {'b', 'u', 'c', 'k', 'y'};
		
		printMe(iray);
		printMe(cray);
		
	}
	
	//generic method
	public static <T> void printMe(T[] x) {
		
		for(T b: x)
			System.out.printf("%s ", b);
		System.out.println();
		
	}
	
	/*public static void printMe (Integer[] i) {
		for (Integer x: i)
			System.out.printf("%s ", x);
		System.out.println();
	}
	// overloaded methods
	
	public static void printMe (Character[] i) {
		for (Character x: i)
			System.out.printf("%s ", x);
		System.out.println();
	}*/
	
	
	
}
