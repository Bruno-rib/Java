package GUI;

public class AnimalList60 {
	private animal59 [] thelist = new animal59[5];
	private int i = 0;
	
	public void add(animal59 a) {
		if (i < thelist.length) {
			thelist[i] = a;
			System.out.println("Animal added at index " + i);
			i++;
		}
	}
}
