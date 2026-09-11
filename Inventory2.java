//Nathan Zhuang

/* Glossary:
 * "A" - Works on the computer panel, including calling/creating arrays to create the computer images & icons via scrollpane
 * "'A"- Computer panel method
 * "B" - Works on the objects and their arrangement on the white-rounded box (sortingPanel)
 * "C" - Deals with the HOME, SURVEY, and CART button
 * "D" - Deals with the category panel, calling the labels and checkboxes so the user can control the laptops they see
 * "U" - All layered panels
 * "N" - Not in any letters
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.*;
import javax.swing.*;

// This class creates the GUI frame based on our sample prototype 
public class Inventory2 extends JFrame implements ActionListener {

	// ~ ~ ~ // // // // // // // CREATING ALL GUI ELEMENTS // // // // // // // ~ ~ ~ //
	
	// U // * // ~~~~ Creating Layered Panes ~~~~ // * // U //
	
	// ~ U1 - Creating the panel to organize the top part of the screen (cart button, home button, sortingPanel, etc)
	JLayeredPane topObjectsPanel = new JLayeredPane(); 
	
	// ~ U2 - Creating the panel to organize the top part of the screen (cart button, home button, sortingPanel, etc)
	JLayeredPane categoriesPanel = new JLayeredPane();
		//this creates a panel where different buttons or objects can be
		//modified above the other for reader's visibility
	

	
	// A1 // * // ~~~~ Creating ComputerPanelPane with SORTING Panel ~~~~ // * // A1 //

	// ~ A1.1. Calling the panel that STORES ALL COMPUTERS 
	JLabel computerPanelImage = new JLabel(new ImageIcon("images/panelComputers.jpg"));
	
	// ~ A1.2. Calling the image arrays
	
	//A1.2.1 - This is the panel to store each laptop and their label
	JPanel[] laptopPanelArray = new JPanel[30]; 
	
	//A1.2.2 - These refer to the 30 laptop images
	JLabel[] laptopImageArray = new JLabel[30];
	
	//A1.2.3 - This calls the label for each computer
	JLabel[] laptopTextArray = new JLabel[30];
	
	//A1.2.4 - This establishes the scroll panel
	JScrollPane laptopScrollPane = new JScrollPane(computerPanelImage);
	
	

	// B1 // * // ~~~~ Creating the SORTING Panel ~~~~ // * // B1 //
		
	// ~ B1.1. Creating the sortingPanel that would store the labels, buttons, and dropboxes  
	
	//B1.1.1 - Calling the sortingPanel IMAGE (LABEL)  
	JLabel sortingPanelImage = new JLabel(new ImageIcon("images/panelResults.jpg"));
	
	//B1.1.2 - Calling the sortingPanel panel in which the IMAGE (LABEL) would be compounded on
	JPanel sortingPanel = new JPanel();
	
	//B1.2. Creating the "30 results" label
	JLabel sortingLabel = new JLabel("30 Results");
	
	//B1.3. Creating the switch button
	JButton switchButton = new JButton(new ImageIcon("images/onSwitch.jpg"));
	
	//B1.4. Creating the "In Stock" label after the button and the "| sort" label before dropdown bestMatch
	JLabel stockSortLabel = new JLabel("In Stock   |   Sort: ");
	
	//B1.5. Creating the "Best Match" dropdown to categorize the way the computers appear
	String[] bestMatch = { "Lowest Price", "Highest Price", "Highest Rating"};
	JComboBox<String> bestMatchDropdown = new JComboBox<>(bestMatch);
	
	
	// C1 // * // ~~~~ Calling HOME, SURVEY, and CART ~~~~ // * // C1 //
	
	// ~ C1.1. Calling all the button panels (contains home, survey, and cart buttons) 
	
	//C1.1.1 - Calling the yellow-rounded box image to cold the "cart" label
	JButton yellowBorder = new JButton(new ImageIcon("images/YellowBorder.jpg")); // YellowBorder.jpg
	
	//C1.1.2 - Calling the cart BUTTON, which would then be positioned via topObjectsPanel (JLayeredPane)
	JButton cartButton = new JButton("Cart: ");
	
	//C1.1.3 - Calling the result which matches in accordance to the quantity the user chooses to purchase
	JLabel cartResult = new JLabel();
	
	//C1.1.4 - Calling the home and survey buttons
	JButton homeButton = new JButton("Home"); // this is the home button that would lead to the home GUI
	JButton surveyButton = new JButton("Survey"); // this is the survey button that would lead to the survey GUI

	
	
	// D1 // * // ~~~~ Creating the CATEGORY Panel ~~~~ // * // D1 //
	
	// ~ D1.1. Creating the category panel image
	JLabel panelCategoriesImage = new JLabel(new ImageIcon("images/panelCategories.jpg")); 
	
	
	// ~ D1.2. Creating the SEARCH label, textfield, and buttons
	//D1.2.1 - Creating the search label
	JLabel searchLabel = new JLabel("Search");
	
	//D1.2.2 - Creating the search bar
	JTextField searchBar = new JTextField();
	
	//D1.2.3 - Creating the search button
	JButton searchButton = new JButton(new ImageIcon("images/searchButton.jpg"));
	
	
	// ~ D1.3. Creating the PRICE RANGE label and checkboxes
	//D1.3.1 - Creating the price range label
	JLabel priceRangeLabel = new JLabel("Price Range");
		
	//D1.3.2 - Creating the price range array that stores three checkboxes
	JCheckBox [] priceRangeArray = new JCheckBox[3];
	
	//D1.3.3 - Creating the PANEL that would store all three checkboxes
	JPanel priceCheckBoxes = new JPanel(new GridLayout(3, 1)); //organizes placement of checkboxes
	
	
	// ~ D1.4. Creating the brand label and checkboxes
	//D1.4.1 - Creating the price range label
	JLabel brandLabel = new JLabel("Brand");
	
	//D1.4.2 - Creating the brand name array that stores eight checkboxes
	JCheckBox [] brandArray = new JCheckBox[8];
	
	//D1.4.3 - Creating the PANEL that would store all eight checkboxes
	JPanel brandArrayPanel = new JPanel(new GridLayout(8, 1)); //organizes placement of checkboxes
	
	
	// ~ D1.5. Creating the RATING label and checkboxes
	//D1.5.1 - Creating the price range label
	JLabel ratingLabel = new JLabel("Rating");
		
	//D1.5.2 - Creating the brand name array that stores three checkboxes
	JCheckBox [] ratingArray = new JCheckBox[3];
		
	//D1.5.3 - Creating the PANEL that would store all three checkboxes
	JPanel ratingArrayPanel = new JPanel(new GridLayout(3, 1)); //organizes placement of checkboxes
	
	
	// ~ D1.6. Creating the USAGE TYPE label and checkboxes
	//D1.6.1 - Creating the label
	JLabel usageLabel = new JLabel("Usage Type");
		
	//D1.6.2 - Creating the brand name array that stores four checkboxes
	JCheckBox [] usageArray = new JCheckBox[4];
		
	//D1.6.3 - Creating the PANEL that would store all four checkboxes
	JPanel usageArrayPanel = new JPanel(new GridLayout(4, 1)); //organizes placement of checkboxes
		
	
	// ~ D1.7. Creating the CPU TYPE label and checkboxes
	//D1.7.1 - Creating the cpu type label
	JLabel CPULabel = new JLabel("CPU Type");
		
	//D1.7.2 - Creating the brand name array that stores eight checkboxes
	JCheckBox [] CPUArray = new JCheckBox[8];
		
	//D1.7.3 - Creating the PANEL that would store all eight checkboxes
	JPanel CPUArrayPanel = new JPanel(new GridLayout(8, 1)); //organizes placement of checkboxes
	
	
	// ~ ~ ~ // // // // // // // CUSTOMIZING GUI // // // // // // // ~ ~ ~ //

	public Inventory2() {

		// N // * // ~~~~ Setting up the frame ~~~~ // * // N //
		setSize(1920, 1080); //setting up the size
		setTitle("TechHaven Laptops"); //creating a title
		setIconImage(new ImageIcon("images/TechHaven.jpg").getImage()); //creating the icon (next to title)
		setLayout(null); //allows for manual placing of elements on frame
		Color myColour = new Color(36, 136, 141); //setting the background color via RGB
		getContentPane().setBackground(myColour);
		
		

		// A // * // ~~~~ ComputerPanelPane ~~~~ // * // A //

		// ~ A2.1. Editing the size and layout of the computer displays
		
		//A2.1.1 - Setting the preferred dimensions of PANEL (computerPanelImage) to reinforce the previous size
		computerPanelImage.setPreferredSize(new Dimension(1400, 3500)); //(width, height) //O: 1400, 1800
		
		//A2.1.2 - Setting the layout (rows, columns) to match the display of 30 computers
		computerPanelImage.setLayout(new GridLayout(10,3)); //10 rows, 3 columns = 30 computers
		
		//*A2.1.3 - * Calling the laptop array that calls on fileInput to ensure that all images and pictures get uploaded *
		createLaptopPanels();
		
		// ~ A3 ~ Add the scrollPane to the frame
		laptopScrollPane.setBounds(508, 150, 1400, 780);
		add(laptopScrollPane); //adding the scroll bar onto the frame
		
		
		
		// B & C // * // ~~~~ Creating the top BUTTONS and SORTING PANEL ~~~~ // * // B & C //
		
		topObjectsPanel.setLayout(null); //this is to allow for the manual placing of objects
		
		// ~ B2.1. Creating the white-rounded box to allow for sorting of images
		sortingPanelImage.setBounds(500, 20, 1000, 100);

		// ~ B2.2. Creating the "30 results" label
		sortingLabel.setBounds(520, 45, 400, 55);	
		sortingLabel.setFont(new Font("Arial", Font.BOLD, 36));
		
		// ~ B2.3. Calling the SWITCH BUTTON
		switchButton.setBounds(720, 45, 120, 55);
		
		// ~ B2.4. Calling the "In Stock | Sort" Label
		stockSortLabel.setBounds(870, 45, 400, 55);
		stockSortLabel.setFont(new Font("Arial", Font.BOLD, 36));
        
		// ~ B2.5. Calling the dropdown JComboBox for "Best Match"
		bestMatchDropdown.setBounds(1175, 45, 310, 55);
		bestMatchDropdown.setPreferredSize(new Dimension(400, 200));
		bestMatchDropdown.setFont(new Font("Arial", Font.BOLD, 20));
		
		
		// ~ C2.1. Setting up the CART LABEL
		
		//C2.1.1 - Setting up the background of the cart label
		yellowBorder.setBounds(1560, 10, 342, 113); // set coordinates
		
		//C2.1.1.1 - Setting the yellow button color to match turquoise (#24888D)
		Color yellowBorderColor = new Color(36, 136, 141); // setting the colors via RGB
		yellowBorder.setBackground(yellowBorderColor); // compounding RGB color variable to set background
		yellowBorder.setOpaque(true); // ensures that the button background is transparent
		yellowBorder.setFocusPainted(false); // erases user selection of the button
		yellowBorder.setBorderPainted(false); // ensures that the button is colored accordingly
		
		//C2.1.1.2 - Setting up action listener for user interaction
	     yellowBorder.addActionListener(new ActionListener() {
	           
	    	//C2.1.1.2.1 - Creating a method that will react when yellowBorder is clicked
            public void actionPerformed(ActionEvent yellowBorderEvent) {
                
            	//This messagebox will appear when clicked
            	JOptionPane.showMessageDialog(null, "Cart clicked!", "Worked", JOptionPane.INFORMATION_MESSAGE);
	            }
	        });

		//C2.1.2 - Setting up the CART LABEL
		cartButton.setBounds(1580, 35, 300, 70);
		cartButton.setHorizontalAlignment(SwingConstants.LEFT); //this code sets the text to the left
		
		//C2.1.2.1 - Setting up action listener
		cartButton.addActionListener(this); //this button will react to the user clicking it
		
		//C2.1.2.2 - Adjusting the font and the background color of the button
		cartButton.setFont(new Font("Arial", Font.BOLD, 40));
		Color cartButtonColor = new Color(248, 238, 101); // setting the RGB color
		cartButton.setBackground(cartButtonColor);
		cartButton.setOpaque(true); // ensures that the background is transparent
		cartButton.setFocusPainted(false); // ignores user selection
		cartButton.setBorderPainted(false); // ensures that the button is colored accordingly

		// ~ C2.2 - Setting up HOME button
		homeButton.setBounds(30, 5, 200, 120); // adding the HOME button that would lead to the title frame
		homeButton.setFont(new Font("Arial", Font.BOLD, 36)); // setting the font (font type, style, size)
		
		// ~ C2.3 - Setting up SURVEY button
		surveyButton.setBounds(270, 5, 200, 120); // adding the SURVEY button that would lead to the survey frame
		surveyButton.setFont(new Font("Arial", Font.BOLD, 36)); // setting the font (font type, style, size)

		
		// ~ U1.1. Adding all components/objects onto the LAYERED PANEL
		topObjectsPanel.add(yellowBorder, Integer.valueOf(1));
		topObjectsPanel.add(cartButton, Integer.valueOf(2));
		topObjectsPanel.add(homeButton, Integer.valueOf(3));
		topObjectsPanel.add(surveyButton, Integer.valueOf(4));
		topObjectsPanel.add(sortingPanelImage, Integer.valueOf(5));
		topObjectsPanel.add(sortingLabel, Integer.valueOf(6));
		topObjectsPanel.add(switchButton, Integer.valueOf(7));
		topObjectsPanel.add(stockSortLabel, Integer.valueOf(8));
		topObjectsPanel.add(bestMatchDropdown, Integer.valueOf(9));

		// ~ U1.2. Adding the layered panel onto the frame
		add(topObjectsPanel);

		// ~ U1.3. Setting location of layered panel (x, y, width, height)
		topObjectsPanel.setBounds(0, 0, 1920, 130);

		
		
		// D // * // ~~~~ Creating the CATEGORIES panel ~~~~ // * // D //
		
		categoriesPanel.setLayout(null); //this is to allow for the manual placing of objects
		
		// ~ D2.1 - Setting up CYAN-ROUNDED BOX Image (label)
		panelCategoriesImage.setBounds(0, 0, 490, 780);
		
		
		// ~ D2.2 - Setting up SEARCH label, textfield, and button
		//D2.1.1 - Establishing the search label
		searchLabel.setBounds(35, 0, 200, 120);
		searchLabel.setFont(new Font("Arial", Font.BOLD, 24));
		
		//D2.1.2 - Modifying the location and size of the search bar
		searchBar.setBounds(30, 85, 300, 40);
		
		//D2.1.3 - Adjusting the location and size of the search button
		searchButton.setBounds(345, 85, 100, 40);
		
		
		// ~ D2.3 - Setting up the PRICE RANGE label and checkboxes
		priceRangeLabel.setBounds(35, 100, 400, 120);
		priceRangeLabel.setFont(new Font("Arial", Font.BOLD, 24));
		
		//D2.3.1 - Defining all three indexes in the array (setting up checkbox values)
		priceRangeArray[0] = new JCheckBox("$0 - $500");
		priceRangeArray[1] = new JCheckBox("$501 - $1000");
		priceRangeArray[2] = new JCheckBox("$1000 - $2000");
		
		//D2.3.2 - Creating a for-loop that will adjust each checkbox
		for (int index = 0; index < priceRangeArray.length; index ++) {
			
			//D2.3.2.1 - Adding EACH PRICE RANGE from the array to the PANEL
			priceCheckBoxes.add(priceRangeArray[index]);
			
			//D2.3.2.2 - Setting the proximity of the checkboxes (assisted by D1.3.2.2)
			priceRangeArray[index].setBounds(0, index * 2, 80, 50);
			priceRangeArray[index].setForeground(Color.WHITE);
			
		}
		
		//D2.3.3 - Setting the size of the CHECKBOXES PANEL
		priceCheckBoxes.setBounds(35, 180, 200, 80);
		
		//2.3.4 - Setting the color of the CHECKBOXES PANEL
		Color torquoise = new Color(36, 136, 141); //setting the background color via RGB
		priceCheckBoxes.setBackground(torquoise);
	
		
		
		// ~ D2.4 - Setting up the BRAND label and checkboxes
		brandLabel.setBounds(35, 230, 400, 120);
		brandLabel.setFont(new Font("Arial", Font.BOLD, 24));
		
		//D2.4.1 - Defining all eight indexes in the array (setting up checkbox values)
		brandArray[0] = new JCheckBox("Apple");
		brandArray[1] = new JCheckBox("Microsoft");
		brandArray[2] = new JCheckBox("Dell");
		brandArray[3] = new JCheckBox("HP");
		brandArray[4] = new JCheckBox("Asus");
		brandArray[5] = new JCheckBox("Acer");
		brandArray[6] = new JCheckBox("Lenovo");
		brandArray[7] = new JCheckBox("MSI");
		
		//D2.4.2 - Creating a for-loop that will adjust each checkbox
		for (int index = 0; index < brandArray.length; index ++) {
					
			//D2.4.2.1 - Adding EACH PRICE RANGE from the array to the PANEL
			brandArrayPanel.add(brandArray[index]);
					
			//D2.4.2.2 - Setting the proximity of the checkboxes (assisted by D1.3.2.2)
			brandArray[index].setBounds(0, index * 5, 80, 170);
			brandArray[index].setForeground(Color.WHITE);
					
		}
				
		//D2.4.3 - Setting the size of the CHECKBOXES PANEL
		brandArrayPanel.setBounds(35, 310, 200, 170);
		brandArrayPanel.setBackground(torquoise);
		
		
		
		// ~ D2.5 - Setting up the RATING label and checkboxes
		ratingLabel.setBounds(35, 449, 400, 120);
		ratingLabel.setFont(new Font("Arial", Font.BOLD, 24));
		
		//D2.5.1 - Defining all three indexes in the array (setting up checkbox values)
		ratingArray[0] = new JCheckBox("Highest Quality Rating");
		ratingArray[1] = new JCheckBox("Highest Speed Rating");
		ratingArray[2] = new JCheckBox("Highest Memory Rating");
		
		//D2.5.2 - Creating a for-loop that will adjust each checkbox
		for (int index = 0; index < ratingArray.length; index ++) {
			
			//D2.5.2.1 - Adding EACH PRICE RANGE from the array to the PANEL
			ratingArrayPanel.add(ratingArray[index]);
			
			//D2.5.2.2 - Setting the proximity of the checkboxes (assisted by D1.3.2.2)
			ratingArray[index].setBounds(0, index * 5, 80, 50);
			ratingArray[index].setForeground(Color.WHITE);
			
		}
		
		//D2.5.3 - Setting the size of the CHECKBOXES PANEL
		ratingArrayPanel.setBounds(35, 532, 200, 80);
		ratingArrayPanel.setBackground(torquoise);
		
		
		
		// ~ D2.6 - Setting up the USAGE TYPE label and checkboxes
		usageLabel.setBounds(265, 320, 400, 120);
		usageLabel.setFont(new Font("Arial", Font.BOLD, 24));
		
		//D2.6.1 - Defining all four indexes in the array (setting up checkbox values)
		usageArray[0] = new JCheckBox("Personal Use");
		usageArray[1] = new JCheckBox("Professional Use");
		usageArray[2] = new JCheckBox("Student Use");
		usageArray[3] = new JCheckBox("Gaming Use");
		
		//D2.6.2 - Creating a for-loop that will adjust each checkbox
		for (int index = 0; index < usageArray.length; index ++) {
			
			//D2.6.2.1 - Adding EACH PRICE RANGE from the array to the PANEL
			usageArrayPanel.add(usageArray[index]);
			
			//D2.6.2.2 - Setting the proximity of the checkboxes (assisted by D1.3.2.2)
			usageArray[index].setBounds(0, index * 5, 80, 50);
			usageArray[index].setForeground(Color.WHITE);
			
		}
		
		//D2.6.3 - Setting the size of the CHECKBOXES PANEL
		usageArrayPanel.setBounds(265, 405, 200, 100);
		usageArrayPanel.setBackground(torquoise);
		
			
		
		// ~ D2.7 - Setting up the CPU TYPE label and checkboxes
		CPULabel.setBounds(265, 100, 400, 120);
		CPULabel.setFont(new Font("Arial", Font.BOLD, 24));
		
		//D2.7.1 - Defining all eight indexes in the array (setting up checkbox values)
		CPUArray[0] = new JCheckBox("Core");
		CPUArray[1] = new JCheckBox("Celeron");
		CPUArray[2] = new JCheckBox("Athlon");
		CPUArray[3] = new JCheckBox("M-Series (Apple)");
		CPUArray[4] = new JCheckBox("Ryzen");
		CPUArray[5] = new JCheckBox("Snapdragon");
		CPUArray[6] = new JCheckBox("Intel");
		CPUArray[7] = new JCheckBox("MediaTek");
		
		//D2.7.2 - Creating a for-loop that will adjust each checkbox
		for (int index = 0; index < CPUArray.length; index ++) {
					
			//D2.7.2.1 - Adding EACH PRICE RANGE from the array to the PANEL
			CPUArrayPanel.add(CPUArray[index]);
					
			//D2.7.2.2 - Setting the proximity of the checkboxes (assisted by D1.3.2.2)
			CPUArray[index].setBounds(0, index * 5, 80, 170);
			CPUArray[index].setForeground(Color.WHITE);
					
		}
				
		//D2.7.3 - Setting the size of the CHECKBOXES PANEL
		CPUArrayPanel.setBounds(265, 180, 200, 170);
		CPUArrayPanel.setBackground(torquoise);
				
				
		
		// ~ U2.1. Adding all components/objects onto the LAYERED PANEL
		categoriesPanel.add(panelCategoriesImage, Integer.valueOf(1));
		categoriesPanel.add(searchLabel, Integer.valueOf(2));
		categoriesPanel.add(searchBar, Integer.valueOf(3));
		categoriesPanel.add(searchButton, Integer.valueOf(4));
		categoriesPanel.add(priceRangeLabel, Integer.valueOf(5));
		categoriesPanel.add(priceCheckBoxes, Integer.valueOf(6));
		categoriesPanel.add(brandLabel, Integer.valueOf(7));
		categoriesPanel.add(brandArrayPanel, Integer.valueOf(8));
		categoriesPanel.add(ratingLabel, Integer.valueOf(9));
		categoriesPanel.add(ratingArrayPanel, Integer.valueOf(10));
		categoriesPanel.add(usageLabel, Integer.valueOf(11));
		categoriesPanel.add(usageArrayPanel, Integer.valueOf(12));
		categoriesPanel.add(CPULabel, Integer.valueOf(13));
		categoriesPanel.add(CPUArrayPanel, Integer.valueOf(14));
		
		
		// ~ U2.2. Adding the categoriesPanel to the frame 
		add(categoriesPanel);
		
		// ~ U2.3. Setting location of layered panel (x, y, width, height)
		categoriesPanel.setBounds(10, 150, 490, 780);


		// N // ~ Display the frame ~ // N //
		setVisible(true);

	}

	// 'A // * // ~~~~ This method calls on the fileInput class to upload the information onto the computersPanel ~~~~ // * // 'A //
	private void createLaptopPanels() {
		
		//'~ A1 - This calls on the panel array, A1.2.1, which has 30 panels stored 
		for(int index = 0; index < laptopPanelArray.length; index++) {
		
			//'A1.1 - This calls the panel so that for every iteration out of 30, one panel would be created
			laptopPanelArray[index] = new JPanel();
			
			
			
			/*
			if (index % 2 == 0) {
				Color laptopPanelArrayColor = new Color(36, 136, 141);
				laptopPanelArray[index].setBackground(laptopPanelArrayColor);
			} else {
				Color laptopPanelArrayColor = new Color(91, 224, 229);
				laptopPanelArray[index].setBackground(laptopPanelArrayColor);
			}
			*/
			
			
			//'A1.2 - This calls the application method via fileInput to obtain the IMAGE of each picture
			laptopImageArray[index] = new JLabel(TechHavenApplication.laptopArray[index].getIcon());
			
			
			//'A1.3 - This calls the application method via fileInput to obtain the BRAND of each picture
			laptopTextArray[index] = new JLabel("\n" + TechHavenApplication.laptopArray[index].getBrand() + 
					" " + TechHavenApplication.laptopArray[index].getModel());
			
			
			// ~ A1.4 - Setting PROXIMITY of the laptop image and its labels (centered text with image above)
			
			//'A1.4.1 - Set the layout of the laptop panel to BoxLayout to permit VERTICAL STACKING
			laptopPanelArray[index].setLayout(new BoxLayout(laptopPanelArray[index], BoxLayout.Y_AXIS));
			//laptopPanelArray[index].add(Box.createVerticalStrut(10)); //This adds 10px of vertical space to the panel

			//'A1.4.2 - Make the text centered 
			laptopTextArray[index].setHorizontalAlignment(SwingConstants.CENTER);
			
			//'A1.4 - Adds both arrays onto the laptop panel
			laptopPanelArray[index].add(laptopImageArray[index]);
			laptopPanelArray[index].add(laptopTextArray[index]);
			
			//'A1.5 - Adds the laptopPanelArray onto the overall computerPanelImage (cyan-rounded box)
			computerPanelImage.add(laptopPanelArray[index]);
			
			//Note: The size of the panel should be determined based on the number of space
			//The label title and picture takes, which is set in fileInput class
			
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cartButton) {
			JOptionPane.showMessageDialog(null, "Cart clicked!", "Worked", JOptionPane.INFORMATION_MESSAGE);
		}

	}
	
	public void actionPerformedTwo(ActionEvent f) {
		if (f.getSource() == yellowBorder) {
			JOptionPane.showMessageDialog(null, "Cart clicked!", "Worked", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}




