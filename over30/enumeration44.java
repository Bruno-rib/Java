package over30;

import java.util.EnumSet;

class enumeration44 {
	public static void main (String[] args) {
		for (tuna44 people : tuna44.values()) { // built in array for enumeration
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
		System.out.println("\nAnd now for the range of constants!!!\n");
		
		for (tuna44 people : EnumSet.range(tuna44.kelsey, tuna44.candy)) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
		}
	}
}
