package 윈도우;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보버튼 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.RED);

		JButton btnNewButton = new JButton("주먹");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리 내용
				JOptionPane.showMessageDialog(null, "주먹을 누르셨군요");
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton("가위");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리 내용
				JOptionPane.showMessageDialog(null, "가위를 누르셨군요");
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);

		JButton btnNewButton_2 = new JButton("보");
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리 내용
				JOptionPane.showMessageDialog(null, "보를 누르셨군요");
			}
		});
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		f.setSize(300, 300);

		f.setVisible(true);
	}

}
