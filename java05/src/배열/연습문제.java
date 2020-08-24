package 배열;

import java.util.Random;

public class 연습문제 {

	public static void main(String[] args) {
		// 문제 1000문제   원래 답안지 0~3까지 중 1000개를 만드세요 내답안지 0~3까지 중 1000개를만드세요 //체점을해보세요
		Random y = new Random(); 
		int[] in = new int [1000]; 
		int[] iz = new int [1000]; 
 
        for (int i = 0; i < in.length; i++) {
        	in[i] = y.nextInt(4);
        	iz[i] = y.nextInt(4);
        	
        		
	}      
        System.out.println("문자\t"+" 정답\t 내답\t 처리");
        String result = "오답";
         for (int i = 0; i < iz.length; i++) {
        	 if (in == iz) {
				
			

		
        	 result = "정답";
        	 }
        	 System.out.println( i+ "/t" + in + "/t" + iz + "t");
		}
     }
}
	
