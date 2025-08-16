package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B, C, quadrado, triangulo, trapezio;

        System.out.print("Digite a medida A: ");
        A = input.nextDouble();
        System.out.print("Digite a medida B: ");
        B = input.nextDouble();
        System.out.print("Digite a medida C: ");
        C = input. nextDouble();

        quadrado = A * A;
        System.out.printf("AREA DO QUADRADO = %.4f%n", quadrado);

        triangulo = (A * B) / 2;
        System.out.printf("AREA DO TRIANGULO = %.4f%n", triangulo);

        trapezio = ((A + B) * C) / 2;
        System.out.printf("AREA DO TRAPEZIO = %.4f%n", trapezio);

        input.close();
    }
}
