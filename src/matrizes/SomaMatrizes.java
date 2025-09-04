package matrizes;

import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;
        System.out.print("Quantas linhas vai ter cada matriz? ");
        m = input.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        n = input.nextInt();

        int[][] matrizA = new int[m][n];
        int[][] matrizB = new int[m][n];
        int[][] soma = new int[m][n];

        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matrizA[i][j] = input.nextInt();
            }
        }
        System.out.println("Digite os valores da matriz B: ");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matrizB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("MATRIZ SOMA:");
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("%d ", soma[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
