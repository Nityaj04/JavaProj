package oops;

public class Class {
	
	//Creating class variables
	public int age = 100;
	public boolean good = true;
	
	public void methodOne() {
		System.out.println("Message One");
	}
	public void methodTwo(String sentence) {
		System.out.println(sentence);
	}
	
	public static void main(String[] args) {
		Class myObjOne = new Class();
		Class myObjTwo = new Class();
		Class myObjThree= new Class();
		
		myObjOne.methodOne();
		myObjTwo.methodTwo("I am good");
		System.out.println(myObjTwo.age);
		
	}

}
