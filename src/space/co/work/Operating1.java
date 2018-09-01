package space.co.work;

import javax.swing.JOptionPane;

public class Operating1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("num1");
		int parseInput  = Integer.parseInt(input);

		
		String input_2 = JOptionPane.showInputDialog("num2");
		int parseInput_2 = Integer.parseInt(input_2);
		
		int result_1=parseInput+parseInput_2;
		int result_2=parseInput-parseInput_2;
		int result_3=parseInput*parseInput_2;
		int result_4=parseInput/parseInput_2;
		int result_5=parseInput%parseInput_2;
		
		System.out.println("더하기 " +result_1);
		System.out.println("빼기 " +result_2);
		System.out.println("곱하기 " +result_3);
		System.out.println("나누기 " +result_4);
		System.out.println("나머지 " +result_5);
	}

}
