package space.co.work;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Index implements ActionListener {
	JButton btnNewButton;
	JTextField textField;
	
	public Index() {
		JFrame frame = new JFrame("Title");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		btnNewButton = new JButton("�˻�");
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		
		JLabel label = new JLabel("��ǳ �ָ��� �����ϼ���");
		panel.add(label);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		frame.validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnNewButton) {
			System.out.println("�Է� : " + textField.getText());
		}
	}
}
