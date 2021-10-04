package oops;

public class MapleTree implements Trees {
	public void aestheticPurpose() {
		System.out.println("It enhances the beauty");
	}
	public void givesRain() {
		System.out.println("It makes raining!");
	}

	public static void main(String[] args) {
		
		MapleTree mp = new MapleTree();
		
		mp.givesRain();
		mp.aestheticPurpose();
	}
		
}
