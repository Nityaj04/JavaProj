package polymorphism;

public class MainCla {	
	
	public static void main(String[] args) {
		PowerLevel pl;
		pl = new Yeti();
		System.out.println("The power level of Yeti: " + pl.powerlevel());
		
		pl= new BigFoot();
		System.out.println("The power level of Bigfoot: " + pl.powerlevel());
		pl=new KinkKong();
		System.out.println("The power level of Kingkong: " + pl.powerlevel());
	}

}
