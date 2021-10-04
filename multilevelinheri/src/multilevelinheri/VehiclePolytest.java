package multilevelinheri;

public class VehiclePolytest {

	public static void main(String[] args) {
		Vehicle v, v1, v2;
		v = new Vehicle();
		v1 = new Bus();
		v2 = new Train();
		
		Train t = new Train();
		
		System.out.println("Super class color" + v1.color);
		System.out.println(v1.color());
		System.out.println(v2.color());
		System.out.println(t.color());

	}

}
