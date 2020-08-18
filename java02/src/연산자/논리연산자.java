package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String  기업id ="1111";
        String  기업pw = "2222";
        
        String 로그인id = JOptionPane.showInputDialog("아이디입력");
        String 로그인pw = JOptionPane.showInputDialog("비밀번호입력");

       
        if (기업id.equals(로그인id) && 기업pw.equals(로그인pw)) {
        	//and연산자 ,여러 조건이 모두 true 일때 ,
        	// 전체 논리적인 판단을 true 라고 판단하는 경
        	System.out.println("로그인 ok");
        }else {
         System.out.println("로그인 not");
        }
	}
}
