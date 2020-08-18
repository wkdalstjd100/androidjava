package 연산자;

import javafx.stage.StageStyle;

public class 반복문2 {

	public static void main(String[] args) {
		// 정해진 횟수만큼 반복해보자
             int start = 1; // 시작값
             int end = 5;  // 끝값
             int add = 1 ; // 증가값
             
             while (start <= end  ) {
            	 System.out.println(start);
            start= start + add ;
				
				
			}
            
             int strart = 100;//시작값
             int en = 1; //끝값
             int bn = 1; // 감소값
             
             while (strart >= en) { //stratr가 en 이랑똑같거나 클때까지
                System.out.println(strart); //출력 값 strart 
                strart = strart - bn; // strart 값을 bn감소
                //strart--; 1씩감소
                //strart++; 1씩증가
                }
		int s = 5;  //시작 값
		int c = 10 ; // 끝값
		int n = 1 ;   // 증가값
		     while (s <= c) {  // s가 c값이랑 같거나 작을때까지
				System.out.println(s); // 출력값 s
				s = s + n;              //s 값을 n증가         
				
			}
		int z = 1 ;  //시작값
		int x = 100;  // 끝값
		int l = 2 ;   //증가값
		      while (z <= x) { // z가 x값이라 같거나 작을때까지 
				System.out.println(z); // 출력값 z 
				z=z+l;                 // z값을 l증가
			}
             }
  
	}

