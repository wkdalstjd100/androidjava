package 조건문;

import javax.swing.JOptionPane;

public class 사원번호입력하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "A100EX";
		char str2 = num.charAt(0);
		String id = num.substring(1, 4);

		switch (str2) {
		case 'A':
			System.out.println("사원번호입력하기.main()");
			break;
		case 'B':
			System.out.println("사원번호입력하기.main()");
			break;
		case 'C':
			System.out.println("사원번호입력하기.main()");
			break;

		default:
			System.out.println("사원번호입력하기.main()");
			break;
		}
		//String sub = no.substring(1, 4);
		// 인덱스 1~3범위 푸풀이면 substring(1,4) 써줌 .
		// endIndex 는 3 보다 1 큰 5를 써주어야함
		System.out.println("사원번호입력하기.main()");
	}

}
