package DereckBanas;

import java.util.Arrays;

public class arraysMulti9 {
	public static void main (String[] args) {
		
		/*MULTIDIMENSIONAL ARRAY
		 * 
		 */
		
		String[][] multiArray = new String[10][10];
		
		//the numbers inside are a string date type
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = i + " " + j;
			}
		}
		
		int k = 1;
		while (k < 61) {
			System.out.print("-");
			k++;
		}
		System.out.println();
		
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| " + multiArray[i][j] + " ");
			}
			System.out.println('|');
		}
		
		k = 1;
		while (k < 61) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		
		/*
		 * ONE DIMENSION ARRAY
		 * 
		 * an array is a variable that can hold a bunch of values 
		 * Think of an array as a big box filled with other bozes
		 * Each box has a number on it called an index that you use
		 * to access its specific value
		 * 
		 * an array can contain only values of the same type
		 * size can not be changed once it is set
		 * array is an object
		 */
		
		//an array is an object
		//here we declare an array and
		int[] randomArray;
		int[] numberArray = new int [10];
		
		randomArray = new int [20];
		randomArray[1] = 2;
		
		String[] stringArray = {"just", "random", "words"};
		
		//using loop to populate array
		for (int i = 0; i < numberArray.length; i++) {
			
			numberArray[i] = i;
			
		}
		
		//making a line with dashes
		k = 1;
		while (k <= 41) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		//for loop that represents array but does not print it
		for (int j = 0; j < numberArray.length; j++) {
			System.out.print("| " + j + " ");
		}
		System.out.println("|");
		
		//making a line with dashes
		k = 1;
		while (k <= 41) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		/*
		 * ENHANCED FOR LOOP
		 * for(itemDataType tempVariable : arrayName)
		 */
		
		for (int row : numberArray) {
			System.out.print(row);
		}
		System.out.println("\n");
		
		/*
		 * ENHANCED FOR LOOP - MULTIDIMENSION
		 * for(itemDataType tempVariable : arrayName)
		 */
		k = 1;
		while (k < 61) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		for (String[] rows : multiArray) {
			for (String columns : rows) {
				System.out.print("| " + columns + " ");
			}
			System.out.println("|");
		}
		
		k = 1;
		while (k < 61) {
			System.out.print('-');
			k++;
		}
		System.out.println();
		
		/*
		 * Using array library
		 */
		
		//start copying at zero
		int[] numberCopy = Arrays.copyOf(numberArray,	5);
		for (int row : numberCopy) {
			System.out.print("| " + row + ' ');
		}
		System.out.println('|');
		
		//start copying at defined
		Arrays.copyOfRange(numberArray, 3, 6);
		
		//print out
		System.out.println(Arrays.toString(numberCopy));
		
		//fill an entire array with the same number
		int[] moreNumbers = new int[100];
		Arrays.fill(moreNumbers, 2);
		
		//fill an entire multidimensional
		char[][] boardGame = new char[10][10];
		for (char[] row : boardGame) {
			Arrays.fill(row, '*');
		}
		
		//sort an array in ascending order
		int[] numToSort = new int [10];
		for (int i = 0; i < numToSort.length; i++) {
			numToSort[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(numToSort);
		System.out.println(Arrays.toString(numToSort));
		
		//binary search: will search for a value(if does not find returns a negative number)
		int whereIs50 = Arrays.binarySearch(numToSort, 50);
		System.out.println(whereIs50);
		
		
	}
}
