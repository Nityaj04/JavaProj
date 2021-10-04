package gettersandsetters;

import java.util.Scanner;

public class Desserts {
	//Creating variables 
	private String dessertName;	
	private int deliciousLevel;
	private double price;	
	
	public Desserts(String dessertName, int deliciousLevel, double price) {
		
		this.dessertName = dessertName;
		this.deliciousLevel = deliciousLevel;
		this.price = price;
	}
	public String getDessertName() {
		return dessertName;
	}
	public void setDessertName(String dessertName) {
		this.dessertName = dessertName;
	}
	public int getDeliciousLevel() {
		return deliciousLevel;
	}
	public void setDeliciousLevel(int deliciousLevel) {
		this.deliciousLevel = deliciousLevel;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the name of the dessert?");
		
		String dessertName = input.nextLine();
		
		System.out.println("What is the deliciousness level?");
		
		int deliciousLevel = input.nextInt();
		
		System.out.println("What is the price?");
		
		double price = input.nextDouble();
		
		Desserts fudge = new Desserts(dessertName,deliciousLevel,price);
	}

}
