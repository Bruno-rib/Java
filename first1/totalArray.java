package first1;

public class totalArray {
	public static void main (String args[]) {
		int bucky[] = {21, 16, 86, 21, 3};
		int sum = 0;
		
		for (int counter = 0; counter < bucky.length; counter++) {
			sum += bucky[counter];
		}
		
		System.out.println("The sum on these numbers is " + sum);
	}
}
