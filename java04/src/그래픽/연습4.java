package 그래픽;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 연습4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame z = new JFrame();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i1 = t1.getText();
				String i2 = t2.getText();
				int o1 = Integer.parseInt(i2);
				
				if(o1 < 2001) {
					
					l3.setText(" 이름은 "+ i1 +" 당신은성입입니다 "+ i2 +" 출생년도입니다 ");
					
					
				}else {
					
					l3.setText(" 이름은 "+ i1 +" 당신은미성년자입니다 "+i2+" 출생년도입니다 ");
					
				}
				
			}
		});
        b1.setText("버튼");
		l1.setText("이름");
		l2.setText("출생년도");
		z.getContentPane().add(l1);
		z.getContentPane().add(t1);
		z.getContentPane().add(l2);
		z.getContentPane().add(t2);
		z.getContentPane().add(b1);
		z.getContentPane().add(l3);
		
	
		
		
		
		
		
		
		z.setSize(1000, 500);
		FlowLayout flow = new FlowLayout();
		z.getContentPane().setLayout(flow);
		z.setVisible(true);

	}

}
