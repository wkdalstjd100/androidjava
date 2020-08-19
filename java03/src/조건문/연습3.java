package 조건문;

import javax.swing.JOptionPane;



public class 연습3 {

	public static void main(String[] args) {
		// 투표 시스텝 (무한투표)
		// 인기투표 선택해주세요 (1아이유 2 유재석 3 방탄 4종료)
		// 1)종료가 되는지 확인
		// 2)투표 진행
		// 3)종료가 되면 , 각 몇 표를 얻었는지 출력
		 int mex1=0, mex2=0 , mex3=0, mex4=0;  //변수
		while (true) { // 반복문 무한반복 true
			String x = JOptionPane.showInputDialog("인기투표 (1)아이유 (2)유재석 (3)방탄 (4)종료");
             //입력값 ()
			if (x.equals("4")) {
				System.out.println("종료햇습니다"); //4번을 입력할경우 종료햇습니다 알림
				break; // 반복문 을 종류
			} else if (x.equals("1")) {
				System.out.println("아이유");
				mex1++;// 변수를  지정해 값을 0으로만든후 입력 할때마다 횟수가 저장됨
			} else if (x.equals("2")) {
				System.out.println("유재석");
				mex2++;
			} else if (x.equals("3")) {
				System.out.println("방탄");
				mex3++;
			} else {
				System.out.println("다시 입력해주세요");
                mex4++;
			}
		}
		System.out.println("아이유 의 투표수는 : " + mex1); // 저장된 횟수값을 출력
		System.out.println("유재석 의 투표수는 : " + mex2);
		System.out.println("방탄 의 투표수는 : " + mex3);
		System.out.println("잘못된 투표수는 : " + mex4);
	}
}
