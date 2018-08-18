package DereckBanas;

import java.util.Arrays;


public class Strings13 {
	public static void main (String[] args) {
		
		String randomString = "I'm just a randomString";
		
		//scape codes
		String gotToQuote = "He said, \"I'm here\"";
		
		/*
		 * other common scape codes
		 * \n : New line
		 * \b : Backspace
		 * \' : Apostrophe
		 * \" : Quote
		 * \\ : Backslash
		 */
		
		int bigInt = 2;
		
		//combine strings
		System.out.println(randomString + " "+ bigInt+ " " + gotToQuote);
		
		//convert any data type but char to string using toString
		String intString = Integer.toString(bigInt);
		
		//can also convert from string to primitives data types with parse
		int stringToInt = Integer.parseInt(intString);
		
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		//there is the method .equals & .equalsIgnoreCase
		if (uppercaseStr.equalsIgnoreCase(lowercaseStr)) {
			System.out.println("Same Letters");
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		System.out.println("2nd char: " + letters.charAt(1));
		//can be used with IgnoreCase
		//only compares to first letter
		System.out.println(letters.compareTo(moreLetters));
		System.out.println(letters.contains("abc"));
		//startsWith
		System.out.println(letters.endsWith("de"));
		System.out.println(letters.indexOf("cd"));
		/*
		 * You can also specify the index to start searching from
		 * indexOf(StringToLookFor, IndexStrtPosition)
		 * 
		 * lastIndexOf() works like indexOf except it starts from the 
		 * end of the String you are searching
		 */
		System.out.println("Length: " + letters.length());
		System.out.println(letters.replace("abc", "xy"));
		
		/*
		 * You can create an array of Strings with split()
		 * You define how to break up the String using a delimiter
		 * If you had 123,456 and used the delimiter "," you would
		 * create the array [123,456]
		 */
		String[] letterArray = letters.split("");
		System.out.println(Arrays.toString(letterArray));
		//works kind like split but separates each character
		char[] charArray = letters.toCharArray();
		System.out.println(Arrays.toString(charArray));
		System.out.println(letters.substring(1, 4));
		//toLowerCase
		System.out.println(letters.toUpperCase());
		
		String randString = "      ahdkhf      ";
		//delete all the white space at the beginning and end but not inside the string
		System.out.println(randString.trim());
		
		/*
		 * a string is immutable,which means every time you change
		 * a string a new version is created in memory
		 * If you manipulate Strings allot use a StringBuilder
		 * How to create a StringBuilder
		 * It has a fixed space in memory like an array
		 */
		StringBuilder randSB = new StringBuilder("A random value");
		//append makes a permanent change to StringBuilder
		System.out.println(randSB.append(" again"));
		System.out.println(randSB.delete(15, 21));
		//total space allocated for SB. probably works like a list
		randSB.ensureCapacity(60);
		System.out.println(randSB.capacity());
		//length returns the number of characters
		System.out.println(randSB.length());
		//trim the size of the capacity to the length of the string
		randSB.trimToSize();
		System.out.println(randSB.capacity());
		System.out.println(randSB.insert(1, "nother"));
		//convert string builder to a string
		String oldSB = randSB.toString();
		
		/*
		 * StringBuilders also have the same methods as Strings
		 * charAt(), indexOf(), lastIndexOf(), subString()
		 */
		
	}
	
	
	
	
	
}
