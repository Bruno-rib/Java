package GUI;

import java.awt.*;
import javax.swing.*;

class drawingJava86 {
	public static void main (String[] args) {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Peach86 p = new Peach86();
		p.setBackground(Color.WHITE);
		f.add(p);
		f.setSize(500, 270);
		f.setVisible(true);
		
	}
}
