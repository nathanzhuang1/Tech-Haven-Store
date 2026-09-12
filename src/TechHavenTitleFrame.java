/*
 * Name: Shivaun, Nathan, Noor

 * Date: November 25, 2024
 * Course: ICS3U1 - mr. Fernandes
 * Title: TechHaven Laptops
 * Description: A class that creates the swing title frame for the application
 * Major Skills: amain method, using various swing elements such as ActionListener, JLabels, JButtons, etc.
 */
 


import java.awt.event.*;

import javax.swing.*;


//Class Comment Name, Date, Description
public class TechHavenTitleFrame extends JFrame implements ActionListener {
	
	//GUI elements (FROM PROTOTYPE)
	private JLabel titleLabel = new JLabel("Laptop Store");
	private ImageIcon logo= new ImageIcon("images/logo.png");
	private JLabel logoLabel = new JLabel (logo);
	private JButton templateButton = new JButton("Template Frame");
	
	//Constructor Method
	public TechHavenTitleFrame() {

		//1. Setup the frame
		setSize(1008, 700);
		setIconImage(logo.getImage());
		setTitle("App Name Screen Title");
		setLayout(null);
		//2. Add the GUI elements
		
		//2.1 Add the title to the frame 
		titleLabel.setBounds (460, 25, 100, 50); 
		add(titleLabel);
		//2.2 Add the logo to the frame 
		logoLabel.setBounds (440, 75, 120, 120); 
		add(logoLabel);
		//2.3 Add the sample button to the frame 
		templateButton.setBounds(480,258,208,58);
		templateButton.addActionListener(this); //Add this for elements that have actions
		add(templateButton);
		//3. Make the frame visible
		setVisible(true);
	}
	
	//This method controls the actions.
	@Override
	public void actionPerformed(ActionEvent event) {

	//1. If the template button is clicked then show the Template frame
		if (event.getSource() == templateButton) {
			setVisible(false);					//hide the current frame
			//new LaptopStoreTemplateFrame();		//create the new frame
		}
	}
}
