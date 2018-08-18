package Intermediate;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TheWindow24 extends JFrame {

	private JSlider slider;
	private drawOval23 myPanel;
	
	public TheWindow24 () {
		super("Title Bitch");
		myPanel = new drawOval23();
		myPanel.setBackground(Color.ORANGE);
		
		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 500, 10);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		
		slider.addChangeListener(
			new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					myPanel.setD(slider.getValue());
				}
			}
		);
		
		add(slider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
		
	}
	
}
