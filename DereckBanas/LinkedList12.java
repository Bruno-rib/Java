package DereckBanas;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList12 {
	public static void main (String[] args) {
		
		//another type of collection
		//creates a linked list object 
		LinkedList linkedListOne = new LinkedList();
		
		//creater a linked list restricted that contains strings
		LinkedList<String> names = new LinkedList<String> ();
		
		names.add("Ahmed Bennani");
		names.add("Ali Syed");
		
		names.addLast("Nathan Martin");
		
		names.addFirst("Joshua Smith");
		//names.push("bang");
		
		names.add(0, "Noah Peeters");
		
		//replace a value
		names.set(2, "Paul Newman");
		
		names.remove(4);
		names.remove("Joshua Smith");
		
		
		
		for(String name: names) {
			System.out.println(name);
		}
		
		System.out.println("\nFirst Index: " + names.get(0));
		System.out.println("\nLast Index: " + names.getLast());
		
		LinkedList<String> nameCopy = new LinkedList<String>(names);
		System.out.println("\nnameCopy: " + nameCopy);
		System.out.println("\nnameCopy" + names);
		
		//contains a single object
		if (names.contains("Noah Peeters")) {
			System.out.println("\nNoahs Here");
		}
		
		//contains all
		if(names.containsAll(nameCopy)) {
			System.out.println("\nCollections the Same");
		}
		
		//find a value index
		System.out.println("\nAli index at: " + names.indexOf("Ali Syed"));
		System.out.println("\nList Empty: " + names.isEmpty());
		System.out.println("\nHow Many: " + names.size());
		//peek() retrieves the first element, but doesn't throw an error
		//if there is no element to retrieve
		System.out.println("Look without error: " + names.peek());
		System.out.println("\nremove first element: " + nameCopy.poll());
		System.out.println("\nremove last element: " + nameCopy.pollLast());
		
		nameCopy.push("Noah Peeters");
		nameCopy.pop();
		for (String name: nameCopy) {
			System.out.println(name);
		}
		
		
		//linked list to array
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		System.out.println(Arrays.toString(nameArray));
		
		names.clear();
		
		
	}
}

/*
 * ArrayLists are faster for search, while LinkedLists are better for deletions and inserts
 * LinkedLists take up more memory
 * 
 * The linkidList class is a collection based on a Linked List
 * instead of an array. They are particularly good when you
 * expect to perform many additions and deletions with a collection.
 * When using a linked list you don't have to move items around
 * when you add or delete an item. They aren't particularly suited to providing
 * access based off of index searches like an array though. Each object in a
 * linked list contains a pointer to the objects that proceed and follow
 * it. When you change an ArrayList a new array is created by it
 */