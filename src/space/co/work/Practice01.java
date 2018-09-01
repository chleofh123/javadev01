package space.co.work;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		double d_num1, d_num2;
		
		num1=5; num2=7; d_num1=2.4; d_num2=3.5;
		
		System.out.println("num1 : " + num1);
		
		num1=num2;
		System.out.println("num1 : " +num1);
		
		num2=num1+num2;
		System.out.println("num : " +num2);
		
		System.out.println("d_num1 : " + d_num1);
		
		d_num1=0.1;
		System.out.println("d_num1 : " + d_num1);
		
		d_num1=d_num1+d_num2;
		d_num2=d_num1-d_num2;
		System.out.println("d_num : " + d_num2);
	}

}
