package 배열;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] str = {"장민성","장장장","민민민","성성성"};
           for (String x : str ) {
        	   System.out.println(x);
		}
        int [] in = {10,12,13,15};
        for (int i : in) {
        	System.out.println(i);
		}
        char[] ch = {'남','여','남','여'};
        for (int i = 0; i < ch.length; i++) {
        	System.out.println(ch[i]);
		}
        boolean[] bo = {true,false,true,false};
        for (int i = 0; i < bo.length; i++) {
        	System.out.println(bo[i]);
		}
        double[] d = {100,200,300,400};
        for (int i = 0; i < d.length; i++) {
        	System.out.println(d[i]);
		}
        for (int i = 0; i < str.length; i++) {
		System.out.println(str[i]+in[i]+bo[i]+d[i]+ch[i]);	
		}
    
		
		
		
		
		
	}

}
