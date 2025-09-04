package matrizes;

import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, m;
        System.out.print("Qual a quantidade de linhas da matriz? ");
        m = input.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        n = input.nextInt();

        double[][] matriz = new double[m][n];
        double[] soma = new double[m];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + "a linha: ");
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }


        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma[i] += matriz[i][j];
            }
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < soma.length; i++) {
            System.out.printf("%.2f%n", soma[i]);
        }

        input.close();
    }
}
