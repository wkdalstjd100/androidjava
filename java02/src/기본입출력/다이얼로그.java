package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //자바에서의 코딩 방식
		        //특정한 말을 처리하는 부품을 만들어 전담시킨다.
		        //자바에서는 자주 사용되는 부품은
		        //미리 메모리에 가져다놓고 있음.
		        //부품의 이름을 대문자로 시작해서 사용하면 된다.
		   String hour=  JOptionPane.showInputDialog("지금 몇시인가요?");
		     JOptionPane.showMessageDialog(null, hour + "시입니다.");  
		     //empty == null , 널
		     // 기능을 처리해주는 단위 : function(함수)
		     
		     //int <- String 
		     //부품을 써야함 . 
		        int hour2 = Integer.parseInt(hour);
		        
		         if (hour2 < 16) { // 조건에는 비교연산자를 쓰고 , 비교연산자의 결과는 논리 ! 
		        	 //true
					
				   JOptionPane.showMessageDialog(null,"아직 집에 갈 시간이 멀었군요");
				   }
					
				     else {//false

				}//{}묶어주는 의미 (포함) 
		         JOptionPane.showMessageDialog(null,"집에가세요");
		         
		         
		         
		       
		     
	}

}
