package DB연결;

import java.sql.Date;
import java.util.Random;

public class 반환값연습 {

	public int add(int x, int y) {
		return x + y;
	}

	public double add(double x, int y) {
		return x + y;
	}

	public int[] add(int x) {
		int[] num = { 1, 2, x };

		return num;

	}

	public String add(String x, int y) {
		return x + y;
	}

	public java.util.Date add() {
		java.util.Date date = new java.util.Date();
		return date;
	}

	public boolean add(boolean x) {
		Random r = new Random();

		return r.nextBoolean();
	}
}