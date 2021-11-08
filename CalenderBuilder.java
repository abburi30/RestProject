import java.sql.Time;
import java.util.Date;

public class CalenderBuilder {
	Date date;
	Time settimeofday;
	
	public CalenderBuilder() {
		
	}
	public static void setDate(int year,int month,int dayOfMonth){
		year=2019;
		month=01;
		dayOfMonth=11;
	}
	public static void setTimeOfDay(int hourOfDay,int minute,int second) {
		hourOfDay=14;
		minute=10;
		second=0;
	}

	public CalenderBuilder build() {
		return this;
		
	}
	
}
