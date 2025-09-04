package matrizes;

import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, somaElmentos;
        System.out.print("Qual a ordem da matriz? ");
        n = input.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }
        somaElmentos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j > i){
                    somaElmentos += matriz[i][j];
                }
            }
        }

        System.out.println("Soma dos elementos acima da diagonal principal: " + somaElmentos);
        input.close();
    }
}
