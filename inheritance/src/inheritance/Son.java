package inheritance;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Son extends Father {
	public void commonMethod() {
		System.out.println("Son: I am a common method!");
	}
	
	

	public static void main(String[] args) {
		Son obj = new Son();
		System.out.println("Hair Color:" + obj.hairColor);
		System.out.println("Weight:" + obj.weight);
		obj.fatherMethod();
		obj.commonMethod();
		
		int i, j = 0, m, n, o, k;
		int calories [] = {1000, 1900, 2000};
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of days");
		m = scn.nextInt();
		
		System.out.println("Enter the number of foods");
		n = scn.nextInt();
		
		System.out.println("Enter the number of foods");
		o = scn.nextInt();
		
		String array1[][][] = new String[m][n][o];
		
		System.out.println("Enter the foods");
		
		for (i = 0; i < m; i++)
			//entering column info
			for (j = 0; j < n; j++)
				for (k = 0; k < o; k++)
		array1[i][j][o] = scn.next();
		System.out.println("Enter the count");
		int array2[][][] = new int[m][n][o];
		
		for (i = 0; i < m; i++)
			//entering column info
			for (j = 0; j < n; j++)
				for (k = 0; k < o; k++)
		array1[i][j][o]= scn.next();
		System.out.println("The transaction history is as follows: ");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++)

				System.out.print(" " + array2[i][j] + " " + array1[i][j]);
		}
		
		/*		for(int i=0;i<number;i++) {
			if(calorie[i]<=2200){
				System.out.println(calorie[i]+ " is not bad");
				System.out.println("You can walk 20 minutes");
			}
			if(calorie[i]>2200 && calorie[i]<=3000)  {
				System.out.println(calorie[i]+ " is bit higher than average daily intake ");
				System.out.println("You have to walk 6000 steps");
			}
			if(calorie[i]>3100 && calorie[i]<=4000) {
				System.out.println(calorie[i]+ " is bit higher than average daily intake ");
				System.out.println("You have to jog for 30 minutes");
			}
			if(calorie[i]>=4100 && calorie[i]<=5000) {
				System.out.println(calorie[i]+ " is bit higher than average daily intake ");
				System.out.println("You have to jog for 40 minutes");
			}
			if(calorie[i]<5000){
				System.out.println(calorie[i]+ " is bit higher than average daily intake ");
				System.out.println("You have to jog for 50 minutes");
			}
		}
		

	}*/

}
}