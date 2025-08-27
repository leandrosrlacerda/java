package estruturasrepetitivas;

import java.util.Scanner;

public class ParesConsecutivos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        int x = input.nextInt();
        int soma = 0;

        while (x != 0) {
            int inicio = x % 2 == 0 ? x : x + 1;
            soma = 5 * inicio + 20;
            System.out.printf("SOMA = %d\n", soma);

            System.out.print("Digite um número inteiro:");
            x = input.nextInt();
        }

        input.close();

    }
}
