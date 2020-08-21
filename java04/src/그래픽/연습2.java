package 그래픽;

import java.awt.FlowLayout;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class 연습2 {

	public static void main(String[] args) {
		// 프레임1
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		// 이미지1
		ImageIcon img = new ImageIcon("sk.png");
		// 라벨 3
		JLabel d3 = new JLabel();
		JLabel d1 = new JLabel();
		JLabel d2 = new JLabel();
		d2.setFont(new Font("굴림", Font.PLAIN, 80));
		d2.setHorizontalAlignment(SwingConstants.TRAILING);
		// 텍스트 입력 2
		JTextField b1 = new JTextField();
		b1.setFont(new Font("굴림", Font.PLAIN, 57));
		b1.setBackground(Color.ORANGE);
		JTextField b2 = new JTextField();
		b2.setFont(new Font("굴림", Font.PLAIN, 52));
		JTextField b3 = new JTextField();
		b2.setBackground(Color.ORANGE);
		JButton c2 = new JButton();
		c2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		
		});
		// 레이아웃1
		FlowLayout z1 = new FlowLayout();

		f.setSize(500, 700);
		// f사이즈
		f.getContentPane().setLayout(z1);
		d1.setIcon(img);
		d2.setText("숫자1");// 라벨에글자넣기
		f.getContentPane().add(d1);// 라벨 이미지
		f.getContentPane().add(d2);// 라벨 숫자 1
		f.getContentPane().add(b1);// 글자넣는 창 text
		d3.setFont(new Font("굴림", Font.PLAIN, 80));
		d3.setText("숫자2");
		f.getContentPane().add(d3);// 라벨 숫자 2
		f.getContentPane().add(b2);// 글자넣는 창 2 text
		
		f.add(b3);
		f.getContentPane().add(c2);// 버튼2
		// 버튼 1
		JButton c1 = new JButton();
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1,t2 입력한 값을 가지고 와야함 ,
				// 가지고온 값의 데이터 타입은 무조건 String!
				String s1 = b1.getText();
				String s2 = b2.getText();
				System.out.println("s1값: " + s1);
				System.out.println("s2값: " + s2);
				// 산술 연산을 하려면 , 숫자를 변환
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				// 숫자로 변한된 값을 더하자
				int sum = i1 + i2;
				// 처리한결과를 사용자에게 보여줌 ,(출력)
				// result.setText(sum + " ");
				Strimg sum2 = String.valueOf(sum);

			}
		});
		c1.setBackground(Color.WHITE);
		f.getContentPane().add(c1);// 버튼

		f.setVisible(true);

	}

}
