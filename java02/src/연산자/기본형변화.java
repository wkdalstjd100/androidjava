package 연산자;

public class 기본형변화 {

	public static void main(String[] args) {
		//큰 <- 작    : 자동 형 변화 
		int x = 100;  // int 는 - 21억 ~ 21억     4바이트 
		byte y = 120; //  byte 는 - 128 ~127  1바이트
		 x = y;
		 System.out.println("x:"+x);
		 //작<-큰 : 강제형 변화 ()를 사용 \
		 //(자르고싶은 데이터 형) 변수명 
		 int z = 127 ; 
		 byte w = (byte)z;
		 
       System.out.println("기본형변화.main()"); 
       
       
            int q = 1000;
            //byte t = g;   // 들어갈수 없다
            // 강제형 변화 하는 경우는 
            // 강제로  변환 하고자 하는 타입 범위에 
            // 값이 들어가야 한다



                      // byte x = 100;   //자동형변화
                      // int y = x ;
                                            
                       
                     //  int x = 300;   // 강제형  형 변화 안됨
                     //  byte y = x;
                       
                       
                       
                     //  double x = 400;  //8바이트 
                     //   int y = (int)x ;     //강제형 변화
                        
                        
                                 //  int x = 400;                          
                        // 자동형변화    double y = x;

	}

}
