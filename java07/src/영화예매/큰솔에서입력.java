package 영화예매;

import java.util.Scanner;

public class 큰솔에서입력 {

	public static void main(String[] args) {
		// 큰솔에서 입력 ;
		// 모든 입력의 데이터 타입은 String!! 
           Scanner scan = new Scanner(System.in);
            System.out.print("이름을 입력 >>");
         String x =  scan.next();
           System.out.println("이름:" +x);
           System.out.println();
           System.out.print("나이를 입력 >> ");
         int y=  scan.nextInt(); // int <- String 입력
          System.out.println("내년 나이는 " + (y +1)+"년");
          
          System.out.print("키를 입력 >> ");
          double z = scan.nextDouble();
          System.out.println("현재키 :"+z);
          System.out.print("내년키는>>"+(z+20));
         System.out.println(" ");
         
          System.out.println("밖에비가 오면 true입력");
          boolean rain = scan.nextBoolean();
          if (rain = true) {
        	  System.out.println("우산가져가");
          }else {//false
        	  System.out.println("그냥가");
          }
          System.out.println("당신의 목표는 >>");
          scan.nextLine();
          String life = scan.nextLine();//엔터치기까지의문장
           System.out.println("목표는"+life);          
	}
	

}
