package 조건문;

import javax.swing.JOptionPane;

public class 연습 {

	public static void main(String[] args) {
		// 무한루프!! 로 수정해 보세요 .! 
		// 입력을 긍정 부정 기타 종료 중 선택 
		
		while (true) {
		 
	String	id=	JOptionPane.showInputDialog("긍정,부정,기타,종료 중에선택");
			if(id.equals("긍정") ) {
				System.out.println("긍정입니다");
			}else if(id.equals("부정")  ) {
				System.out.println("부정입니다");
			
			}else if(id.equals("기타")) {
					System.out.println("기타입니다");
			}else if(id.equals("종료")) {
						System.out.println("종료 입니다");
						break;// 무한반복을 멈춘다
			}else  {
							System.out.println("잘못입력햇습니다");
						
			}					
			}			
		
}
}