package DereckBanas;

/*
 * if you want to create a class in which every method 
 * doesn't have to be implemented use abstract classes
 * 
 * create an abstract class with the abstract keyword
 */

public abstract class Crashable15 {
	
	boolean carDrivable = true;
	
	public void youCrashed() {
		this.carDrivable = false;
	}
	
	public abstract void setCarStrength(int carStrength);
	
	public abstract int getCarStrength();
	
}
