package 배열정리;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화페이지 {

	static int now = 2; // 현재 위치를 체크할수있는변수
	public static void main(String[] args) {
		// 영화 제목 , 이미지 목록 . 감독목록 . 평점목록
		String[] title = { "다만 악에서", "오케이 마담", "테넷", "주요소습격사건", "장민성탈출기" };
		String[] images = { "다만악에서구하소서.jpg", "오케이마담.jpg", "im.jpg", "주유소습격사건.jpg", "장민성탈출기.jpg" };
		String[] directars = { "오징어", "너구리", "장민성", "원숭이", "고릴라" };
		double[] rates = { 1.0, 1.1, 9.9, 8, 2 };

		JFrame k = new JFrame();
		k.getContentPane().setBackground(Color.PINK);

		k.setSize(1000, 1000);
		k.getContentPane().setLayout(null);
		
		JLabel tite = new JLabel(title[2]+" ");
		tite.setBackground(Color.CYAN);
		tite.setFont(new Font("굴림", Font.BOLD, 70));
		tite.setToolTipText("");
		tite.setBounds(98, 0, 791, 126);
		k.getContentPane().add(tite);

		JLabel img = new JLabel(images[2]);
		img.setIcon(new ImageIcon("C:\\Users\\tjoeun\\Desktop\\im.jpg"));
		img.setBounds(124, 220, 397, 455);
		k.getContentPane().add(img);

		JLabel lblNewLabel_2 = new JLabel("감독");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_2.setBounds(538, 220, 276, 97);
		k.getContentPane().add(lblNewLabel_2);

		JLabel director = new JLabel(directars[2] + " ");
		director.setForeground(Color.RED);
		director.setFont(new Font("굴림", Font.BOLD, 30));
		director.setBounds(533, 327, 276, 97);
		k.getContentPane().add(director);

		JLabel lblNewLabel_4 = new JLabel("평점");
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_4.setBounds(538, 446, 276, 97);
		k.getContentPane().add(lblNewLabel_4);

		JLabel rate = new JLabel(rates[2]+" ");
		rate.setForeground(Color.RED);
		rate.setFont(new Font("굴림", Font.BOLD, 30));
		rate.setBounds(538, 584, 276, 97);
		k.getContentPane().add(rate);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now==0) {
					now=5;
				}
				now--; //1
				tite.setText(title[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directars[now]);
				rate.setText(rates[now]+"");		
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(0, 0, 97, 961);
		k.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (now==4) {
					now=-1;
				}
				now++; //1
				tite.setText(title[now]);
				ImageIcon icon = new ImageIcon(images[now]);
				img.setIcon(icon);
				director.setText(directars[now]);
				rate.setText(rates[now]+"");
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(887, 0, 97, 961);
		k.getContentPane().add(btnNewButton_1);

		
		k.setVisible(true);

	}
}
