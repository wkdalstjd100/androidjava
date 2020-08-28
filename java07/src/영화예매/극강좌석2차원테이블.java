package 영화예매;

import java.util.Scanner;

public class 극강좌석2차원테이블 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] i = new int[10];// 위에 좌석번호 찍음
		int count = 0; // 예매한 좌석수 카운터
		final int PRICE = 10000; // 금액
		int[][] seat = new int[3][10];// 2차원 배열 3행 10줄
		
		while (true) { // 종료 할때까지 반복으로 돌려주는
			System.out.println("------------------------------");
			System.out.print("   "); //앞에 공백 넣어줄때
			for (int j = 0; j < i.length; j++) {// 좌석번호
				System.out.print(+j + "  ");
			}
			System.out.println();// 공백
			System.out.print("------------------------------");
			System.out.println();// 공백

			for (int k = 0; k < 3; k++) {// 예매자리 배열 3행 10줄
				System.out.print(k+1 + "  ");
				for (int k2 = 0; k2 < 10; k2++) {
					
					System.out.print(seat[k][k2] + "  ");// seat 변수 안에 값을 꺼내어준다
				}
				System.out.println();// 공백

			}
			System.out.print("좌석선택(행번호,종료-1) ");// 행 번호를 한번받고
			int j = sc.nextInt();// 입력받아주는것 next 스트링으로 입력받아서 int 숫자로 변경
			if (j == -1) {// -1를 누를경우 종료되고 예약된 자석 예약한금액 을알려준다
				System.out.println("예약 종료 합니다");
				System.out.println("예약 좌석 개수는 " + count);
				System.out.println("예약 금액은 " + (count * PRICE));

				break;// 종료한다
			}
			System.out.print("좌석선택(열번호) ");// 열 번호도 받는다
			int k = sc.nextInt();// 입력받아주는것 next 스트링으로 입력받아서 int 숫자로 변경

			if (seat[j][k] != 1) {
				//1이면 예매가 된 상황이므로,
				//해당 index의 값이 1이 아닐때만, 예약해야함.
				seat[j][k] = 1;
				// 0인값을 1로변화 시켜주고 예약완료를 뽑아낸다
				count++;
				System.out.println("예약완료");

			} else {
				System.out.println("이미 예약된 자리입니다");
				System.out.println("다른좌석번호를입력해주세요");

			}
		}

	}
}