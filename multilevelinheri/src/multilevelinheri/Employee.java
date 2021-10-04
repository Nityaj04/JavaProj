package multilevelinheri;

public class Employee extends Manager {
	
	//Overloaded Constructor 
	public Employee(String position, int ceoSal) {
		super(position, ceoSal);
		
	}

	//Method overridden
	public void companyName() {
		System.out.println("The company name : XYZ Company");
		
	}

	public static void main(String[] args) {
		
		Employee obj = new Employee("Tom", 20000);
		
		obj.salary();
		obj.manMethod();
		obj.companyName();
		
		
	}

}
