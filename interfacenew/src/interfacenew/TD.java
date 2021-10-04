package interfacenew;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class TD implements Bank {
private String firstName;
private String lastName;
private String address;
private int id;

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public void bankNumberGeneration() {
	//Create a variable that will be a bank number
	double randomNumber;
	
	//set a minimum value
	int minimum = 10000;
	
	//set a maximum value
	int maximum = 100000;
	
	//generate a random number
	randomNumber = (int) ((Math.random()*maximum)+minimum);
	System.out.println("Your account number is: "+randomNumber);
}
	//this will generate new balance after applying interest
	public void interestCalculation(double balance) {
		balance = balance + (balance * 0.05);
		System.out.println("Your new balance with 5% interest is $" + balance);
	}
	public void deposit(double balance, double d) {
		
		balance = balance + d;
		System.out.println("You have deposited $" + d + " your new balance is: $" + balance);
	}
	public void withdraw(double balance, double w) {
	balance = balance - w;
	System.out.println("You have withdrawn $" + w +  " your new balance is: $" + balance);
}
	public void transactionInput() {

		//we need to create atleast 4 variables
		//because we are doing 2-D arrays 

		int m, n, i, j;
	
	//create a scanner object 
	Scanner sc = new Scanner(System.in);
	
	//we need to create the user input 
	System.out.print("Enter the number of rows: ");
	//we need to collect the number of rows - this is always a number
	m = sc.nextInt();
	//we need to collect the number of columns - this is always a number 
	System.out.print("Enter the number of columns: ");
	n = sc.nextInt();

	//we are declaring an array with the numbers entered 
	String array1[][] = new String[m][n];
	
	//prompt the user for enter of the stores 
	System.out.println("Enter the stores");

	//these will allow the user to enter the values inside the array
	//entering row info 
	for (i = 0; i < m; i++)
		//entering column info
		for (j = 0; j < n; j++)
			//collecting user input and adding to array
			array1[i][j] = sc.next();
	int array[][] = new int[m][n];
	System.out.println("Enter the amounts ");

	for (i = 0; i < m; i++)
		for (j = 0; j < n; j++)
			array[i][j] = sc.nextInt();
	System.out.println("The transaction history is as follows: ");
	for (i = 0; i < m; i++) {
		for (j = 0; j < n; j++)

			System.out.print(" " + array1[i][j] + " " + array[i][j]);
	}
	
	}
public void userInfo() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your first name");
	String fName = scanner.next();
	setFirstName(fName);
	
	System.out.println("Enter your second name");
	String sName = scanner.next();
	setLastName(sName);
	
	System.out.println("Enter your address");
	String address = scanner.next();
	setAddress(address);
	
	System.out.println("Enter your ID");
	int ID = scanner.nextInt();
	setId(ID);
	
	//no need of object creation
	//TD obj = new TD();
	
	System.out.println("Welcome" + getFirstName()+getLastName());
	}
@Override
public void getUserInfo() {
	// TODO Auto-generated method stub
	
}
public static void main(String[] args) {
	
	TD obj = new TD();
	obj.transactionInput();
}


}
