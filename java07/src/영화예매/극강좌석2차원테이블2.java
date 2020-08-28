package 영화예매;

import java.util.Scanner;

public class 극강좌석2차원테이블2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스크린
		int count = 0; // 카운터
		final int PRICE = 5000;// 가격
		int[] i = new int[10];
		int[][] s = new int[3][10];
		while (true) {
			
			for (int j = 0; j < i.length; j++) {
				System.out.print(j + "   ");

			}
			System.out.println();
			System.out.println("-------------------------------------");

			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 10; j2++) {
					System.out.print(s[j][j2] + "   ");

				}
				System.out.println();

			}
			System.out.print("행번호 입력 (0~2)");
			int j = sc.nextInt();// 행번호입력 받는다
			if (j == -1) {
				System.out.println("예매를 종료합니다");
				System.out.println("총예매 가격은 :" + (count * PRICE));
				System.out.println("총예매 수는 :" + count);
				break;
			}
			System.out.print("열번호 입력 (0~9)");
			int x = sc.nextInt();
			if (s[j][x] != 1) {
				s[j][x] = 1;
				System.out.println("예매 성공");
                count++;
			} else {
				System.out.println("이미 예약된자리입니다 ");
				System.out.println("다시선택해주세요");
			}
		}
	}
}