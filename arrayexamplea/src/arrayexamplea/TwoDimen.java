package arrayexamplea;

//start of class
public class TwoDimen {
	
	
	public static void main(String[] args) {//start of main method
		
	//Declaring a two dimensional array
	String twoDim[][]= {{"vanilla"," mint"," lemon"," pine apple"},{" chocolate"," black cherry"}};
	
	//printing favourite flavour
	//System.out.print("My favourite flavour is: "+twoDim[1] [1]);
	
	for(int i = 0;i<twoDim.length;i++) {
		for(int j = 0;j<twoDim[i].length;j++) {
			System.out.print(twoDim[i][j]);
		}
		System.out.println(" ");
	}
		
	}//end of main method
	
}
		
		
		/*int[][] arrayOne = {{1, 2, 3},{3, 4, 5},{5, 6, 7}};
		
		for(int i= 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arrayOne[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
*/
