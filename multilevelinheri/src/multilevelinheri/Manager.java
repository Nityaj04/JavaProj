package multilevelinheri;

public class Manager extends Ceo {
	
	//Overloaded Constructor 
	public Manager(String position, int ceoSal) {
		super(position, ceoSal);
		
	}

	public void manMethod() {
		System.out.println("I am the manager of the company");
	}
}
