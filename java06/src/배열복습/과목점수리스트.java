package 배열복습;

public class 과목점수리스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1학기 과목  점수 리스트 100 99 77 87 66 
		//2학기 과목 점수는 1 학기 점수에서 
		//과학만 88 영어만 55 점으로 변경 
		
		//1학기 2학기 점수를 프린트
		// 점수가변경된 과목수는 ? 
		// 1학기 2학기중 평균이 더높은학기는 ? 
		// 점수가 변경된 과목명은?
		String [] id = {"국어", "수학", "과확" ,"컴퓨터" ,"영어" };
		int[] 점수 = {100 ,99 ,77 ,87 ,66};
		int[] 점수2 = 점수.clone();
		System.out.println("              국어\t수학\t과학\t컴퓨터\t영어");
		System.out.print("1학기 "+ "\t");
		
		for (int x : 점수 ) {
			System.out.print(x +"\t");
		}
		System.out.println();
		System.out.print("2학기"+ "\t");
		점수2[2] = 44;
		점수2[4] = 55;
        for (int x : 점수2 ) {
			System.out.print(x + "\t");
		}
        System.out.println(" ");
        
        
        int count =0 ; 
        for (int i = 0; i < 점수2.length; i++) {

        	 if (  점수[i] != 점수2[i]) {
        		 System.out.println("변경 과목 :" + id[i] );
        		 count++;
				
			}
		}
        System.out.println("변경 과목 :" + count + "개");
	
        double m1 = 0;	
        double m2 = 0;
        
       for (int i = 0; i < 점수2.length; i++) {
		m1= m1 + 점수[i]; 
		m2= m2 + 점수2[i]; 
		} 
       double div1 = m1/5;
       double div2 = m2/5;
       
       
       if (div1 > div2) {
    	   System.out.println("1학기 평균이 더좋습니다");
		
	}else {
		System.out.println("2학기 평균이 더좋습니다");
	}
        
        
}    
}       
