package oops;

public class Plants {
	
	//Creating class variables
	public String plantOne = "Succulents";//
	public String plantTwo = "Herbs";
	
	//Creating a lowlight method
	public void lowLight() {
		System.out.println("They are low light indoor plants!");
	}
	
	//Creating a maintenanceLevel
	public static void maintenanceLevel() {
		System.out.println("They are Low maintenance plants!");
	}

	public static void main(String[] args) {
		
		//Creating objects 
		Plants succulent = new Plants();
		Plants herb = new Plants();
		
		//Accessing class variables
		System.out.println(succulent.plantOne);
		System.out.println(succulent.plantTwo);
		
		//Method call
		
		herb.lowLight();
		maintenanceLevel();

	}

}
