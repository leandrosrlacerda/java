package matrizes;

import java.util.Scanner;

public class NegativosMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m, n;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        m = input.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        n = input.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("VALORES NEGATIVOS:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }

            }
        }

        input.close();
    }
}
