package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그2 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
         2개의 숫자를 입력받아서 사칙연산을 해보세요 
		 숫자 입력을 2개받아서 시작값 5 종료값 10000이면  5부터 1000까지 프린트 
		 숫자 1개를 입력을받고 문자 1개를 입력 받아서 입력한 숫자 개수만큼 문자를 프린트 숫자 :5 문자 :◎ 
		
		1.데이터입력
	String aoop =	JOptionPane.showInputDialog("숫자를입력하세요");
	String aoob =	JOptionPane.showInputDialog("2번째, 숫자를입력하세요");
		2.처리
	int p = Integer.parseInt(aoop);
	int c = Integer.parseInt(aoob);
	
		3. 결과
     System.out.println(aoop+aoob);*/
		
		String aooe =	JOptionPane.showInputDialog("시작값");
		String aool =	JOptionPane.showInputDialog("종료값");
		int al = Integer.parseInt(aooe);
		int ae = Integer.parseInt(aool);
		    
			//2.데이터 입력 
	     for (int i=al; i<=ae; i++) {
	      System.out.println(i);
                                    
	   /* String aood =	JOptionPane.showInputDialog("반복할 숫자");
		 String aooc =	JOptionPane.showInputDialog("반복할 문자");
		
		int nnl = Integer.parseInt(aood); //5
		
		for (int i=0; i<nnl; i++) {
			System.out.println(aooc);
		}*/
		
	}
	}
	}
