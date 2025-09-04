package matrizes;

import java.util.Scanner;

public class DiagonalNegativos{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = input.nextInt();

        int[][] matriz = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("Elemento [%d,%d]: ", i, j);
                    matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("DIAGONAL PRINCIPAL:");
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][i] + " ");
            }

        int count =0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(matriz[i][j] < 0){
                        count++;
                    }
                }
            }

        System.out.print("\nQUANTIDADE DE VALORES NEGATIVOS: " + count);

        input.close();

    }
}
