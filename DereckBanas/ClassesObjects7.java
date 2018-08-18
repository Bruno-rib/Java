package DereckBanas;

//class requires name started with capital letter
//a file can not contain 2 public classes (it can contain 2 or more private)
public class ClassesObjects7 {
	
	//constant
	public final String TOMBSTONE = "Here lies a Dead monster";
	
	//class variables or fields. Only the objects can change the value
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	//public variables. The less public fields the better
	public String name = "Big Monster";
	
	//access the value of attack without the option of modifying
	public int getAttack () {
		return attack;
	}
	//accessor methods
	public int getMovement() {
		return movement;
	}
	
	public int getHealth () {
		return health;
	}
	//modify the values following a specific parameter detailed inside method
	public void setHealth (int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	//overloaded method for function setHealth to accept two different data types
	public void setHealth (double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
	
	/*
	 * The constructor
	 * Code that is executed when object is created from this class definition
	 * The method name is the same as the class
	 * The constructor is only executed once per object
	 * The constructor can't return a value or have a return type (such as void)
	 */
	public ClassesObjects7(int newHealth, int newAttack, int newMovement) {
		
		//"this" a reference to the actual objects variables you are working with
		//this.health is the same as the private variable declared in the class
		//this.health == ClassesObjects7.health
		this.health = newHealth;
		this.attack = newAttack;
		this.movement = newMovement;
		
	}
	//overloaded constructor
	//The following constructor is the one created by the java interpreter by DEFAULT
	// if you don't create any other constructors (it does nothing)
	public ClassesObjects7 () {
		
	}
	
	//another overloaded method for example below
	public ClassesObjects7 (int newHealth) {
		health = newHealth;
	}
	
	public ClassesObjects7 (int newHealth, int newAttack) {
		// I am using the method above this(newHealth) == ClassesObjects7(newHealth)
		this (newHealth);
		attack = newAttack;
	}
	
	public static void main (String[] args) {
		ClassesObjects7 Frank = new ClassesObjects7 ();
		
		//because I am inside the class I can print the private field
		//if was in another class you would not be able to print
		//only if you use set and get methods
		System.out.println(Frank.health);
		System.out.println(Frank.attack);
		
		//outside the class you will need the get method
		System.out.println(Frank.getAttack());
	}
	
	
}
