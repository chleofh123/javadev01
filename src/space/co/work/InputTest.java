package space.co.work;

import javax.swing.JOptionPane;

public class InputTest {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("첫번째 숫자 입력하세요");
		int parseInput = Integer.parseInt(input);
		
		String input_2 = JOptionPane.showInputDialog("두번째 숫자 입력하세요");	
		int parseInput_2 = Integer.parseInt(input_2);
		
		int sum = parseInput + parseInput_2;
		
		System.out.println("입력한 두 수의 합은 : " + sum);
	}

}
