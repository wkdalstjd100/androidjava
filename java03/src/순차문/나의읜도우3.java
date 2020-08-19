package 순차문;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 나의읜도우3 {
	private static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		   f.setSize(500,500);
		   
		   textField = new JTextField();
		   f.getContentPane().add(textField, BorderLayout.NORTH);
		   textField.setColumns(10);
		   
		   JButton button = new JButton("버튼");
		   button.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   	}
		   });
		   button.setBackground(Color.MAGENTA);
		   f.getContentPane().add(button, BorderLayout.CENTER);
		   
		   JButton btnNewButton = new JButton("번튼");
		   btnNewButton.setBackground(Color.ORANGE);
		   btnNewButton.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   	}
		   });
		   f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		   
		   JButton btnNewButton_1 = new JButton("버튼");
		   btnNewButton_1.setBackground(Color.CYAN);
		   f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		   
		   JButton btnNewButton_2 = new JButton("버튼");
		   btnNewButton_2.setBackground(Color.GRAY);
		   btnNewButton_2.addActionListener(new ActionListener() {
		   	public void actionPerformed(ActionEvent e) {
		   	}
		   });
		   f.getContentPane().add(btnNewButton_2, BorderLayout.SOUTH);
		   f.setVisible(true);
	}

}
