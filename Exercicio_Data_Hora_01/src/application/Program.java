package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		/* Error */
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		
		/* dd/MM/yyyy */
		DateTimeFormatter fnt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fnt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		/* LOCAL */
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		LocalDate d04 = LocalDate.parse("2024-03-08");
		LocalDateTime d05 = LocalDateTime.parse("2024-03-08T01:30:26");
		LocalDate d08 = LocalDate.parse("08/03/2024", fnt1);
		LocalDateTime d09 = LocalDateTime.parse("08/03/2024 01:30", fnt2);
		LocalDate d10 = LocalDate.of(2024, 8, 03);
		LocalDateTime d11 = LocalDateTime.of(2024, 3, 8, 1, 30);
		
		/* GLOBAL (LONDON) */
		Instant d03 = Instant.now(); 
		Instant d06 = Instant.parse("2024-03-08T01:30:26Z");
		Instant d07 = dateFormat.parse("2024-03-08T01:30:26:03:30").toInstant();
		
		System.out.println("D01 : " + d01.toString());
		System.out.println("D02 : " + d02.toString());
		System.out.println("D03 : " + d03.toString());
		System.out.println("D04 : " + d04.toString());
		System.out.println("D05 : " + d05.toString());
		System.out.println("D06 : " + d06.toString());
		System.out.println("D07 : " + d07.toString());
		System.out.println("D08 : " + d08.toString());
		System.out.println("D09 : " + d09.toString());
		System.out.println("D10 : " + d10.toString());
		System.out.println("D11 : " +d11.toString());
		
	}

}
