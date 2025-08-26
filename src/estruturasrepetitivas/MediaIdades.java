package estruturasrepetitivas;

import java.util.Scanner;

public class MediaIdades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite as idades:");
        int idade = input.nextInt();
        double soma = 0;
        int contador = 0;

        while (idade > 0) {
            soma += idade;
            contador++;

            System.out.print("Digite as idades:");
            idade = input.nextInt();

        }
        if (contador > 0) {
            System.out.printf("MEDIA = %.2f%n ", (soma / contador));
        } else {
            System.out.println("IMPOSSIVEL CALCULAR");
        }
        input.close();

    }
}
