package oops;

public class Animal {
	
	public String nameOne = "Simba";
	public String nameTwo = "Tiger";
	
	public void move() {
		System.out.println("Let's do a dance battle! ");
	}
	
	public static void main(String[] args) {
		
		Animal lion = new Animal();//Creating an object called lion
		Animal tiger = new Animal();//Creating an object called tiger
		
		System.out.println(lion.nameOne);
		System.out.println(tiger.nameTwo);
		
		lion.move();

	}

}
