package trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw {	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E://file.txt");
		FileReader fr = new FileReader(file);
	}
	
	
	
	/*static void checkSalary(int salary) {
		if(salary < 1000) {
			//This will be notified in the log if the condition met
			throw new ArithmeticException("Sorry, You are not allowed to own a yatch");
		}
		else {
			System.out.println("Congrtas! You can afford a yatch.");
		}			
	}
	public static void main(String[] args) {
		checkSalary(900);		
	}*/
}
//when an error occurs java will normally stop and generate error messages
//the technical term for this is: Java will throw an exception (throw an error)
//It allows you to create a custom error message for the user
