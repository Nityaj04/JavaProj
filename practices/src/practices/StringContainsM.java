package practices;

public class StringContainsM {
	
	public static boolean StringContainsM(String M) {
		//returning boolean true if the string has m
		//changes to lower case and matches with m
		return M.toLowerCase().matches(".*m.*");
		//return M.toLowerCase().contains("m");
	}

	public static void main(String[] args) {
		//function calls
		System.out.println(StringContainsM("Mango"));
		System.out.println(StringContainsM("Top"));
		System.out.println(StringContainsM("Mojmhjo"));
	}
	
	

}
