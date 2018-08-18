package DereckBanas;

public class Threads17 {
	public static void main (String[] args) {
		//Crate a new Thread that executes the code in GetTime20
		Thread getTime = new GetTime17();
		//Create a new Thread created using the Runnable interface
		//Execute the code in run after 10 seconds
		
		Runnable getMail = new GetTheMail17(10);
		Runnable getMailAgain = new GetTheMail17(20);
		
		//Call for the code in the method run to execute
		getTime.start();
		
		new Thread(getMail).start();
		new Thread(getMailAgain).start();
		
		
	}

}

/*
 * By using threads you can execute multiple blocks 
 * of code at the same time. 
 * 
 * A bloc of code is a thread means that is 
 * notifying the java interpreter that is not just 
 * going to run but other blocks of code are going to run
 * at the exactly same time
 * 
 */
