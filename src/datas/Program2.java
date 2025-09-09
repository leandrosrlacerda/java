package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		/*
		 * for(String s: ZoneId.getAvailableZoneIds()) { System.out.println(); }
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

		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);

		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

		String dataFormatada = pastWeekLocalDate.format(dtf);
		System.out.println(dataFormatada);

		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDateTime, d02);
		System.out.println("T1 = " + t1.toDays());
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
		System.out.println("T2 = " + t2.toDays());
		Duration t3 = Duration.between(pastWeekInstant, d03);
		System.out.println("T3 = " + t3.toDays());
		
		
	}
}
