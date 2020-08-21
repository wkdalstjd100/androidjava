package 그래픽;

import java.awt.FlowLayout;
import java.awt.Image;
import java.nio.channels.NetworkChannel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		// 자바는 부품조립식 코드==>객체 지향형 프로그래밍(OOP)
		// ctrl + shift + o : 자동 import
		JFrame j = new JFrame(); // new 는 복사의 의미다
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		         JOptionPane.showMessageDialog(j,"나를 눌러요를 눌럿군요");
		         
			}
		});
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(j, "나를 눌럿군요 2");
			}
		});
		JButton b3 = new JButton();
		//String ing = "Sky.png"; 
		ImageIcon img = new ImageIcon("sky.PNG");
		b1.setText("나를 눌러요");
		b2.setText("나를 눌러요");
		b3.setIcon(img);
		j.getContentPane().add(b1);
		j.getContentPane().add(b2);
		j.getContentPane().add(b3);
		
		j.setSize(1000,500);
		FlowLayout flow = new FlowLayout();
		j.getContentPane().setLayout(flow);
		//맨아래 두어야한다  전부다 보여주라는뜻 setvisible
		j.setVisible(true);
		
	
		
	}
}
