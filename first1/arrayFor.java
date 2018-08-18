package first1;

public class arrayFor {
	public static void main (String args[]) {
		System.out.println("index\tValur");
		int bucky[] = {32, 12, 18, 54, 2};
		
		for (int counter = 0; counter < bucky.length; counter++) {
			System.out.println(counter + "\t" + bucky[counter]);
		}
		
	}
}
