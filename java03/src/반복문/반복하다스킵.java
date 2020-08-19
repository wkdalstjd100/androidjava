package 반복문;

public class 반복하다스킵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0 ; i < 100 ; i ++) {
		     //3의 배수는 프린트를 안하고 싶어한다 
			if (i % 3 == 0) {
				continue; //skip 의 의미
			}
			System.out.println(i);
		}

	}

}
