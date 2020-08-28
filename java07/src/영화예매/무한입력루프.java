package 영화예매;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// 이미 예약된 자리는 예약불가  다른자리 선택하라고 알려주세요 
		// 종료시 몇자석이 예매가되었는지 프린트 한장당 10000원 결제금액 프린트
		// 좌석번호가 1번부터 시작되게 해주세요
		
           Scanner sc = new Scanner (System.in);
            int[] seat = new int[10]; //예매상황을 좌석 마다  저장할 공간들
            int count =0;
        	final int PRLCE=10000;
           while(true) {
        	 System.out.println("-----------------");
        	 for (int i = 0; i < seat.length; i++) {
				System.out.print(i+" ");
			}
        	 System.out.println("\n----------------");
        	 for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
				
				
			}
        	 System.out.println("\n좌석선택 (종료-1)>>");
        	 int choice = sc.nextInt();
              if (choice == -1) {
            	  System.out.println("예약 시스템 종료합니다");
            	  System.out.println("예약 좌석 개수는 " + count);
            	  System.out.println("예약 금액은" + count*PRLCE + "원");
                   				break;
              } 
			  if (seat[choice]!=1) {
				seat[choice]=1;
				count++;
				System.out.println(choice+"번 예약완료");
				
			}else{
			      System.out.println("이미 예약된 자리입니다");
			       System.out.println("다른좌석번호를입력해주세요");
			       
			}
			   
			  
			  
			}
			
           }
	}


