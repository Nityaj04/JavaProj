package oops;

public class Cars {
	
	//Creating class variables
	public int speed;
	public String name;
	public boolean suv;
	
	//Creating a constructor
	public Cars (int s, String n, boolean su) {
		speed = s;
		name = n;
		suv =su;
		
		System.out.println("The car " + name + " runs at the speed of " + speed );
		System.out.println("SUV: "+ suv);
		
	       }
	
	public static void main(String[] args) {
	//Creating an object
		Cars objOne = new Cars(80, "Corolla", false);
		
	
	}

}
