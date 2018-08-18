package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JPanel;

public class Gui74 extends JFrame {
	
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public Gui74 () {
		
		super("Title Bitch");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel, BorderLayout.CENTER);
		
		statusbar = new JLabel("Default");
		add(statusbar, BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
					
	}
	
	private class Handlerclass implements MouseListener, MouseMotionListener {
		public void mouseClicked (MouseEvent event) {
			statusbar.setText(String.format("Clicked at %d %d", event.getX(), event.getY()));
		}
		public void mousePressed (MouseEvent event) {
			statusbar.setText("You pressed down the mouse");
		}
		public void mouseReleased (MouseEvent event) {
			statusbar.setText("You released the button");
		}
		public void mouseEntered (MouseEvent event) {
			statusbar.setText("You entered the area");
			mousepanel.setBackground(Color.RED);
		}
		public void mouseExited (MouseEvent event) {
			statusbar.setText("The mouse has left the window");
			mousepanel.setBackground(Color.GREEN);
		}
		//these are mouse motion events
		public void mouseDragged (MouseEvent event) {
			statusbar.setText("You are dragging");
		}
		public void mouseMoved (MouseEvent event) {
			statusbar.setText("You moved the mouse");
		}
		
		
	}

}
