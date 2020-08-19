package 연습문제;

import javax.swing.JOptionPane;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("숫자1");
		String b = JOptionPane.showInputDialog("숫자2");
		String c = JOptionPane.showInputDialog("공식 ");
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);

		switch (c) {
		case "+":
			System.out.println(aa + bb);
			break;
		case "-":
			System.out.println(aa - bb);
			break;
		case "*":
			System.out.println(aa * bb);
			break;
		case "/":
			System.out.println(aa / bb);
			break;

		default:
			break;
		}
	}

}
