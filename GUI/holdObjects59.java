package GUI;



public class holdObjects59 {
	public static void main (String[] args) {
		
		AnimalList60 ALO = new AnimalList60();
		dog59 d = new dog59();
		fish59 f = new fish59();
		ALO.add(d);
		ALO.add(f);
		
		System.out.println(" ");
		// tutorial 61
		animal59[] thelist = new animal59[2]; 
		dog59 d1 = new dog59();
		fish59 f1 = new fish59();
		thelist[0] = d1;
		thelist[1] = f1;
		
		for (animal59 x: thelist) {
			x.noise();
		}
	}
}
