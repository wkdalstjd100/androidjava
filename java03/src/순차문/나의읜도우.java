package 순차문;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 나의읜도우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   //틀역할을하는 부품이 필요합니다
	   JFrame f = new JFrame();
	   //틀역할하는 부품필요
	   f.setSize(500,500);
	   
	   JButton btnNewButton = new JButton("나를눌러요");
	   btnNewButton.setBackground(Color.PINK);
	   btnNewButton.addActionListener(new ActionListener() {
	   	public void actionPerformed(ActionEvent e) {
	   		JOptionPane.showMessageDialog(f, "나를눌럿네!!");
	   		
	   	}
	   });
	   btnNewButton.setFont(new Font("한컴 고딕", Font.BOLD, 22));
	   f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	   f.setVisible(true);
	   
	}

}
