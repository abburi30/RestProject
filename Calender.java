import java.text.DateFormat.Field;

enum CalenderField{
	SECOND(00),
	MINUTE(00),HOUR_OF_DAY(10),DAY_OF_MONTH(01),MONTH(01),YEAR(2019);
	
	private int number;
	CalenderField(int num) {
		this.number=num;
	}
	public int getNumber(){
		return number;
	}
}

public class Calender {
	public static void add(CalenderField filed,int amount) {
		//super(amount);		
	}
	public int get(CalenderField filed) {
		return filed.getNumber();
	}
	public boolean after(Calender cal) {
		// create a constructor
		
		return true;
	}

	
	  
	 
}
