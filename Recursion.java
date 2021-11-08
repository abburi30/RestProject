
public class Recursion {
	
	public static void main(String[] args) {
		rec(10);
	}
	
	private static void rec(int i) {
		// TODO Auto-generated method stub
		
		if(i>5) {
			System.out.println("r1");
			i--;
			rec(i);
			System.out.println("recursion");
			rec1(i);
			
		}
		
		
	}

	private static void rec1(int i) {
		// TODO Auto-generated method stub
		System.out.println("Recur 1" + i);
		
	}
}
