package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

//특정한  방법을 처리하는 클래스 : 방법 (model, db처리)클래스 

public class DB처리전담2 {
	
	//DB처리하는 방법이 4단계로 정해져 있다 
	
	public void create(String name, String classroom, String classday)  throws Exception {
		System.out.println("DB에서 저장 처리함");
		
		//1. connector 설정 
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//자바에서 에러가 너무 많이 발새한 것같은 상황에서는 반드시 
		// 에러처리를 반드시 해주어야함 .
		// 네트워크 연결 , db연결 ,파일연결 , cpu연결 
		
		System.out.println(" 1 . connecttor 설정성공");
		
		//2.  db연결
		//    1) ur1 :ip + port +db명
		//    2) username :root
		//    3) password :1234
		
		String url = "jdbc:mysql://localhost:3366/food";
		String username = "root";
		String password = "1234";
		
		Connection con =DriverManager.getConnection(url,username,password);
		
		System.out.println("2. 연결성공");
		
		//db연동 하는 index 는 1부터 시작 ! 
		
		String sql = "insert into request values (?,?,?)";
		
		//컴퓨터는  이문장을 그냥 string 으로 인식 !
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, classroom);
		ps.setString(3, classday);
		
		System.out.println("3. sql문 생성");
		
		ps.executeUpdate();
		
		System.out.println("4. sql문 전송");
		
	}
  
	public void Read() {
		JOptionPane.showMessageDialog(null , "DB에 검색 처리함");
	}
	public void update() {
		JOptionPane.showMessageDialog(null , "DB에 수정 처리함");
	}
	public void delete() {
		JOptionPane.showMessageDialog(null , "DB에 삭제 처리함");
	}
	
}
