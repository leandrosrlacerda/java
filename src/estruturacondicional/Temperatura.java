package estruturacondicional;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Qual é a escala de temperatura? (C/F): ");
            String escala = input.nextLine().trim().toUpperCase();

            double temperatura, celsius, fahrenheit;

            if (escala.equals("C")) {
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = input.nextDouble();

                fahrenheit = (temperatura * 9) / 5 + 32;

                System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", fahrenheit);

            } else if (escala.equals("F")) {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = input.nextDouble();

                celsius = (temperatura - 32) * 5 / 9;

                System.out.printf("Temperatura equivalente em Celsius: %.2f%n", celsius);
            }

            input.close();
        }
    }
}
