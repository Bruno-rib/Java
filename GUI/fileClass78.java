package GUI;

import java.io.File;
import java.util.*;

class fileClass78 {
	public static void main (String[] args) {
		
		final Formatter x;
		try {
			x = new Formatter("fred.txt");
			System.out.println("You created a file");
		}
		catch (Exception e) {
			System.out.println("You got an error");
		}
		
		
		File y = new File ("C:\\Users\\BrunoSR\\eclipse-workspace\\first1\\fred.txt");
		
		if (y.exists()) 
			System.out.println(y.getName() + " exists!");
		else 
			System.out.println ("this thing does not exist");
		
		
		
	}
}
