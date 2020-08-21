package 그래픽;

import java.awt.FlowLayout;
import java.util.jar.Attributes.Name;

import javax.imageio.plugins.jpeg.JPEGQTable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 연습1 {

	public static void main(String[] args) {
		JFrame k = new JFrame();
		JButton b1 = new JButton();
		b1.setFont(new Font("굴림", Font.BOLD, 99));
		b1.setForeground(Color.BLUE);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(k, "꽃놀이가요");
			}
		});
		b1.setBackground(Color.ORANGE);
		
		b1.setText("봄");
		k.getContentPane().add(b1);
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(k, "물놀이가요");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 99));
		b2.setForeground(Color.GREEN);
		b2.setBackground(Color.PINK);
		b2.setText("여름");
		k.getContentPane().add(b2);
		
		k.setSize(261, 353);
		FlowLayout flow = new FlowLayout();
		k.getContentPane().setLayout(flow);
		k.setVisible(true);

	}

}
