package homework;

public class LuxuryVacation {
	
	//protected variables
	protected String excursionOne = "Maldives";
	protected String excursionTwo = "Bali";
		
	//super class methods 
		public void LuxuryExcursion(String name) {
		System.out.println("Welcome to "+name);
		
	}
		public void greetings() {
			System.out.println("Have fun and enjoy your stay!");
		}
	
	public void excursionPlace(String excursion) {
		System.out.println("Thank you for choosing "+excursion+" excursion");
		if(excursion.equals("Maldives")) {
			System.out.println("We guarantee you will have a great experience at Maldives");
		}
		else
			System.out.println("We guarantee you will have a great experience at Bali");
	}

}
