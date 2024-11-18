package NewFeatures;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println(date.minusDays(1));
		System.out.println(date.plusDays(1));
		
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDate leap = LocalDate.of(2023, 12, 12);
		System.out.println(leap.isLeapYear());
		
		Date d = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		
		String strDate = dateFormat.format(d);
		System.out.println(strDate);
		
		
		
		
	}

}
