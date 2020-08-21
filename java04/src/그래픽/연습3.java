package 그래픽;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 연습3 {

	public static void main(String[] args) {
		JFrame z = new JFrame();

		JLabel l1 = new JLabel();
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		JLabel l2 = new JLabel();
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		l3.setBackground(Color.BLACK);
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);

		JButton b = new JButton();
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i1 = t1.getText();
				String i2 = t2.getText();
				int o1 = Integer.parseInt(i1);
				int o2 = Integer.parseInt(i2);

				if (o1 < o2) {
					String o3 = String.valueOf(o2);
					l3.setText(o3);

				} else if( o1 > o2) {

					String o4 = String.valueOf(o1);
					l3.setText(o4);
				}else {
					l3.setText("똑같다");
				}

			}
		});

		l1.setText("숫자1");
		l2.setText("숫자2");
		b.setText("버튼");
		z.getContentPane().add(l1);
		z.getContentPane().add(t1);
		z.getContentPane().add(l2);
		z.getContentPane().add(t2);
		z.getContentPane().add(b);
		z.getContentPane().add(l3);

		z.setSize(700, 500);
		FlowLayout flow = new FlowLayout();
		z.getContentPane().setLayout(flow);

		z.setVisible(true);

	}

}
