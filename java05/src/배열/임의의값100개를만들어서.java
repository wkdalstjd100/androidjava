package 배열;

import java.util.Random;

public class 임의의값100개를만들어서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Random r = new Random(); // 랜덤 임의 값 변수
          int[] in= new int[100];
          for (int i = 0; i < 100; i++) {
        	  in[i] = r.nextInt(100);// 랜덤 임의값
		}
          for (int x : in) {
			System.out.println(x);
		}
	}

}
