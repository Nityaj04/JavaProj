package oops;

public class OopsExample {
		//Creating class variables
		public int shakesYear= 1564;
		public int lincolnYear= 1861;
		public int napYear= 1769;
		public boolean poet = true;
		public boolean president = true;
		public boolean emperor = false;
	
	public void greetingMethod(String name) {
		System.out.println("Welcome " + name + "! " );
		
	}
	public static void main(String[] args) {
		OopsExample myObjOne = new OopsExample();
		OopsExample myObjTwo = new OopsExample();
		OopsExample myObjThree = new OopsExample();
		
		System.out.println("William Shakespeare was born on " + myObjOne.shakesYear);
		System.out.println("Your are the greatest poet: " + myObjOne.poet);
		myObjOne.greetingMethod("William Shakespeare");
		
		System.out.println("Abraham lincoln was born on " + myObjTwo.lincolnYear);
		System.out.println("Your are the greatest president: " + myObjOne.president);
		myObjOne.greetingMethod("Abraham lincoln");
		
		System.out.println("Napoleon was born on " + myObjThree.shakesYear);
		System.out.println("Your are the greatest king: " + myObjOne.emperor);
		myObjOne.greetingMethod("Napoleon");

	}

}
