package over30;

public class tuna46 {
	private String first;
	private String last;
	private static int members = 0;
	
	public tuna46 (String fn, String ln) {
		first = fn;
		last = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in tha club: %d\n", first, last, members);
	}
	
	public String getFirst () {
		return first;
	}
	
	public String getLast () {
		return last;
	}
	
	public static int getMembers () {
		return members;
	}
	
}
