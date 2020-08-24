package 배열;

import java.util.Random;

public class 아무값중50보다큰값찾아보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Random y = new Random(); //아무값 랜덤
                //0~ 99 까지의 1000개 중 50보다 큰값들을 프린트 
                 int[] in = new int [1000]; 
                for (int i = 0; i < in.length; i++) {
                	in[i] = y.nextInt(100);
					
				}
                int count=0;
                for (int i = 0; i < 100; i++) {
                	if (in[i] >= 50) {
						System.out.println(i+":"+in[i]);
						count++;
					}
					
				}
                System.out.println("50보다 큰개수는 : " + count
                		);
	}

}
