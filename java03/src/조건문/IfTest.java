package 조건문;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.JOptionPane;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ok = 0, no =0, etc=0;
		//누적시키는 변수는 반복문안에 넣으면 안된다
		//반복할때마다 누적되지 않고 , 초기화되기 떄문에
		for (int i=0; i<5; i++) {
		 String data = JOptionPane.showInputDialog("ok)긍정 no)부정  etc)다시입력");
           if(data.equals("ok")) {
        	   System.out.println("긍정");
        	   ok++; //증감연산자
        	  //ok = ok + 1;
           }else if(data.equals("no")){
             System.out.println("부정");
              no++;
	}else {
		     System.out.println("다시입력해주세요");
		     etc++;
		     
	}
           
	}
		System.out.println("긍정횟수:"+ok+"회");
		System.out.println("부정횟수:"+no+"회");
		System.out.println("다시입력 횟수:"+etc+"회");
}
	
}