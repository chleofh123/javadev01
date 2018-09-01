package space.co.work;

import javax.swing.JOptionPane;

public class exercise1 {

	public static void main(String[] args) {
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("정수 a: "));
		b=Integer.parseInt(JOptionPane.showInputDialog("정수 b : "));
		
		if(a>b){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
			
	}

}
