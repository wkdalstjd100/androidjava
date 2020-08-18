package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자 
		int x =200;
		int y =100;
		System.out.println("더한값은"+(x+y));  //() 먼저 계산하라는 기호
		System.out.println("뺸 값은"+(x-y));    
		System.out.println("곱한 값은"+(x*y)); //+보다 * 먼저
		System.out.println("나눈 값은"+(x/y)); // +보다 / 먼저
		System.out.println("나머지 값은"+(x%y)); // +보다 % 먼저

	}

}
