package Vetores;

import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

        input.close();

    }
}
