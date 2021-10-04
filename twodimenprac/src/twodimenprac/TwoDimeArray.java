package twodimenprac;

public class TwoDimeArray {

	//start of main method
	public static void main(String[] args) {
		
	//declaring two dimensional arrays
	int numbers[][]= {{1,2,3,4,5},{6,7,8,9,10}};
	String fruits[][]= {{"mango","apple","cherry"},{"grape fruit","pine apple"}};
	
	//creating an outer for loop
	for(int i=0;i<fruits.length;i++) {
		
	//creating an inner for loop
	for(int j=0;j<fruits[i].length;j++) {
	//printing elements of the array
	System.out.println(fruits[i][j]);
		}//end of the inner for loop
	
		}//end of the outer for loop
	for(int i=0;i<numbers.length;++i) {
		
	//creating an inner for loop
	for(int j=0;j<numbers[i].length;++j) {
	//printing elements of the array
	System.out.println(numbers[i][j]);

	}//end of main method

}
}
}