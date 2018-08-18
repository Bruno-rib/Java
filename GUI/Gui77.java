package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui77 extends JFrame {
	
	private String details;
	private JLabel statusbar;
	
	public Gui77 () {
		super ("Title Bitch");
		
		statusbar = new JLabel ("this is default");
		add (statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
		
		
	}
	
	private class Mouseclass extends MouseAdapter {
		
		public void mouseClicked (MouseEvent event) {
			
			details = String.format("You clicked %d", event.getClickCount());
			
			if (event.isMetaDown()) 
				details += "with right mouse button";
			else if (event.isAltDown())
				details += "with center mouse button";
			else
				details += "with left mouse button";
			
			statusbar.setText(details);
			
		}
		
	}
	
}
