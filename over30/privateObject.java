package over30;

class privateObject {
	public static void main (String[] args) {
		tuna48 tunaObject = new tuna48 (10);
		
		for (int i = 0; i < 5; i++) {
			tunaObject.add();
			System.out.printf("%s", tunaObject);
		}
	}
}
