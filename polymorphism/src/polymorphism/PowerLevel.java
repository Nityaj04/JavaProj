package polymorphism;

public class PowerLevel {
	int powerlevel;
	public int powerlevel() {
		return powerlevel;
		
	}
	
	public void compare(String name, int powerlevel) {
		System.out.println();
		if (powerlevel<200) {
			System.out.println("Not Dangerous");
	}
		else
			System.out.println("Dangerous");
	}

}
