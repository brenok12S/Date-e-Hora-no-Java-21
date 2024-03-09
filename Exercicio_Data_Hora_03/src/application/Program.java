package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;


public class Program {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2024-09-03");
		
		
		LocalDateTime d02 = LocalDateTime.parse("2024-09-03T01:30:20");
		
		
		Instant d03 = Instant.parse("2024-09-03T01:20:26Z");

		/* 
		for ( String s : ZoneId.getAvailableZoneIds()) {
			System.out.println("");
			};
		*/	
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.println("R1 : " + r1);
		System.out.println("R2 : " + r2);
		System.out.println("R3 : " + r3);
		System.out.println("R4 : " + r4);
		
		System.out.println("DIA = " + d01.getDayOfMonth());
		System.out.println("MES = " + d01.getMonthValue());
		System.out.println("ANO = " + d01.getYear());
		
		System.out.println("HORA = " + d02.getHour());
		System.out.println("MINUTOS = " + d02.getMinute());
		
		
	}

}
