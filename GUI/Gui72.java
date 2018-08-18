package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui72 extends JFrame {
	
	private JList leftlist;
	private JList rightlist;
	private JButton movebutton; // will actually copy
	private static String[] foods = {"bacon", "wings", "ham", "beef", "morebacon"};
	
	public Gui72 () {
		super ("Title Bitch");
		setLayout(new FlowLayout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton("Move -->");
		movebutton.addActionListener(
			new ActionListener () {
				public void actionPerformed (ActionEvent event) {
					rightlist.setListData(leftlist.getSelectedValuesList().toArray());
				}
			}	
		);
		add(movebutton);
		
		rightlist = new JList();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		//rightlist.setFixedCellHeight(15); visibleRowCount sets height
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add (new JScrollPane(rightlist));
		
		
		
	}
	
}
