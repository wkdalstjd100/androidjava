package 배열;

public class 배열개념 {
             
	public static void main(String[] args) {
		// 많은양의 데이터를 한꺼번에 다룰 떄 관리
 int[] jumsu =new int[1000]; // int + int + imt + ........ + int + .......
  System.out.println(jumsu);
// char[]gender =new  char [500];// char+ char + char + .......+char+......
 //int 변수 1000개 가 모두 이름이 jumsu 
 //jumsu 를 인덱스 (위치값 ) 로 구분
 // 첫번째 jumsu 는 index는 0! => jumsu[0]
 // 두 번째 jumsu 는 index는 1! => jumsu[1]
 // 마지막 jumsu 는 index는 전체개수 -1! => jumsu[전체개수 - 1]
 // 기본형 변수는 기본형 데이터 만 저장되는 변수 
 //             => 기본형 변수는 변수안에 해당 타입의 값! 이 저장 
  jumsu [0] = 100;
  jumsu [10] = 200;
  jumsu [999]= 1000;
  //jumsu [1000] 은 존재하지않음
  System.out.println("첫번째 값: " + jumsu [0]);
  System.out.println("11번쨰 값: " + jumsu [10]);
  System.out.println("마지막 값 : " + jumsu [999]);
  System.out.println("500번째 값 : " + jumsu [499]);
  for (int i = 0; i < jumsu.length; i++) {
	  System.out.println(i+"="+jumsu[i]);
	
}
    //배열은 자동 초기화가 됨 ! 
  String[] names = new String[1000];
  System.out.println(names[0]);
  System.out.println(names.length);
  System.out.println(names[names.length - 1]);
  //for 문과  배열은 짝궁 
	}

}
