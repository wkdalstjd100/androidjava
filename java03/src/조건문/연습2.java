package 조건문;

import javax.swing.JOptionPane;

public class 연습2 {

	public static void main(String[] args) {
		// int target =88// 정답 입력 을 받아서 , 정답이면 축하합니다 하고 종료 정답이 아니면 계속 입력을 받아서 확인
		// 입력받은 값이 정답보다 크면 너무 커요 작으면 너무 작아요 !
		// 틀린 횟수 몇 번만에 맞추엇는지 프린트
		int target = 88;  
		int 카운트 = 0 ,  카운트2 =0;
		while (true) {
			String id = JOptionPane.showInputDialog("정답 숫자를 입력하세요");// "77"
			int al = Integer.parseInt(id);
			//비교연산자는 기본형만 데이터만 사용 할수있다
                 카운트2++;
			if (al == target) {
				System.out.println("축하합니다정답");
				
				break;
				//System.exit(0);
				
			}else if(al < target){
				System.out.println("정답이 아닙니다!");
			      
				System.out.println("너무작아요");
				카운트++;
			}else {
				System.out.println("너무커요");
				카운트++;
			}
			}	
			
		System.out.println("틀린횟수"+(카운트));
		System.out.println("몇번만에 맞추엇는지"+(카운트2));
		
		
	}

}
	
