package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2024-03-09");
		LocalDateTime d02 = LocalDateTime.parse("2024-03-09T01:30:26");
		Instant d03 = Instant.parse("2024-03-09T01:30:26Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Past Week Local Date : " + pastWeekLocalDate);
		System.out.println("Next Week Local Date : " + nextWeekLocalDate);
		
		System.out.println("Past Week Local Date Time : " + pastWeekLocalDateTime);
		System.out.println("Next Week Local Date Time : " + nextWeekLocalDateTime);

		System.out.println("Past Week Instant : " + pastWeekInstant);
		System.out.println("Next Week Instant : " + nextWeekInstant);
		
		/* Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());  */
		Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
		Duration t3 = Duration.between(pastWeekInstant, d03);
		
		System.out.println("Duracao de dias : " + t1.toDays());
		System.out.println("Duracao de dias : " + t2.toDays());
		System.out.println("Duracao de dias : " + t3.toDays());
		
		
	}

}
