package 배열;

import javax.swing.JOptionPane;

public class 입력해서넣어보자2 {

	public static void main(String[] args) {
		//입력을 받아서 , 저장공간에 넣어두었다가 
		//나중에 꺼내서 연산이나 출력을 하고자 하는 경우
		String[] data = new String[3]; // 참조형은 초기화를 null 시켜줘라
		for (int i = 0; i < 3; i++) {
			//선언의 위치가 변수를 사용할수 있는 범위(지역)을 결정!
			data[i] = JOptionPane.showInputDialog("취미입력");
		}
           for (String x : data) {
        	   System.out.println(x);
			
		}
	}

}
