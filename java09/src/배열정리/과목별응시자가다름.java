package 배열정리;

public class 과목별응시자가다름 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] g = new int[4][];
		int[] g1 = {50,60,70,80,90};
		int[] g2 = {66,77,88};
		int[] g3 = {90,80,70,60,};
		int[] g4 = {50,60,};

		g[0] = g1;
		g[1] = g2;
		g[2] = g3;
		g[3] = g4;
		 
		for (int i = 0; i < g.length; i++) {
			
			for (int j = 0; j < g[i].length; j++) {
				System.out.print(g[i][j] + " ");
			}
			System.out.println();
		}
	}

}
