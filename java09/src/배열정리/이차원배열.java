package 배열정리;

public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] seat = new int[3][5];
        //배열을 선언하는 순간 공간이 할당! 
        //seat : 참조형변수 (주소)
        //int[3][5]: 기본형 변수 (값)
        //배열은 자동 초기화 int ->0
        System.out.println(seat);
        //     0     1     2     3     4 
        //0    0     0     0     0     0
        //1    0     0     0     0     0
        //2    0     0     0     0     0
        seat[0][1] = 1 ;
        seat[1][3] = 1 ;
        seat[2][2] = 1 ;
        //System.out.println(seat.length);
        
        for (int i = 0; i < 5; i++) {
        	
        	System.out.print(i +"  ");
		}
            System.out.println();
             for (int i = 0; i < seat.length; i++) {//0 1 2
            	 System.out.print(i+1 + "  ");
                      for (int j = 0; j < seat[i].length; j++) {
				    	  System.out.print(seat[i][j] + "  ");
					}		
                      System.out.println();
			}
        
	}

}
