package first1;

public class ifStatement {
	public static void main (String args[]) {
		int age = 45;
		
		if (age > 60)
			System.out.println("You are a senior citizen");
		else if (age >= 50) 
			System.out.println("You are on your 50's");
		else if (age >= 40)
			System.out.println("You are on your 40's");
		else
			System.out.println("You are a young buck");
	}
}
