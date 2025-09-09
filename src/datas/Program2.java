package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		/*
		for(String s: ZoneId.getAvailableZoneIds()) {
			System.out.println();
		}
		*/
		
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		System.out.println(r1);
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(r2);
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		System.out.println(r3);
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		System.out.println(r4);
		
		System.out.println("d01 dia = " + d01.getDayOfMonth());
		System.out.println("d01 mes = " + d01.getMonthValue());
		System.out.println("d01 ano = " + d01.getYear());
		
		System.out.println("d02 hora = " + d02.getHour());
		System.out.println("d02 minutos = " + d02.getMinute());
		System.out.println("d02 segundos = " + d02.getSecond());
		
		
	}
}
