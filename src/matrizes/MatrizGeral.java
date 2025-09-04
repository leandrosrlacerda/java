package matrizes;

import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Qual a ordem da matriz? ");
        n = input.nextInt();

        double[][] matriz = new double[n][n];
        double somaNumerosPositivos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0) {
                    somaNumerosPositivos += matriz[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("SOMA DOS VALORES POSITIVOS: " + somaNumerosPositivos);

        System.out.println();
        System.out.print("Escolha uma linha: ");
        int linha = input.nextInt();

        System.out.print("LINHA ESCOLHIDA: ");
        for (int i = 0; i < matriz[linha].length; i++) {
            System.out.printf("%.1f ", matriz[linha][i]);
        }

        System.out.println();
        System.out.print("\nEscolha uma coluna: ");
        int coluna = input.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][coluna] + " ");
        }

        System.out.println();
        System.out.print("\nDIAGONAL PRINCIPAL:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%.1f ",matriz[i][i]);
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }

        System.out.println();
        System.out.println("\nMATRIZ ALTERADA:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.1f ", matriz[i][j]);
            }
            System.out.println();
        }

        input.close();
    }
}
