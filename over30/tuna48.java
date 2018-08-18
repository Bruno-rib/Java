package over30;

public class tuna48 {
	private int sum;
	private final int NUMBER;
	
	public tuna48 (int x) {
		NUMBER = x;
	}
	
	public void add() {
		sum += NUMBER;
	}
	public String toString () {
		return String.format("sum = %d\n", sum);
	}
	
}
