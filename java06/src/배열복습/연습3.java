package 배열복습;

import java.util.Random;

public class 연습3 {

	public static void main(String[] args) {
		 
		 String[] 식수 = {"아버지", "어머니", "형", "나", "동생"};
		 int[] 나이 = {100, 88, 33, 24, 10};
		 Double[] 키 = {177.5, 152.5, 190.3, 167.7, 155.3};
		 System.out.println("우리집 식구 정리");
		 System.out.println("-------------------");
		 System.out.println("이름\t나이\t키");
		 for (int i = 0; i < 5; i++) {
			 System.out.println(식수[i]+ "\t" + 나이[i]+"\t" +키[i]);
			
		}
		 

	}

}
