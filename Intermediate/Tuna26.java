package Intermediate;

import java.util.*;

public class Tuna26 implements Runnable {
	
	String name;
	int time;
	Random r = new Random();
	
	public Tuna26(String x) {
		name = x;
		time = r.nextInt(999);
		
	}
	
	public void run() {
		try {
			System.out.printf("%s is sleeping for %d\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done \n", name);
		} catch (Exception e) {}
	}
	
	
}
