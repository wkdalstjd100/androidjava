package 연습문제;

public class 연습2 {

	public static void main(String[] args) {
		for(int i=2; i<10; i++)  { 
			if (i% 2 == 1) {
				continue;
			}
		 for(int j=1; j<10; j++) {
			 System.out.println(i+"*"+j+"=" +i*j);
			 

		}
		 System.out.println("");
		}
	}
}
