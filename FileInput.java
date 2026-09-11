/* Name: Noor Zyni
 * Date: November 25th, 2024
 * Course: ICS3U1-05 - Mr.Fernandes
 * Description: A class that reads a text file and saves the inputs/information as individual laptops
 * Major Skills: Arrays, try and catch, for loops, 
 */



//import needed classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;

//Main Class
public class FileInput {


	// Method will read in text file and save each laptops attributes
	public static void fillLibrary() {

		try {

			Scanner inputFile = new Scanner(new File("data/laptops.txt"));

			inputFile.useDelimiter(",|\r\n"); //, means for every comma
													//\r\n means for every line break
			//useDelimiter means that for every word within the commas or for those that
			//have a line break, we assume that they will be assigned to things like "brand"
			//"model", etc.

			for (int index = 0; index < TechHavenApplication.laptopArray.length; index++) {
				String brand = inputFile.next();
				String model = inputFile.next();
				String type = inputFile.next();
				double price = inputFile.nextDouble();
				String cpuBrand = inputFile.next();
				String cpuType = inputFile.next();
				String cpuModel = inputFile.next();
				int cpuCore = inputFile.nextInt();
				double cpuSpeed = inputFile.nextDouble();
				int ram = inputFile.nextInt();
				int ssd = inputFile.nextInt();
				String gpuBrand = inputFile.next();
				String gpuModel = inputFile.next();
				String connectivity = inputFile.next();
				String operatingSystem = inputFile.next();
				double displaySize = inputFile.nextDouble();
				int resolutionWidth = inputFile.nextInt();
				int resolutionHeight = inputFile.nextInt();
				boolean touchScreen = inputFile.nextBoolean();
				double weight = inputFile.nextDouble();
				int qualityRating = inputFile.nextInt();
				int speedRating = inputFile.nextInt();
				int memoryRating = inputFile.nextInt();
				String hyperlink = inputFile.next();

				TechHavenApplication.laptopArray[index] = new Laptop(brand, model, type, price, cpuBrand, cpuType, cpuModel, cpuCore,
						cpuSpeed, ram, ssd, gpuBrand, gpuModel, connectivity, operatingSystem, displaySize,
						resolutionWidth, resolutionHeight, touchScreen, weight, qualityRating, speedRating,
						memoryRating, hyperlink);
				
				
				// A // * // ~~~~ Adding all images and labels onto laptopArray ~~~~ // * // A //
								
				// ~ A.1. Sets a variable to call the folder (image folder) - eg. Laptop0.jpg
				ImageIcon original = new ImageIcon("images/laptop" + index + ".jpg"); 
				
				// ~ A.2. This RESIZES images on Java by obtaining the 'original' image and altering the scale (getScaledInstance)
				ImageIcon scaled = new ImageIcon(original.getImage().getScaledInstance(400, 300, java.awt.Image.SCALE_SMOOTH)); 
				//was 200, 150
				
				// ~ A.3. Calls on Inventory application class, which has an array of 30, to insert each image of the laptop
				TechHavenApplication.laptopArray[index].setIcon(scaled);
				
				//NOTE: A.2. resizes the images while A2.1.1 in the Inventory class resizes the panel
				
				//
				//ImageIcon scaledTen = new ImageIcon(original.getImage().getScaledInstance(135, 100, java.awt.Image.SCALE_SMOOTH)); 
				//TechHavenApplication.laptopArray[10].setIcon(scaledTen);
				
				
				

			}

			inputFile.close();

		} catch (FileNotFoundException e) {
			System.out.print("File Error");
		}

	}

}
