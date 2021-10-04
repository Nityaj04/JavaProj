package interfacenew;

public interface Bank {
	
	//this will give the user info
	public void getUserInfo();
	public void interestCalculation(double balance);
	public void deposit(double balance, double d);
	public void withdraw(double balance, double w);
	public void transactionInput();
	public void bankNumberGeneration();
	
}
