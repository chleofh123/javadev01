package space.co.work;

import javax.swing.JOptionPane;

public class InputTest {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("ù��° ���� �Է��ϼ���");
		int parseInput = Integer.parseInt(input);
		
		String input_2 = JOptionPane.showInputDialog("�ι�° ���� �Է��ϼ���");	
		int parseInput_2 = Integer.parseInt(input_2);
		
		int sum = parseInput + parseInput_2;
		
		System.out.println("�Է��� �� ���� ���� : " + sum);
	}

}
