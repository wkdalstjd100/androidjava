package 영화예매;

import java.util.Scanner;

public class 이차원배열 {

	public static void main(String[] args) {
		
		int[] n1 = {1,2,3};
		int[] n2 = {4,5,6,7};
		int[][] n3 = new int [2][];
		n3[0] =n1;//2차원 배열의 첫번째 1차원 배열 하나를 끼워넣어줌
		n3[1] =n2;
		for (int i = 0; i < n3.length; i++) {//행을돈다
			for (int j = 0; j < n3[i].length; j++) {
				System.out.print(n3[i][j]+" ");
			}
			System.out.println();
		}
		//{0,0,0,0}
		//{0,0,0,0}
		int[][] num = new int[2][4];
		num[1][3] = 900;
		num[0][1] = 800;
		System.out.println(num.length);
		System.out.println(num[0].length);
		System.out.println(num[1].length);
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
				
			}
			System.out.println();
		}
		
		}

	}


