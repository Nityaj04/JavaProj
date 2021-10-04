
public class EnumExample {
	
	//Creating enum 
	public enum Colors{
		Orange,
		Red,
		Violet,
		White,
		Grey;

		}
	public static void main(String[] args) {
		//Calling a value 
		Colors color = Colors.Violet;
		
		//printing the value
		System.out.println(color);
		
		//Creating switch statements for all the values
		switch(color){
			case Orange:
				System.out.println("ORANGE");
				break;
				
			case Red:
				System.out.println("RED");
				break;
				
			case Violet:
				System.out.println("VIOLET");
				break;
				
			case White:
				System.out.println("WHITE");
				break;
				
			case Grey:
				System.out.println("GREY");
				break;
		}
		System.out.println(" ");
		
		//for loop to print the Color names
		for (Colors color1 : Colors.values()) {
			System.out.println(color1);
		}
	}

}
