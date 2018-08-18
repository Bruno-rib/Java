package DereckBanas;

/*
 * Cat is a Subclass of Animal
 * You create subclasses with the extends keyword
 * Now Cat has all the Methods and Fields that Animal defined
 * This is known as inheritance because Cat inherits all
 * the methods and fields defined in Animal
 */

public class Cat14 extends Animals14 {
	
	//You can add new fields to the subclass(super can not access)
	public String favToy = "Yarn";
	
	//You can add new methods
	public void playWith() {
		System.out.println("Yeah " + favToy);
	}
	
	//This method overrode the Animal walkAround method
	public void walkAround() {
		//this refers to a specific object created of type Cat
		System.out.println(this.getName() + " stalks around and then sleeps");
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	public Cat14() {
		
	}
	
	public Cat14(String name, String favFood, String favToy) {
		//super calls the constructor for the super class Animal
		super (name, favFood);
		//we set the favTOy value in Cat because it doesn't
		//exist in the Animal class
		this.favToy = favToy;
		
	}
	
	
	
	
	
	
}
