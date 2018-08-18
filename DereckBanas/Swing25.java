package DereckBanas;

import javax.swing.*;

import java.awt.event.*;

public class Swing25 extends JFrame {
	
	JButton button1;
	String InfoOnComponent = "";
	JList favoriteMovies, favoriteColors;
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;
	
	public static void main (String[] args) {
		new Swing25 ();
	}
	
	public Swing25 () {
		
		this.setSize(400, 400);
		this.setTitle("Window Wizard");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel thePanel = new JPanel();
		
		// Create a button
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		
		button1.addActionListener(lForButton);
		
		thePanel.add(button1);
		
		String[] movies = {"Matrix", "Minority Report", "Big"};
		
		//Creating a List Box
		favoriteMovies = new JList(movies);
		
		//Define the height of each cell
		favoriteMovies.setFixedCellWidth(150);
		
		/*
		 * Define how many selections can be made
		 * MULTIPLE_INTERVAL_SELECTION: Select what ever you want
		 * SINGLE_SELECTION: Select only one
		 * SINGLE_INTERVAL_SELECTION: Select as many as you want if in order
		 */
		
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		/*
		 * All the methods for lists
		 * getSelectedIndex(): returns the index for the first selected item
		 * getSelectedIndexes(): returns every selection in a list
		 * getSeletedValue(): returns the value of the first selected
		 * getSelectedValues(): returns an array of all values
		 * isSelectedIndex(): returns true is index is selected
		 */
		
		//You can't change items in a list unless you store the items in a DefaultListModel
		
		String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray", "Pink"};
		
		// How to load a String array into a DefaultListModel
		
		for (String color: colors) {
			defListModel.addElement(color);
		}
		
		// Add item named Purple to index number 2
		
		defListModel.add(2, "Purple");
		
		// Create a List box filled with items in the DefaultListModel
		
		favoriteColors = new JList (defListModel);
		
		//Only display 4 items at a time
		favoriteColors.setVisibleRowCount(4);
		
		// Create a scroll bar panel to hold the list box
		scroller = new JScrollPane(favoriteColors,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		// Define the height of each cell
		favoriteColors.setFixedCellHeight(30);
		
		// Define the width of each cell
		favoriteColors.setFixedCellWidth(150);
		
		thePanel.add(favoriteMovies);
		
		// Add the scroll bar container, not the list
		thePanel.add(scroller);
		this.add(thePanel);
		this.setVisible(true);
		
	}
	
	private class ListenForButton implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
	
}
