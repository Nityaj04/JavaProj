package newpractice;

import java.util.Arrays;
import java.util.Scanner;

public class NewPractice {
	
	private static String name;
	private static int number;
	
public NewPractice(String name, int number) {
		
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the name");
		String yourName=scanner.nextLine();
		
		System.out.println("Enter the number");		
		int myNumber = scanner.nextInt();
		
		NewPractice prac = new NewPractice(name, number);
				
}
}
	/*public static void methodOne (int arr[]) {
		//System.out.println("The smallest element is: ");
		int max = arr[0]; //
		for(int i =0;i<arr.length;i++) 
		if (arr[i]%2==0) 
		{
			System.out.println(arr[i]+" is an even number");
		}
		else
			System.out.println(arr[i]+ " is an odd number");
				}
	public static void main(String[] args) {
		int[] a = {23, 14, 16, 67};
		methodOne(a);
	}
	}
	
	/*public static void main(String[] args) {
		double[] values = new double[3];
		values[0] = 3.4f;
		values[1] = 4.5f;
		values[2] = 5.6f;
		
		for(int i = 0;i<values.length;i++) {
		
	System.out.println(Arrays.toString(values));
		}   doubt*/
		

	/*public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int var = scanner.nextInt();
	  
	  String[] myArray = new String[var];
	  
	  System.out.println("The array elements: ");
	  for(int i = 0; i<var;i++) {
		  myArray[i] = scanner.nextLine();
		  
		   }
	  for(String name:myArray)
		  System.out.println(name);
	  
	}
    
			
	}
		/*int num =98765;
		
		while (num>0) {
			int a = num%10;
			System.out.print(a);
			num=num/10;
			
		}*/
		
	     	
		/*
		 * 
		 * float[][] Flow = {{9.8f,89.9f, 34.9f,78.9f},{23.3f,34.2f,12.1f,34.2f}};
		 
		 
	     
		
		for(int i=0;i<Flow.length;i++) {
			for(int j=0;j<Flow[i].length;j++){
				System.out.println(Flow[i][j]);
				
			}
					
			}
		}
			
			}
	*/
	
	 /* {
	        Scanner console = new Scanner(System.in);
	        int num; // To hold number
	        int fact = 1; // To hold factorial
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	       
	        for(int i=1; i<=num; i++)
	        {
	            fact *= i;
	        }
	        
	        System.out.println("Factorial: "+ fact);

	}*/
    	  
	/*int times =1;
		Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the number: ");
        int var1 = scanner.nextInt();  
        
        for(int i=1;i<10;i++) {
        	times = var1*i;
        	System.out.println(var1+"*"+i+"="+times);
        }*/      
/*char choice;
	do
		{
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("Enter the first number: ");
	        int var1 = scanner.nextInt();
	        
	        
	        System.out.println("Enter the second number: ");
	        int var2 = scanner.nextInt();
	        
	        int sum = var1+var2;
	        System.out.println("The addition is:" + sum);
	        
	        System.out.println("Do you want to continue? y/n");
	        choice = scanner.next().charAt(0);       
	        
	      	}
	while(choice=='y'||choice=='Y');*/
		
		//for(int i=1; i<10; i++) {
		/*int i = 5;	
		System.out.println(++i);
		int x=i;
		System.out.println(x);
		int j=2;
		System.out.println(j++);
		System.out.println(j);
		System.out.println(i);*/
