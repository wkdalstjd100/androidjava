package 연습문제;

public class 연습3 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("★");

			}
			System.out.println("");
		}
			for (int z = 0; z < 4; z++) {
				for (int k = 0; k < 4 - z  ; k++) {
					System.out.print("★");

				
			}
				System.out.println("");
		}
	}
}
