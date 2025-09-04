package matrizes;

import java.util.Scanner;

public class CadaLinha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, maiorElemento;

        System.out.print("Qual ordem da matriz? ");
        n = input.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: = ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }


        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        maiorElemento = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                maiorElemento = Math.max(maiorElemento, matriz[i][j]);
            }
            System.out.println(maiorElemento);
            maiorElemento = 0;
        }

        input.close();
    }
}
