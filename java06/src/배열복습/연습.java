package 배열복습;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class 연습 {

	
	public static void main(String[] args) {
		
		
		
		
		
		//6번문제
		int[] num6 = {66 , 77, 88, 99};
		int imsi = num6[0]; //imsi <-66
		num6[0] = num6[3];  // num6[0] <--99
		num6[3] = imsi;  // num6[3] <-- imsi
		for (int x : num6) {
			System.out.println(x+"");
			
		}
		System.out.println();
		
		
		
		
		
		
		
		
		//4번문제 5개의 정수 배열을 만들어서 1~5까지 입렵하여 프린트
		
		int[] n = new int[5];
		for (int i = 0; i < n.length; i++) {
                 String str =JOptionPane.showInputDialog("숫자입력");
                 int n2 = Integer.parseInt(str);
                 System.out.println((i+1)+"번째는"+n2);
                 
		}
		
		//5번문제 66,77,88,99 중 최대값을 찾아보세요
		int[] u = {66, 77 , 88 ,99};
		int max = u[0];
		for (int i = 0; i < u.length; i++) {
			if (u[i] > max) {
				max = u[i];
				
			}
			
		}
		System.out.println("최대값" + max );
		
		
		
		
		//첫번째 문제 1020304050을 배열에 넣어 첫번째값과두번째값을 더해서  print 
		int[] num = { 10, 20, 30, 40, 50 };
		int sum = num[0] + num[1];
		System.out.println(sum);

		String[] data = new String[3];
		
		// 두번째 문제    {"java","spring","jsp"} 입력받아 배열에 넣어보세요 출력은 **java보다는 sprlwg**
		for (int i = 0; i < 3; i++) {
			data[i] = JOptionPane.showInputDialog("과목입력");
		}
		System.out.println("**"+data[0]+"보다는"+data[1]+"**");
		
		//세번째 문제 11 22 33 44 를 배열에 넣어서 이중 33은 몇 변째 위치에 있는지 프린트
		int[] nm = { 11, 22, 33, 44};//위치찾기
		int target =33;
		 for (int i = 0; i < nm.length; i++) {      // i는위치값  0 1 2 3    nm 주소값       nm[i]  11 22 33 44
			
			 if (nm[i]== target) {
				System.out.println("33의위치는" +i+"번째");
			}
		}
		
		
	}

}
