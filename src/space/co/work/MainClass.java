package space.co.work;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.setWidth(5);
		int num1=Integer.parseInt(JOptionPane.showInputDialog("°ª1"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("°ª2"));
		
		FunTest2 Obj=new FunTest2();
		Obj.sum(num1, num2);
	}

}
