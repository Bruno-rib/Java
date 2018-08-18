package DereckBanas;

public class PolymorphismInheritance14 {
	public static void main (String[] args) {
		//creating a Animal object named genericAnimal
		Animals14 genericAnimal = new Animals14();
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		//creating a cat object
		Cat14 morris = new Cat14("Morris", "Tuna", "Rubber Mouse");
		
		//print out the name, favFood and favToy
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		//You can also create classes based on the super class
		Animals14 tabby = new Cat14("Tabby", "Salmon", "Ball");
		
		//you pass objects like any other field
		acceptAnimal(tabby);
		
		
	}
	
	public static void acceptAnimal(Animals14 randAnimal) {
		//Gets the name and favFood for the ANimal passed
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		System.out.println();
		
		/*
		 * This is polymorphism
		 * the interpreter automatically figures out what type
		 * of Animal it's dealing with and checks to make sure
		 * if methods were overwritten that they are called
		 * instead
		 */
		
		randAnimal.walkAround();
		System.out.println();
		/*
		 * The interpreter won't find anything that doesn't 
		 * originally exist in the Animal class however 
		 * System.out.println(randAnimal.favToy); Throws an ERROR
		 * If you want access to fields or methods only found 
		 * in the Cat class you have to cast the object to 
		 * that specific class first
		 */
		Cat14 tempCat = (Cat14) randAnimal;
		System.out.println(tempCat.favToy);
		
		//You could also cast the object directly like this
		System.out.println(((Cat14)randAnimal).favToy);
		
		/*
		 * You can use instanceof to check what type of object
		 * you have. This results in a positive for Animal
		 * and for Cat
		 */
		
		if (randAnimal instanceof Cat14) {
			System.out.println(randAnimal.getName() + " is a Cat");
		}
		
	}
	
	
	
	
	
	
}
