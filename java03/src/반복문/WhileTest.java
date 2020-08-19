package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {
		  
		while(true) {
			System.out.println("내가 계속 돌아요");
	String choice=JOptionPane.showInputDialog("계속하실래요? y 아니면 n" );
			if (choice.equals("n")|| choice.equals("no")) {
				 System.out.println("프로그램 종료");
				 System.exit(0);
				// break;//while 반복문을 끝낸다 , while 아래에 있는 것들은 계속 실행 
				 
			}
		}
		//System.out.println("내가실행 될까?");
		/*int i = 0 ; //시작값
		while (i < 10 ) {//조건식 
			System.out.println("내가 열번 돌아요 ");//실행 내용
			i++; //증가식
		}*/

	}

}
