 package arrayexamplea;

import java.util.Calendar;
import java.util.Scanner;

public class Practice {	
	public static void main(String[] args) {
		int sum=0;
		int i=1, num = 1;
		while(i<=num) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();	
		 
			sum=sum+i;
			i++;
			
			}
		System.out.println(sum);
	}
	}
		/*Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 0);
		  
		   System.out.println(cal.getTime()); 
		
	}
	}
		System.out.println("Enter number of students");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String name[] = new String[num];
		int age[] = new int[num];
		for(int i = 0;i<num;i++) {
			System.out.println("Enter name");
			name[i]=sc.next();
			System.out.println("Enter age");
			age[i]=sc.nextInt();
		}
		for(int i = 0;i<num;i++) {
			if(age[i] >=15) {
				System.out.println(name[i]+" is eligible for vaccine");
				System.out.println(name[i]+" age is "+age[i]);
			}
		}
	}
	
}

		
	/*	//Find smallest number in an array
	public static void method(int[] array) {
			int min = array[0];;
			for(int i= 1;i<array.length;i++) 
				
				if(min>array[i]) 
					min=array[i];
					System.out.println(min);
							
		}
		public static void main(String[] args)  {
			
			int[] a = {25,4,1,3};
			method(a);
	}
	}
		/*Multi-dimensional array
		String array[][]= {{ "Animal","Bird"},{ "Bear","Sparrow"},{"Cow","Dove"}};
		for(int i =0;i<3;i++) {
			for(int j=0;j<2;j++) {
				
				System.out.print(array[i][j]+ " ");
			}
				
			
			System.out.println();
		}
	}
}*/


		/*Random number
		 
		int randomNumber;
		int minimum = 10000;
		
		//set a maximum value
		int maximum = 100000;
		
		//generate a random number
		randomNumber = (int) ((Math.random()*maximum)-minimum);
		System.out.println("Your account number is: "+randomNumber);
			

	}Random number*/

		  
		/*System.out.println("test");
	}
	
	
		public static void main(String[] args) {
		
			Practice obj = new Practice() {
			@Override public void methodOne() {
				System.out.println("Testing");
						
			}
			};
			obj.methodOne();*/
			

			
			/*int result = 0;
			for (int i = 1; i < 3; ++i) {
			  if (i == 3) { //
			     result += 10;
			   } else { 
			     result += i; //0, 1,3, 			     
			   }	
			}
			System.out.println(result);*/
			
				/*Scanner scanner = new Scanner(System.in);
					String text = scanner.nextLine();
					char[] arr = text.toCharArray();

					for(int i = arr.length-1;i>=0;i--) {
						System.out.println(arr[i]);
					}*/
					
			/*Scanner scanner = new Scanner(System.in);
			int amount = scanner.nextInt();
						
			for(int month = 1; month<4; month++) {
			 int interest = (amount*10)/100;
				int remAmount = amount-interest;
				
				System.out.println(remAmount);
				amount=remAmount;*/
			
			
		

