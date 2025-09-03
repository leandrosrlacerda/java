package vetores;

import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();

        double[] vector = new double[n];

        double somaNumerosPares = 0;
        int quantidadePares = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = input.nextDouble();
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                somaNumerosPares += vector[i];
                quantidadePares++;
            }
        }

        if (quantidadePares == 0) {
            System.out.println("NENHUM NUMERO PAR FOI ENCONTRADO");
        } else {

            System.out.printf("MEDIA DOS PARES = %.1f%n", somaNumerosPares / quantidadePares);
        }

        input.close();

    }
}


