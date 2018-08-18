package GUI;

public class polymorphism55 {
	public static void main (String[] args) {
		
		food55 bucky[] = new food55[2]; //reference variable superclass
		bucky[0] = new tuna55(); // assign array to subclass
		bucky[1] = new potpie55();
		for (int x = 0; x < 2; x++) {
			bucky[x].eat();
		} // if there were more objects this command would loop all
		System.out.println("");
		// video 56
		fatty56 bucky1 = new fatty56 ();
		food55 po = new potpie55();
		bucky1.digest(po);
		
		//video 59
		
		
		
	}
}
