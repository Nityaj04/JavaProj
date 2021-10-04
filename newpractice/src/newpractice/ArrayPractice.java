package newpractice;

public class ArrayPractice {

	public static void main(String[] args) {
		double[] array = {2.3,6.3,4.5,7.8,5.6};
		double sum =0.0;
		
		for(double num:array) {
			sum=num++;
		}
			double avg = sum/array.length;
System.out.println(avg);
	}

}
