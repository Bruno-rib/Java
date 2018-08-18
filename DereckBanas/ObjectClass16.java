package DereckBanas;

public class ObjectClass16 {
	public static  void main (String[] args) {
		//Every object inherits all the methods in the object class
		
		Object superCar = new Vehicle15();
		
		/*
		 * superCar inherits all of the Object methods, but an object
		 * of class Object can't access the Vehicle methods
		 * System.out.println(superCar.getSpeed()); * Throws an error
		 * you can cast from type Object to Vehicle to access those methods
		 * 		
		 */
		System.out.println(((Vehicle15)superCar).getSpeed());
		
		//The methods of the Object class
		Vehicle15 superTruck = new Vehicle15();
		
		//equals tells you if two objects are equal
		System.out.println(superCar.equals(superTruck));
		
		//hashCode returns a unique identifier for an object
		System.out.println(superCar.hashCode());
		
		//finalize is called by the java garbage collector when an object
		//is no longer of use. If you call it there is no guarantee it will
		//do anything though
		//getClass returns the class of the object
		
		System.out.println(superCar.getClass());
		
		//THE CLASS OBJECT
		//You can use the Class object method getName to get just the classname
		
		System.out.println(superCar.getClass().getName());
		
		//You can check if 2 objects are of the same class with getClass()
		if (superCar.getClass() == superTruck.getClass()) {
			System.out.println("They are in the same class");
		}
		
		//getSuperClass returns the super class of the class
		System.out.println(superCar.getClass().getSuperclass());
		
		//the roString method id often overwritten for an object
		System.out.println(superCar.toString());
		
		//toString is often used to convert primitives to strings
		int randNum = 100;
		System.out.println(Integer.toString(randNum));
		
		/*
		 * THE CLONE METHOD
		 * clone copies the current values of the object and assigns
		 * them to another. If changes are made after the clone
		 * only the changed object is effected
		 */
		
		superTruck.setWheels(6);
		//is cast by clone method as Object so needs to CAST as Vehicle
		Vehicle15 superTruck2 = (Vehicle15)superTruck.clone();
		System.out.println(superTruck.getWheels());
		System.out.println(superTruck2.getWheels());
		
		//they are separate objects and don't have equal hashcodes
		System.out.println(superTruck.hashCode());
		System.out.println(superTruck2.hashCode());
		
		/*
		 * There are subobjects defined in an object close won't
		 * also clone them. You'd have to do that manually, but this 
		 * topic will be covered in the future because of complexity
		 */
		
		
		
	}

}
