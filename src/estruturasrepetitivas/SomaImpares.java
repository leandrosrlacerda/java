package estruturasrepetitivas;

import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y;
        int soma = 0;
        System.out.println("Digite dois números: ");
        x = input.nextInt();
        y = input.nextInt();

        int menor = Math.min(x, y) + 1;
        int maior = Math.max(x, y) - 1;

        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("SOMA DOS IMPARES ENTRE " + x + " E " + y + " = " + soma);

        input.close();
    }

}
