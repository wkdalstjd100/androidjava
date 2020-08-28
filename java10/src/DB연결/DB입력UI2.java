package DB연결;

import javax.swing.JOptionPane;

public class DB입력UI2 {
      public static void main(String[] args) throws Exception {
    	  String name = JOptionPane.showInputDialog("이름");
    	  String classroom = JOptionPane.showInputDialog("수업 반");
    	  String classday = JOptionPane.showInputDialog("수업 날짜");
    	  DB처리전담2 db = new DB처리전담2 ();
    	  db.create(name, classroom, classday);
		
	}
	
}
