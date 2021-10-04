package homework;

import java.util.Scanner;

public class CyberSec {

	//creating variables to store sensitive information
	private String name;
	private int age;
	
	//Creating a default constructor
	public CyberSec() {
		System.out.println("Welcome aboard!");
	}
	//Creating an overloaded constructor
	public CyberSec(String name, int age) {
		this.name = name;
		this.age = age;
		
	System.out.println("You are protected " + name +" "+age);
			}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
	//Creating a scanner object
		Scanner scanner  = new Scanner(System.in);
	
	//Prompting user for name input
		System.out.println("Enter your name");
		
	//Storing user name in a variable and reading it	
		String fullName = scanner.nextLine();
		
	//Prompting user for age input
		System.out.println("Enter your age");
		
	//Storing age in a variable and reading it
		int num = scanner.nextInt();
		
	//Creating an object to call the default constructor
		CyberSec defConObj = new CyberSec();
		
	//Creating an object to call overloaded constructor
		CyberSec consObj = new CyberSec(fullName,num);
		
	//Accessing private variables by calling getter and setters
		consObj.setName(fullName);
		System.out.println("Your user name is :" + consObj.getName()+num);
		
		consObj.setAge(num);
		System.out.println("Your Id is :" + consObj.getAge()+fullName);
		
		
		}
	}




