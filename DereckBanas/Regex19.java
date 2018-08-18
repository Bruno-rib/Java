package DereckBanas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex19 {
	public static void main (String[] args) {
		
		String longString = " Derek Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234 ";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";

		/*
		 [] Insert characters that are valid
		 [^ ] Insert characters that are not valid
		 \\s Any white space
		 \\S any non white space
		 {n,m} Whatever proceeds must occur between n and m times
		 */
		
		//WOrd must contain letter that are 2 to 20 characters in length
		//[A-Za-z]{2,20} Or \w{2,20}
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		
		/*
		 \\d Any digits 0-9
		 \\D Anything not a number
		 {n} Whatever proceeds must occur n times
		 */
		
		//Only 5 digits
		// \\s[0-9]{5}\\s or \\d{5}
		regexChecker("\\s\\d{5}\\s", longString);
		
		/*
		  | <-- Is used for OR clause situations		 
		 */
		
		//Must start with a A or C, followed by 1 letter in brackets
		//Must be a maximum of 3 characters in length
		//A[KLRZ]|C[AOT] ... means that starts with A and followed by K, L, R or Z
		regexChecker("A[KLRZ]|C[AOT]", longString);
		
		/*
		 {n,} Whatever proceeds must occur at least n times
		 + Whatever proceeds must occur one or more times
		 . ^ * + ? { } [ ] \ | ( ) Characters that must be escaped or backslashed
		  */
		
		//Grab any string that contains 1 or more! (minimum without maximum)
		regexChecker("(\\{{1,})", strangeString);
		regexChecker("(\\{+)", strangeString);
		
		//Get anything that occurs 3 timer except newline
		//   . Anything but newline
		
		regexChecker(".{3}", strangeString);
		
		/*
		 \\w Any word type character A - Z, a-z, 0-9, _
		 \\W Any non word character
		 * Occurs zero or more times
		 */
		regexChecker ("\\w*", strangeString);
		//checks for an email
		regexChecker("[A-Za-z0-9._\\%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", longString);
		
		// ? 0 or 1 of what proceeds it
		//find a phone number independent of format
		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		
		regexReplace(longString);

	}	
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		//you define your regular expression (REGEX) using pattern
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		//Creates a Matcher object that searches the String for
		//anything that matches the REGEX
		
		Matcher regexMatcher = checkRegex.matcher( str2Check );
		
		//Cycle through the positive matches and print them to screen
		//Make sure string isn't empty and trim off any whitespace
		
		while (regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim() );
				
				//You can get the starting and ending indexes
				
				System.out.println("Start index: "+ regexMatcher.start());
				System.out.println("End index: " + regexMatcher.end());
				
			}
		}
		System.out.println();
	}
	
	public static void regexReplace(String str2Replace) {
		//REGEX that matchers 1 or more white space
		//this specific patterns find spaces to clean up the code
		Pattern replace = Pattern.compile("\\s+");
		//This doesn't really apply, but this is how you ignore Case Sensitive letters
		//Pattern replace = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		
		//trim the string t prepare it for a replace
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		//replaceAll replaces all white space with commas
		
		System.out.println(regexMatcher.replaceAll(", "));
		
		
	}
	
	
	
	
	
		
}

/*
I got asked how to match any word that starts with a specific character
 and ends with another character using regular expressions. Here is
  the answer:This will work every time 
  (Even with numbers)(?<=\s|^)[Aa]\S+[Bb]\b If you want to 
  eliminate numbers do this (?<=\s|^)[Aa][A-Za-z]+[Bb]\b (?<=\s|^) 
  - The first character is a space or start of string [Aa] 
  - Match for A or a [A-Za-z]+ - Match for 1 or more characters [Bb] 
  - Match for B or b \b - Match for word boundary 
*/