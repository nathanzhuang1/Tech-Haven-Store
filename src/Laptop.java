/* Nathan Zhuang
 * November 25, 2024 
 * ICS3U1 - 05
 * This is the inventory constructor method with getters and setters and a toString method
 * Major Skills: Calling private instance variables, assigning reference and primitive values, 
 * calling getter and setter methods, creating a toString method
 */

import javax.swing.JLabel;

public class Laptop extends JLabel {

	//This calls the private instance variables
	private String brand;
	private String model;
	private String type;
	private double price;
	private String cpuBrand;
	private String cpuType;
	private String cpuModel;
	private int cpuCore;
	private double cpuSpeed;
	private int ram;
	private int ssd;
	private String gpuBrand;
	private String gpuModel;
	private String connectivity;
	private String operatingSystem;
	private double displaySize;
	private int resolutionWidth;
	private int resolutionHeight;
	private boolean touchScreen;
	private double weight;
	private int qualityRating;
	private int speedRating;
	private int memoryRating;
	private String hyperlink;
	
	//This is the constructor method that associates a variable calling the 
	//private instance variable
	public Laptop(String brand, String model, String type, double price, 
				  String cpuBrand, String cpuType, String cpuModel, int cpuCore, double cpuSpeed, 
				  int ram, int ssd, String gpuBrand,
				  String gpuModel, String connectivity, String operatingSystem,
				  double displaySize, int resolutionWidth, int resolutionHeight,
				  boolean touchScreen, double weight, int qualityRating,
				  int speedRating, int memoryRating, String hyperlink) {
		
		//This calls the object class constructor
		super();
		
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.cpuBrand = cpuBrand;
		this.cpuType = cpuType;
		this.cpuModel = cpuModel;
		this.cpuCore = cpuCore;
		this.cpuSpeed = cpuSpeed;
		this.ram = ram;
		this.ssd = ssd;
		this.gpuBrand = gpuBrand;
		this.gpuModel = gpuModel;
		this.connectivity = connectivity;
		this.operatingSystem = operatingSystem;
		this.displaySize = displaySize;
		this.resolutionWidth = resolutionWidth;
		this.resolutionHeight = resolutionHeight;
		this.touchScreen = touchScreen;
		this.weight = weight;
		this.qualityRating = qualityRating;
		this.speedRating = speedRating;
		this.memoryRating = memoryRating;
		this.hyperlink = hyperlink;
	
	}


	//These are the getters and setter methods
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCpuBrand() {
		return cpuBrand;
	}


	public void setCpuBrand(String cpuBrand) {
		this.cpuBrand = cpuBrand;
	}


	public String getCpuType() {
		return cpuType;
	}


	public void setCpuType(String cpuType) {
		this.cpuType = cpuType;
	}


	public String getCpuModel() {
		return cpuModel;
	}


	public void setCpuModel(String cpuModel) {
		this.cpuModel = cpuModel;
	}


	public int getCpuCore() {
		return cpuCore;
	}


	public void setCpuCore(int cpuCore) {
		this.cpuCore = cpuCore;
	}


	public double getCpuSpeed() {
		return cpuSpeed;
	}


	public void setCpuSpeed(double cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getSsd() {
		return ssd;
	}


	public void setSsd(int ssd) {
		this.ssd = ssd;
	}


	public String getGpuBrand() {
		return gpuBrand;
	}


	public void setGpuBrand(String gpuBrand) {
		this.gpuBrand = gpuBrand;
	}


	public String getGpuModel() {
		return gpuModel;
	}


	public void setGpuModel(String gpuModel) {
		this.gpuModel = gpuModel;
	}


	public String getConnectivity() {
		return connectivity;
	}


	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}


	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public double getDisplaySize() {
		return displaySize;
	}


	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}


	public int getResolutionWidth() {
		return resolutionWidth;
	}


	public void setResolutionWidth(int resolutionWidth) {
		this.resolutionWidth = resolutionWidth;
	}


	public int getResolutionHeight() {
		return resolutionHeight;
	}


	public void setResolutionHeight(int resolutionHeight) {
		this.resolutionHeight = resolutionHeight;
	}


	public boolean isTouchScreen() {
		return touchScreen;
	}


	public void setTouchScreen(boolean touchScreen) {
		this.touchScreen = touchScreen;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getQualityRating() {
		return qualityRating;
	}


	public void setQualityRating(int qualityRating) {
		this.qualityRating = qualityRating;
	}


	public int getSpeedRating() {
		return speedRating;
	}


	public void setSpeedRating(int speedRating) {
		this.speedRating = speedRating;
	}


	public int getMemoryRating() {
		return memoryRating;
	}


	public void setMemoryRating(int memoryRating) {
		this.memoryRating = memoryRating;
	}


	public String getHyperlink() {
		return hyperlink;
	}


	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}


	//This converts the information to String value for the user to read
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", type=" + type + ", price=" + price + ", cpuBrand="
				+ cpuBrand + ", cpuType=" + cpuType + ", cpuModel=" + cpuModel + ", cpuCore=" + cpuCore + ", cpuSpeed="
				+ cpuSpeed + ", ram=" + ram + ", ssd=" + ssd + ", gpuBrand=" + gpuBrand + ", gpuModel=" + gpuModel
				+ ", connectivity=" + connectivity + ", operatingSystem=" + operatingSystem + ", displaySize="
				+ displaySize + ", resolutionWidth=" + resolutionWidth + ", resolutionHeight=" + resolutionHeight
				+ ", touchScreen=" + touchScreen + ", weight=" + weight + ", qualityRating=" + qualityRating
				+ ", speedRating=" + speedRating + ", memoryRating=" + memoryRating + ", hyperlink=" + hyperlink + "]";
	}
	
	
	
}
