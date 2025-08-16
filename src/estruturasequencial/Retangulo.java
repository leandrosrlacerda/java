package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double base, altura, area, perimetro, diagonal;

        System.out.println("Base do retangulo: ");
        base = input.nextDouble();
        System.out.println("Altura do retangulo: ");
        altura = input.nextDouble();

        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));

        System.out.printf("AREA = %.4f\n", area);
        System.out.printf("PERIMETRO = %.4f\n", perimetro);
        System.out.printf("DIAGONAL = %.4f\n", diagonal);

        input.close();
    }
}
