package 배열;

public class 배열기본2 {

	public static void main(String[] args) {
	int[] on =  new int [7];
	//배열은 일반적으로 같은 타입을 묶을때 사용 .!
	// 다양한 타입을 묶을 때는 배열을 쓰지않음.! 
	// 배열은 고정되니 크기를 가진다 . (크기 조절 불가능)
	
	
	on[0] = 32;
	on[1] = 34;
	on[2] = 29;
	on[3] = 38;
	on[4] = 42;
	on[5] = 18;
	on[6] = 25;
	
	for (int i = 0; i < on.length; i++) {
		System.out.println(i+1 + "일차 "+" 온도는 = "+on[i]);
	}
           
      
	}

}
