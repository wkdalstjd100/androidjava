package 배열의응용;

import java.lang.reflect.Array;

import java.util.Arrays;

public class 배열정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] 나이 = {99,10,100,88,33,24,10,77};
         //배열을 복사 할때는 clone ()이란 함수를 사용 !  
         // 깊은복사 , 배열은 깊은 복사를 해야된다 
         // 갚은 복사를 해야 배열근 따로따로 만들어진다 
         int[] 나이2 =나이.clone();
           for (int x : 나이) {
                   System.out.println(x +"\t");			
		}
         System.out.println();
         나이2[0] = 999;
         for (int x : 나이2) {
 			System.out.println(x +"\t");
 		} 
         System.out.println("-----------------------------");
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         Arrays.sort(나이);
         // 파괴 함수 , 비파괴 함수 
          for (int x : 나이) {
		             System.out.println(x+" ");	
		}
	}

}
