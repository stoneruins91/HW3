import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DaysFromBorn {
	public static void main(String []args)
	{
		ZonedDateTime now = ZonedDateTime.now();
		LocalDate date =LocalDate.of(1991, Month.JULY, 2);
		LocalTime time = LocalTime.of(17, 45);
		ZoneId zone = ZoneId.of("Asia/Ho_Chi_Minh");
		ZonedDateTime born = ZonedDateTime.of(date, time, zone);
		double days = born.until(now, ChronoUnit.DAYS);
		System.out.println(days);
	}
}
