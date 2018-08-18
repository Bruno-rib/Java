package Intermediate;

public class threads26 {
	public static void main (String[] args) {
		
		Thread t1= new Thread(new Tuna26("one"));
		Thread t2= new Thread(new Tuna26("two"));
		Thread t3= new Thread(new Tuna26("three"));
		Thread t4= new Thread(new Tuna26("four"));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
