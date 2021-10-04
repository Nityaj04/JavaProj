package abstractionpractice;

public class Abstest {

	public static void main(String[] args) {
		Plane p = new Plane();
		Vehicle v = new Plane();
		System.out.println(p.speed());
		p.color();
		p.name();
		v.name();
	}

}
