package multilevelinheri;

public class Ceo {
	//Creating Protected variables
	protected String position;
	protected int ceoSal;
	
	//Overloaded Constructor 
	public Ceo(String position, int ceoSal) {
		
		this.position = position;
		this.ceoSal = ceoSal;
	}

	//Method
	public void salary() {
		System.out.println("My Salary is : " + ceoSal);
		System.out.println("Employee Salary is : " + position);
		
	}
		
}
