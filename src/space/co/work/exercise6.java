package space.co.work;

import javax.swing.JOptionPane;

public class exercise6 {

	public static void main(String[] args) {
		int total= 0;
		
		System.out.println("시험 점수를 입력하십시오. (0으로 종료)");
		while(true){
			int input=0;
			input=Integer.parseInt(JOptionPane.showInputDialog("시험 점수를 입력하십시오. (0으로 종료)"));
			if(input==0) break;
			total=total+input;
			 
					
		}
		System.out.println("시험 점수의 합계는 "+total+"입니다.");
	}

}
