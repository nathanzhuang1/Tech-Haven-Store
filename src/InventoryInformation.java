
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.*;
import javax.swing.*;

public class InventoryInformation extends JFrame implements ActionListener {
	
	// E1 // * // ~~~~ Creating SHOP and CART button ~~~~ // * // E1 //
	
	// ~ E1.1. Calling all the button panels (contains shop, and cart buttons) 
	
	//E1.1.1 - Calling the yellow-rounded box image to cold the "cart" label
	JButton yellowBorderTorquoise = new JButton(new ImageIcon("images/YellowBorderTorquoise.jpg")); // YellowBorder.jpg
	
	//E1.1.2 - Calling the shop button
	JButton shopButton = new JButton("Shop");
	
	
	// F1 // * // ~~~~ Creating the COMPUTER INFO panel ~~~~ // * // F1 //
	
	// ~ F1.1. Calling the panel
	JLayeredPane inventoryInfoPanel = new JLayeredPane();
	
	JLabel inventoryInfoImage = new JLabel(new ImageIcon("images/InventoryInformation.jpg"));
	JLabel imageBorder = new JLabel(new ImageIcon("images/imageBorder.jpg"));
	JLabel computerTypeImage = new JLabel(new ImageIcon("images/computerTypeImage.jpg"));
	
	
	// G1 // * // ~~~~ Creating the PURCHASING and OVERVIEW panel ~~~~ // * // G1 //
	JPanel purchase = new JPanel();
	
	// H1 // * // ~~~~ Calling the SPECIFICATIONS panel ~~~~ // * // H1 //
	JLayeredPane specificationsPanel = new JLayeredPane();
	JLabel specificationsImage = new JLabel(new ImageIcon("images/specificationsImage.jpg"));
	
	
	// ~ ~ ~ // // // // // // // CUSTOMIZING GUI // // // // // // // ~ ~ ~ //
	
	public InventoryInformation() {
		
		// N // * // ~~~~ Setting up the frame ~~~~ // * // N //
		setSize(1920, 1080); // setting up the size
		setTitle("TechHaven Laptops"); //creating a title
		setIconImage(new ImageIcon("images/TechHaven.jpg").getImage()); // creating the icon (next to title)
		setLayout(null); // allows for manual placing of elements on frame
		Color myColour = new Color(36, 136, 141); // setting the background color via RGB
		getContentPane().setBackground(myColour);
		
		// E // * // ~~~~ Creating SHOP and CART button ~~~~ // * // E //
		
		//E1.1 - Setting up yellowBorder
		yellowBorderTorquoise.setBounds(1560, 10, 342, 113);
		yellowBorderTorquoise.setOpaque(true); // ensures that the background is transparent
		yellowBorderTorquoise.setFocusPainted(false); // ignores user selection
		yellowBorderTorquoise.setBorderPainted(false); // ensures that the button is colored accordingly
		add(yellowBorderTorquoise);
		
		//E1.2 - Setting up shopButton
		shopButton.setBounds(30, 30, 200, 80);
		shopButton.setFont(new Font("Arial", Font.BOLD, 36));
		add(shopButton);
		
		
		// F // * // ~~~~ Calling the COMPUTER INFO panel ~~~~ // * // F //
		
		inventoryInfoImage.setBounds(0, 0, 1200, 520);
		imageBorder.setBounds(45, 40, 540, 451);		
		computerTypeImage.setBounds(640, 13, 250, 42);
		
		
		inventoryInfoPanel.add(inventoryInfoImage, Integer.valueOf(1));
		inventoryInfoPanel.add(imageBorder, Integer.valueOf(2));
		inventoryInfoPanel.add(computerTypeImage, Integer.valueOf(3));
		
		inventoryInfoPanel.setBounds(30, 130, 1200, 520);
		add(inventoryInfoPanel);
		
		
		
		// G // * // ~~~~ Calling the PURCHASING and OVERVIEW panel ~~~~ // * // G //
		purchase.setBounds(30, 660, 1200, 275);
		purchase.setBackground(Color.WHITE);
		add(purchase);
		
		// H // * // ~~~~ Calling the SPECIFICATIONS panel ~~~~ // * // H //
		specificationsImage.setBounds(0, 0, 655, 805);
		
		specificationsPanel.add(specificationsImage, Integer.valueOf(1));
		
		specificationsPanel.setBounds(1243, 130, 655, 805);
		add(specificationsPanel);
		
		// N // ~ Display the frame ~ // N //
		setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


