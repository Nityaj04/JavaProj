package oops;
import java.io.*;
import java.util.Scanner;
public class Employee {
	
	//Creating class variables
	//Stores values for age, name, desig and salary
	//Can be used in any method of the class
	String name;
	int age;
	String designation;
	double salary;
	
	//Creating a constructor
	//initializes the name variable
   public Employee(String name) {
      this.name = name;
   }
   
   
  //Creating empAge method
   //Assigns the age of the employee to the variable age
   //helps passing the value age
   public void empAge(int empAge) {
      age = empAge;//Initializing age variable
   }
   
   //Creating empDesignation method
 //Assigns the designation of the employee to the variable designation
   //helps passing the value designation
   public void empDesignation(String empDesig) {
      designation = empDesig;//Initializing designation variable
   }
   
   //Creating empSalary method
 //Assigns the Salary of the employee to the variable Salary
   //helps passing the value Salary
   public void empSalary(double empSalary) {
      salary = empSalary;//Initializing salary variable
   }
   
   //Creating printEmployee method
   //to print enployee age, name, designation and salary
   public void printEmployee() {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
   }
   public static void main(String[] args) {
	  
	   	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter name");
	    String userName = myObj.nextLine();  // Read user input
	   
	    System.out.println("Enter age");
	    int age = myObj.nextInt();
	   
	    myObj.nextLine();
	   
	    System.out.println("Enter designation");
	    String designation = myObj.nextLine();
	   
	    System.out.println("Enter salary");
	    double salary = myObj.nextDouble();
	  
	    Employee obj1 = new Employee(userName);
	  
	    //Set values for the objects
	    obj1.empAge(age);
	    obj1.empDesignation(designation);
	    obj1.empSalary(salary);
	   
	    obj1.printEmployee();
	  }
}