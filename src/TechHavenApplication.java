
public class TechHavenApplication {

	/*
	 * Name: Shivaun, Nathan, Noor Date: November 25, 2024 Course: ICS3U1 - mr.
	 * Fernandes Title: TechHaven Laptops Description: A class that creates an array
	 * of all the laptop instances and runs the file reader to determine the values
	 * of their qualities. Major Skills: arrays, main method, creating a class,
	 * calling a method within a foreign class
	 */

	public static Laptop[] laptopArray = new Laptop[30];

	public static void main(String[] args) {
		FileInput.fillLibrary(); // Noor's file reader class, and corresponding class
		
		new Inventory();
	}

}
