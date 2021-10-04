package roses;

public class Rose implements PinkRoses, YelloRoses {
	
	public void vibes() {
		System.out.println("Nice Vibes");
	}
	public void aroma() {
		System.out.println("Nice Aroma");
	}
	public static void main(String[] args) {
		Rose roseObj = new Rose();
		roseObj.vibes();
		roseObj.aroma();

	}

}
