package space.co.work;

import javax.swing.JOptionPane;

public class exercise6 {

	public static void main(String[] args) {
		int total= 0;
		
		System.out.println("���� ������ �Է��Ͻʽÿ�. (0���� ����)");
		while(true){
			int input=0;
			input=Integer.parseInt(JOptionPane.showInputDialog("���� ������ �Է��Ͻʽÿ�. (0���� ����)"));
			if(input==0) break;
			total=total+input;
			 
					
		}
		System.out.println("���� ������ �հ�� "+total+"�Դϴ�.");
	}

}
