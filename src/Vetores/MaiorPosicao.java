package Vetores;

import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = input.nextInt();

        double[] vector = new double[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = input.nextDouble();
        }

        double maior = vector[0];
        int posicao = 0;

        for (int i = 0; i < vector.length; i++) {
            if ( vector[i] > maior){
                maior = vector[i];
                posicao = i;
            }
        }

        System.out.println("O maior numero digitado foi " + maior + " na posicao " + posicao);

        input.close();

    }

}
