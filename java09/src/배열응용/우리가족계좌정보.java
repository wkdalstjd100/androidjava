package 배열응용;

public class 우리가족계좌정보 {
   
	public static void main(String[] args) {
		입력해서넣어보자 n1 = new 입력해서넣어보자();
		n1.name = "홍길돌";
		n1.bank = "튼튼적금";
		n1.money = "1000";
		
		입력해서넣어보자 n2 = new 입력해서넣어보자();
		n2.name = "박길동";
		n2.bank = "튼튼예금";
		n2.money = "2000";
		
		
		입력해서넣어보자 n3 = new 입력해서넣어보자();
		n3.name = "홍길돌";
		n3.bank = "다음적금";
		n3.money = "3000";
		
		
		System.out.println("우리 가족 계좌 정보 ");
		System.out.println("-------------------");
		System.out.println("가족   " + "이름\t\t" + "계좌이름\t" + "금액");
		System.out.println("---------------------------------------");
		System.out.println("아버지" + n1.name+"\t" +n1.bank+"\t" +n1.money );
		System.out.println("어머니" + n2.name+"\t" +n2.bank+"\t" +n2.money );
		System.out.println("딸     " + n3.name+" \t" +n3.bank+"\t" +n3.money );
	
		}
	
	
	
    
}
