package gettersandsetters;

public class Coffee {
	
	private String nameOfCoffee;
	private String brewType;
	
	public String getNameOfCoffee() {
		return nameOfCoffee;
	}
	public void setNameOfCoffee(String nameOfCoffee) {
		this.nameOfCoffee = nameOfCoffee;
	}
	public String getBrewType() {
		return brewType;
	}
	public void setBrewType(String brewType) {
		this.brewType = brewType;
	}
	 public static void main(String[] args) {
	 Coffee cappa = new Coffee();
	  	
	 cappa.setNameOfCoffee("Mocha");
	 System.out.println(cappa.getNameOfCoffee());
	 
	 cappa.setBrewType("Dark Roast");
	 System.out.println(cappa.getBrewType());
	 }
	
	}


