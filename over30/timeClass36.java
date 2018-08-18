package over30;

public class timeClass36 {
	public static void main (String args[]) {
		timeClass36Tuna tunaObject = new timeClass36Tuna();
		System.out.println(tunaObject.toMilitary());
		tunaObject.setTime(0, 27, 6);
		System.out.println(tunaObject.toMilitary());
		System.out.println(tunaObject.toString());
		
		tunaObject.setTime(13, 27, 6);
		System.out.println(tunaObject.toMilitary());
		System.out.println(tunaObject.toString());

		
	}
}
