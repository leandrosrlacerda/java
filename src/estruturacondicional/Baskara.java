package estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class Baskara {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, delta, x1, x2;
        System.out.print("Coeficiente a: ");
        a = input.nextDouble();
        System.out.print("Coeficiente b: ");
        b = input.nextDouble();
        System.out.print("Coeficiente c: ");
        c = input.nextDouble();

        delta = (b * b) - (4 * a * c);

        if (delta < 0){
            System.out.println("Esta equação não possui raizes reais.");
        } else {
            x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            x2 = ((-b) - Math.sqrt(delta)) / (2 * a);

            System.out.printf("X1 = %.4f%n", x1);
            System.out.printf("X2 = %.4f%n", x2);
        }

        input.close();
    }
}
