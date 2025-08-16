package estruturasequencial;

import java.util.Scanner;

public class Circulo {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r, area;

        System.out.print("Digite o valor do raio: ");
        // Lê como texto e normaliza separqdor decimal para aceitar "3,5" ou "3.5"
        String raioStr = input.next().trim().replace(',', '.');
        r = Double.parseDouble(raioStr);

        area = PI * Math.pow(r, 2);

        System.out.printf("AREA = %.3f%n", area);

        input.close();
    }
}
