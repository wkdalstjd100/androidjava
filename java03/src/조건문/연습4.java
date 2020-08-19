package 조건문;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 연습4 {

	public static void main(String[] args) {
		int max1 = 0, max2 = 0; 

		while (true) {
			String id = JOptionPane.showInputDialog("1(입금)2(출금)3(잔고)4(종료)");
			if (id.equals("1")) {
				String ld = JOptionPane.showInputDialog("금액을 입력하세요");
				max1 = Integer.parseInt(ld);
				System.out.println("입금되엇습니다" + max1);
				
			} 
				
			 else if (id.equals("2")) {
				String oj = JOptionPane.showInputDialog("출금 금액을 입력하세요");
				max2 = Integer.parseInt(oj);
				System.out.println("출금되엇습니다" + max2);
				
			} else if (id.equals("3")) {
				System.out.println("잔고는" + (max1 - max2) + "입니다");

			}else if (id.equals("4")) {
				
					System.out.println("종료합니다");
			 break;
		}
		}
	}
}