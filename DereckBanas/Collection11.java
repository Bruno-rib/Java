package DereckBanas;

//array list automatically resize but waste memory
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class Collection11 {
	public static void main (String[] args) {
		
		ArrayList arrayListOne;
		arrayListOne = new ArrayList();
		
		/*
		 * Collection classes were created to make it easy to keep track
		 * of groups of objects. An ArrayList differs from an array in 
		 * that it automatically resizes itself. ArrayLists
		 * are easy to add to and delete from
		 * 
		 * ArrayList is an object
		 * no need to declare size and has default = 10
		 */
		
		ArrayList arrayListTwo = new ArrayList();
		
		//an ArrayList can accept any type object but you can specify 
		ArrayList<String> names = new ArrayList<String> ();
		
		names.add("John Smith");
		names.add("Mohamed Alami");
		names.add("Oliver Miller");
		
		//insert at 2
		names.add(2, "Jack Ryan");
		//replace at 0
		names.set(0,  "John Adams");
		//remove at 3
		names.remove(3);
		//names.removeRange(0, 1);      to remove more than one
		
		// .length for arrays and .size for ArrayList
		//print each element
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		for (String i : names) {
			System.out.println(i);
		}
		System.out.println();
		//print entire arrayList
		System.out.println(names);
		
		System.out.println();
		//the way to iterate before the enhanced for loop
		Iterator indivItems = names.iterator();
		//has next check for additional values and return a boolean
		while (indivItems.hasNext()) {
			System.out.println(indivItems.next());
		}
		
		ArrayList nameCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		//copy all the items
		nameCopy.addAll(names);
		
		String paulYoung = "Paul Young";
		names.add(paulYoung);
		
		//check an Array list for a value
		if (names.contains(paulYoung)) {
			System.out.println("\nPaul is here");
		}
		
		//check if one array contains everything from another array
		if (names.containsAll(nameCopy)) {
			System.out.println("\nEverything in nameCopy is in names");
		}
		
		//delete everything inside ArrayList
		names.clear();
		
		//check if is empty
		if (names.isEmpty()) {
			System.out.println("\nYes, names is empty");
		}
		
		//generic object Data type
		Object[] moreNames = new Object[4];
		//turn arrayList into a regular array
		moreNames = nameCopy.toArray();
		
		//now I can use array functions in it
		System.out.println(Arrays.toString(moreNames));
		
	}
}
