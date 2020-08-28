package 배열응용;

public class 강아지2 {

	public static void main(String[] args) {
		
		강아지 dog =new 강아지();
		dog.꼬리 ="긴꼬리";
		dog.이빨 = "앞이빨";
		dog.털 = "앞털";
		System.out.println(dog.꼬리);
		System.out.println(dog.이빨);
		System.out.println(dog.털);
		dog.물기();
		
		강아지 dog2 = new 강아지(); 
		System.out.println(dog.꼬리);
		System.out.println(dog.이빨);
		System.out.println(dog.털);
		dog.깨물어뜨리기();
	}

}
