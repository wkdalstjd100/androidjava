package 배열복습;

import javax.swing.JOptionPane;

public class 연습2 {

	public static void main(String[] args) {
       String[] names = {"블랙핑크", "유재석", "아이유", "이효리", "비"};
    	int[] 투표수 =new  int[5];
    	for (int i = 0; i < 10; i++) {
    		
    		String cholce = JOptionPane.showInputDialog("블랙핑크 0번"+"유재석 1번"+"아이유 2번 "+" 이효리 3번" +" 비 4번");
    		int cholce2 = Integer.parseInt(cholce);
    		//0
    		if (!(cholce2 > 0 || cholce2 > 4)) {
    			투표수[cholce2]++;	
			}
    		for (int j = 0; j < 투표수.length; j++) {
				System.out.println(i+1 +"번" + 투표수[i] +"표");
				
			}
				int max = 투표수 [0];
				for (int k = 0; k < 투표수.length; k++) {
					if (투표수[i] > max) {
						max = 투표수[i];
						
					}
				}
			for (int k2 = 0; k2 < 투표수.length; k2++) {
	          if (투표수[i] == max) {
	        	  System.out.println(i+":"+names[i]);
				
			}			
			}
    		 
			
		}
    	
       }
	}


