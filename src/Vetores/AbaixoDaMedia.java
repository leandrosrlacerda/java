package Vetores;

import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = input.nextInt();
        double somaElementos = 0;
        double media = 0;

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = input.nextDouble();
        }

        for (int i = 0; i < vector.length; i++) {
            somaElementos += vector[i];
        }

        media = somaElementos / vector.length;

        System.out.printf("MEDIA DO VETOR =  %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < media) {
                System.out.printf("%.1f%n", vector[i]);
            }
        }

        input.close();
    }

}
