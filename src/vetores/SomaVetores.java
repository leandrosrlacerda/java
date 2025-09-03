package vetores;

import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int n = input.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] soma = new int[n];

        System.out.println("Digite os valores do vetor A: ");

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            soma[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < soma.length; i++) {
            System.out.printf("%d%n", soma[i]);
        }


        input.close();

    }

}
