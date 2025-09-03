package vetores;

import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = input.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = input.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        double soma = 0;
        for (int i = 0; i < vector.length; i++) {
            soma += vector[i];
        }
        System.out.printf("\nSOMA = %.2f%n", soma);

        System.out.printf("MEDIA = %.2f%n", soma / vector.length);

        input.close();

    }
}
