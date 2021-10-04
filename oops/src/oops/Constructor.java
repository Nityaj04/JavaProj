package oops;

//Name of the class
public class Constructor {

	//Creating class variables
	int count;
	String name;
	double sal;
	
	public Constructor(int c, String n) {
		count = c;
		name = n;
		
	}
	public Constructor(double d) {
		sal = d;
		
	}
	public static void main(String[] args) {
		Constructor consOne = new Constructor(100, "Books");
		Constructor consTwo = new Constructor(200, "ebooks");
		Constructor consT = new Constructor(45.56);
		
		System.out.println("The count is: " + consOne.count + " The name is: " + consTwo.name);
		System.out.println(consT.sal);
	}

}
