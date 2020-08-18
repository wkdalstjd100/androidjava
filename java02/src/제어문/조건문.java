package 제어문;

public class 조건문 {

	public static void main(String[] args) {
		// 조건이 여러개 일 때 , if~else    if~.......~else
		                            // if, if ,if ,if ......
		int jumsu =55;
		if (jumsu >= 90) {
			System.out.println("a");
		} else if (jumsu >= 80) {
			System.out.println("b");
		} else if (jumsu >= 70) {
			System.out.println("c");
		} else if (jumsu >= 60){
			System.out.println("d");
		}else {
			System.out.println("f");
		}

	}

}
