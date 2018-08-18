package GUI;

import javax.swing.JFrame;

public class drawingGraphics {
	public static void main (String[] args) {
		
		JFrame f = new JFrame("Title Bitch");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Peach84 p = new Peach84 ();
		f.add(p);
		f.setSize(400, 250);
		f.setVisible(true);
		
	}
	
	
}
