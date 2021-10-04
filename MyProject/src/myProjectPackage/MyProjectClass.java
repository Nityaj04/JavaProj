package myProjectPackage;
public class MyProjectClass {
	public static void myMethod(String model, int speed) {
	System.out.println("The private jet model is "+ model+" and speed is "+ speed);		
	}	
	public static void myMethod1(String name, int cost) {		
	System.out.println("The private yacht name is "+ name+" and cost is "+ cost+" Dollars");		
	}	

public static void main(String[] args) {
		myMethod("Boeing 74", 500);
		myMethod1("Destiny", 1000000);			
	}
}
