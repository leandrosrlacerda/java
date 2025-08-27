package estruturasrepetitivas;

import java.util.Scanner;

public class ValidacaoDeNota {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        double nota1 = input.nextDouble();

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Valor invalido! Tente novamente.");
            System.out.print("Digite a primeira nota:");
            nota1 = input.nextDouble();
        }

        System.out.print("Digite a segunda nota:");
        double nota2 = input.nextDouble();

        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Valor invalido! Tente novamente.");
            System.out.print("Digite a segunda nota:");
            nota2 = input.nextDouble();
        }

        System.out.printf("MEDIA = %.2f%n", (nota1 + nota2) / 2);

        input.close();
    }
}
