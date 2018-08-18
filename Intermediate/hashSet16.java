package Intermediate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class hashSet16 {
	public static void main (String[] arg) {
		
		String[] things = {"apple", "bob", "ham", "bob", "bacon"};
		List<String> list = Arrays.asList(things);
 		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String> (list);
		System.out.printf("%s ", set);
		
	}
}
