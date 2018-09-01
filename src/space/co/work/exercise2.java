package space.co.work;

import javax.swing.JOptionPane;

public class exercise2 {

	public static void main(String[] args) {
		int a, b, c;
		a=Integer.parseInt(JOptionPane.showInputDialog("정수  a :"));
		b=Integer.parseInt(JOptionPane.showInputDialog("정수  b :"));
		c=Integer.parseInt(JOptionPane.showInputDialog("정수  c :"));
		
		if(a%2 == 1){
			System.out.println("");
		}else
			System.out.println(a);
		if(b%2 == 1){
			System.out.println("");
		}else
			System.out.println(b);
		if(c%2 == 1){
			System.out.println("");
		}else
			System.out.println(c);
		
	}
}