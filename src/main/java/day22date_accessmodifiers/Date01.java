package day22date_accessmodifiers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {
	public static void main(String[] args) {

		LocalDate curDate = LocalDate.now();
		LocalDate curDate2 = LocalDate.of(2021, 04, 04);

		System.out.println(curDate2);
		System.out.println(curDate.plusDays(8));
		System.out.println(curDate.plusMonths(2));
		System.out.println(curDate.plusYears(5));

		LocalDateTime curDateTime = LocalDateTime.now();
		DateTimeFormatter dtformat1 = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");

		System.out.println(dtformat1.format(curDate));
		LocalTime curTime = LocalTime.now();

		int age = Period.between(curDate, curDate2).getYears();
		System.out.println(age);

	}
}
