package space.co.work;

import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		int dat;
		String inputData = JOptionPane.showInputDialog("���Է�:");
		dat=Integer.parseInt(inputData);
		if(dat%10 == 0){
			System.out.println(dat+"(��)�� 10�� ����Դϴ�.");
		}else{
			System.out.println(dat+"(��)�� 10�� ����� �ƴմϴ�.");
		}
		
	}

}
