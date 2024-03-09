package application;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2024-08-03");
		LocalDateTime d02 = LocalDateTime.parse("2024-08-03T01:03:26");
		Instant d03 = Instant.parse("2024-08-03T01:03:26Z");
		
		DateTimeFormatter fnt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fnt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fnt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fnt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("D01 : " + d01.format(fnt1));
		System.out.println("D01 : " + fnt1.format(d01));
		
		
		System.out.println("D02 : " + d02);
		System.out.println("D02 : " + d02.format(fnt1));
		System.out.println("D02 : " + fnt2.format(d02));
		System.out.println("D02 : " + fnt4.format(d02));
		
		
		System.out.println("D03 : " + d03);
		System.out.println("DO3 : " + fnt3.format(d03));
		
		

	}

}
