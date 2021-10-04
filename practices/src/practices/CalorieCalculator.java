package practices;

import java.util.ArrayList;
import java.util.Scanner;

public class CalorieCalculator {
	public static void main(String[] args) {
		int num=1, tot=0, temp =0;
		int calorie = 5;
		while(num>0) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID");
		System.out.println("Coffee:1");
		System.out.println("tea:2");
		System.out.println("Milk:3");
		
		num = sc.nextInt();
		System.out.println("Enter the quan");
		int quan = sc.nextInt();				
		switch(num) {
		
        case 1:
            tot=2*quan;
            
            break;
        case 2:
            tot=3*quan;
            break;
        case 3:
            tot=4*quan;
            
            break; 
           
        case 0:
        	  System.out.println("Thanks");
           
		}
		System.out.println("Your total is "+tot);
		temp=tot+temp;
		System.out.println("Your totalcost is "+temp);
		int diff = temp-calorie;
		System.out.println("Your have eaten "+ Math.abs(diff));
		
		 }
		
	}
	}
	

		/*String array[] = {"food1","food2","food3","food4" };
		int cost[] = {12,23,24,24};
		
		for(int i=0;i<array.length;i++) 
			System.out.println(array[i]);
				
				for (int j=0;j<array.length;j++) 
					System.out.println(cost[j]);
				}
	}*/


	/*Scanner scan=new Scanner(System.in);
	  int i=0;
	  double tot=0,price,vat,service,res=0,result;
	 System.out.println("\t\t\t\tWELCOME TO BEVERAGE SHOP");
	 System.out.print("User Name:");
	 String name=scan.next();
	 System.out.println("Hello!!!"+" "+name+" "+"Welcome...");
	 System.out.print("\n");
	 System.out.println("Please see our menu and select");
	 System.out.print("\n");
	 System.out.println("|\tPRODUCT ID\t|\t\tPRODUCT NAME\t\t|\tPRICE(LKR)\t|\n|\t1\t\t|\t\tTea\t\t\t|\t80\t\t|\n|\t2\t\t|\t\tCoffee\t\t\t|\t100\t\t|\n|\t3\t\t|\t\tIce Coffee\t\t|\t150\t\t|");
	 System.out.print("\n");
	 System.out.println("If you have selected the items you want,you can enter the product below");    
	 while(i>=0){
	     System.out.print("Product Id:");
	     int id=scan.nextInt();
	     System.out.print("Qyantity:");
	     double quan=scan.nextDouble();

	     System.out.println(id +":"+quan);

	     System.out.print("if you want to stop entering id and buy, please enter \"(-1)\" \nor you want to continue enter anothe number:");
	     int no=scan.nextInt();
	     if(no==-1){
	          result=res*quan;
	      System.out.println("Your Amount is: "+result);
	     }
	           
	     else{

	         switch(id){
	              case 1:
	                  tot=2*quan;
	                  break;
	              case 2:
	                  tot=3*quan;
	                  break;
	              case 3:
	                  tot=4*quan;
	                  break;   
	       }
	            res+=tot;  
	     }  
	 }
	  i++; 
}
}
	
	/*public void arrayList() {
		ArrayList<String> menu= new ArrayList<String>();
		ArrayList<Integer> quantity= new ArrayList<Integer>();
		 Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = input.nextInt();
		System.out.println("Enter the input");
       
          for (int i = 0;i<num;i++){
        	  String a =input.next();
        	 menu.add(a);
        }
         
        System.out.println(menu);
				
	}
	public void quantity() {
		System.out.println("how many did you eat?");
		
	}
public static void main(String[] args) {
	
	CalorieCalculator mybill = new CalorieCalculator();
	mybill.arrayList();
}
}
	
	/*private ArrayList<String>orderedFood;
	private ArrayList<Integer>orderedQuantity;
	
	void Bill() {
		orderedFood = new ArrayList<String>();
		orderedQuantity = new ArrayList<Integer>();
	}
	
	private double totalCost;
	public double getTotal() {
		return totalCost;
	}
	
	public void addOrder(String meal, int quantity,String dish[], double cost[]) {
	
		orderedFood.add(meal);
		orderedQuantity.add(quantity);
		for(int i = 0;i<dish.length;i++) {
			if(meal.equals(dish[i])) {
			totalCost +=quantity * cost[i];
			}
		}
	}
		public void getOrder() {
			for (int i = 0;i<orderedFood.size();i++) {
				System.out.println(orderedFood.get(i)+" "+orderedQuantity.get(i));
			}
		}
		public static void main(String[] args) {
			String dish[] = {"sandwich","coffee","salad","fries"};
			double cost[] = {12.2,23.2,10.9,8.9};
			CalorieCalculator mybill = new CalorieCalculator();
			mybill.addOrder("coffee", 2, dish, cost);
			mybill.getOrder();
			System.out.println(mybill.getTotal());
		}
	}

	/*int calorie;
	int pizza=400;
	int burger=200;
	int soup=300;
	int ice=250;
	
	public void method1() {
		
		int total = pizza+burger+soup;
		System.out.println(total);
	}
	public static void main(String[] args) {
		CalorieCalculator cc = new CalorieCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items did u eat today?");
		int items=sc.nextInt();
		System.out.println("Enter the items you ate today?");
		String input[] = new String[items];
		
		for(int i=0;i<items;i++) 
					input[i]=sc.next();
	
		System.out.println(cc.pizza+cc.soup+cc.burger);
	}
		
		
		
	/*public int CCmethod1(String array[]) {
		return pizza;
	}
	public int CCmethod1(int pizza, int burger) {
		 
		return pizza+burger;
	}
	public int CCmethod1(int pizza, int burger, int soup) {
		return pizza+burger+soup;
	}
	
	public static void main(String[] args) {
		CalorieCalculator cc = new CalorieCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many items did u eat today?");
		int items = sc.nextInt();
		System.out.println("What did you ate today?");
		String eat = sc.next();
		
		switch(eat) {
		
		case "pizza":
		
		int pizzaCal = cc.pizza;
		System.out.println(pizzaCal);
		break;		
		
		case "soup":
			int soupCal = cc.pizza;
			System.out.println(soupCal);
			break;	
		
		}*/
