package over30;

public class enhancedForArray {
	public static void main (String args[]) {
		int bucky[] = {3, 4, 5, 6, 7};
		int total = 0;
		
		for (int x: bucky) { //only for arrays
			total += x;
			
		}
		System.out.println(total);
	}
}
