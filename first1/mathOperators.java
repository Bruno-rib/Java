package first1;

import java.util.Scanner;

public class mathOperators {
	Scanner bucky = new Scanner(System.in);
	
	int girls, boys, people;
	girls = 11;
	boys = 3;
	people = girls + boys;
	System.out.println(people);
	people = girls - boys;
	System.out.println(people);
	people = girls * boys;
	System.out.println(people);
	people = girls / boys;
	System.out.println(people);
	people = girls % boys;
	System.out.println(people);
	
	bucky.close();
}
