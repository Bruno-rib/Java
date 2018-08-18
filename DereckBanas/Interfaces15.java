package DereckBanas;

public class Interfaces15 {
	public static void main(String[] args) {
		
		Vehicle15 car = new Vehicle15(4, 100.0);
		
		//Using methods from the interface Drivable
		System.out.println("Cars Max Speed: " + car.getSpeed());
		System.out.println("Cars number of wheels: " + car.getWheels());
		
		//Using methods from abstract method Crashable
		car.setCarStrength(10);
		System.out.println("Car Strength: " + car.getCarStrength());
	}
	
	
}

/*
 *Interfaces allow you to make your code much more flexible. You'll be able to 
 * use multiple object types instead of one. You'll be able to easily add functionality
 *by putting it in an interface and then extending the class
 *
 *Java doesn't allow you to inherit from more than one
 *class. So, what do you do when you want to add additional functionality?
 *You create an interface. Interfaces are empty classes. Yhey provide all of the methods
 *you must use, but none of the code
 *
 *This is how you define an interface. They normally 
 *have a name that is an adjective. Adjectives modify
 *nouns. Most objects have noun names
 *
 */