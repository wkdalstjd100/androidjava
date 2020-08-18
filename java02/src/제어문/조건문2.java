package 제어문;

import java.security.DrbgParameters.Reseed;

import javax.swing.JOptionPane;


public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String ic = JOptionPane.showInputDialog("아이스크림 아이스커피  두개중에 입력해주세요");
     String result= "";
        if(ic.equals("아이스크림")) {
       	   result ="뚜레주르";
       	   
        }else if (ic.equals("아이스커피")) {
        	
        	result ="이디야로 가요";        	
        }else {
        	result="력이 틀렷습니다 다시시도해주세요";
        }
        //결과
        System.out.println(result);
	}

}
