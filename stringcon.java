import java.util.ArrayList;
import java.util.List;

public class stringcon {

	public static void main(String[] args) {
		String s="and 987";
		ArrayList l =new ArrayList();
		StringBuilder str=new StringBuilder();
		String pattern="\^a";
		System.out.println(s.matches(pattern));
		for(int i=0;i<s.length();i++) {
			
			if(!s.matches(pattern)) {
				char c=s.charAt(i);
				if(Character.isDigit(c)) {
					l.add(c);
				}
			}
			
			
		}
		for(Object o: l ) {
			str.append(o);
		}
		//System.out.println(str);
		int i=Integer.parseInt(str.toString());	
		System.out.println(i);
	}

	
}
