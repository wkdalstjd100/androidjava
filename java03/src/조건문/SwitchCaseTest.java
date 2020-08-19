package 조건문;

import javax.swing.tree.DefaultMutableTreeNode;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String food = "알밥";
		switch (food) {
		case "+": 
			System.out.println("분식집으로가요");
			break;
		case "국수":
			System.out.println("국수집으로가요");
			break;
		case "짜장면":
			System.out.println("중국집으로가요");
			break;
		case "냉면":
			System.out.println("일식집으로가요");
			break;
	          default : 
	        	  System.out.println("그냥안먹어");
	        	  break;			

		}
	}

}
