package GUI;

import java.util.Formatter;

public class cratefile80 {
	private Formatter x;
	
	public void openFile () {
		
		try {
			x = new Formatter ("chinese.txt");
		}
		catch (Exception e) {
			System.out.println("you have an error");
		}
					
	}
	
	public void addRecords () {
		x.format("%s%s%s", "20 ", "Bucky ", "Roberts.\n");
	}
	
	public void closeFile () {
		x.close ();
	}
	
	
}
