package over30;

class multipleConstructors39 {
	public static void main (String[] args) {
		
		tuna39 tunaObject = new tuna39 ();
		tuna39 tunaObject4 = new tuna39 (5);
		tuna39 tunaObject2 = new tuna39 (5, 13);
		tuna39 tunaObject3 = new tuna39 (5, 13, 43);
		
		System.out.printf("%s\n", tunaObject.toMilitary());
		System.out.printf("%s\n", tunaObject4.toMilitary());
		System.out.printf("%s\n", tunaObject2.toMilitary());
		System.out.printf("%s\n", tunaObject3.toMilitary());
		
	}
}
