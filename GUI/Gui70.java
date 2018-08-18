package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui70 extends JFrame{
	
	private JList list;
	private static String [] colornames = {"black", "blue", "red", "white"};
	private static Color[] colors = {Color.BLACK, Color.BLUE, Color.RED, Color.WHITE};
	
	public Gui70 () {
		super ("Title Bitch!");
		setLayout (new FlowLayout());
		
		JList<String> list = new JList<>(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
			new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent event) {
					getContentPane().setBackground(colors[list.getSelectedIndex()]);
				}
			}
		);
		
	}
}
