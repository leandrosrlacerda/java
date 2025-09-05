package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2021-01-01");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-09T10:15:30");
        Instant d06 = Instant.parse("2025-01-01T10:15:30Z");
        Instant d07 = Instant.parse("2025-01-01T10:15:30-03:00");

        LocalDate d08 = LocalDate.parse("09/07/2025", dtf);
        LocalDate d09 = LocalDate.parse("09/07/2025 22:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 01, 30);

        System.out.println("d01 = "+ d01);
        System.out.println("d02 = "+ d02);
        System.out.println("d03 = "+ d03);
        System.out.println("d04 = "+ d04);
        System.out.println("d05 = "+ d05);
        System.out.println("d06 = "+ d06);
        System.out.println("d07 = "+ d07);
        System.out.println("d08 = "+ d08);
        System.out.println("d09 = "+ d09);
        System.out.println("d10 = "+ d10);
        System.out.println("d11 = "+ d11);

    }
}
