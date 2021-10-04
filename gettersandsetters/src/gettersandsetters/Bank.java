package gettersandsetters;

public class Bank {
	//Creating private variables
	private String name = "Lloyds";
	private int accountNumer;
	private double balance;

	//Creating getter method for the name variable 
	public String getName() {
		return name;
	}
	
	//Creating setter method for the name variable
	public void setName(String name) {
		this.name = name;
	}
	
	//Creating getter method for the accountNumer variable
	public int getAccountNumer() {
		return accountNumer;
	}
	
	//Creating setter method for the accountNumer variable
	public void setAccountNumer(int accountNumer) {
		this.accountNumer = accountNumer;
	}
	
	//Creating getter method for the balance variable
	public double getBalance() {
		return balance;
	}

	//Creating setter method for the balance variable
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		//Creating an object 
		Bank bankObj = new Bank();
		
		//Accessing the getter and setter methods and printing the statements
		
		bankObj.setName("Lloyds Bank");
		System.out.println("The name of the bank is: " + bankObj.getName());
		
		
		bankObj.setAccountNumer(123456);
		System.out.println("Your account number is: " + bankObj.getAccountNumer());
		
		bankObj.setBalance(1234.456);
		System.out.println("Your account balance is: " + bankObj.getBalance());

	}

}
