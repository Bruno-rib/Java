package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class peach85 extends JFrame {

	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	public peach85 () {
		super ("Title Bitch!");
		panel = new JPanel ();
		panel.setBackground(color);
		
		b = new JButton ("Choose a color");
		b.addActionListener(
			new ActionListener () {
				public void actionPerformed (ActionEvent event) {
					color = JColorChooser.showDialog(null , "Pick your color", color);
					if (color == null)
						color = (Color.WHITE);
					
					panel.setBackground (color);
				}
			}
		);
		
		add (panel, BorderLayout.CENTER);
		add (b, BorderLayout.SOUTH);
		setSize (425, 150);
		setVisible(true);
		
	}
	
}
