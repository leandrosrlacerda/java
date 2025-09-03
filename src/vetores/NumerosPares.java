package vetores;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, totalPares;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = input.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = input.nextInt();
        }

        totalPares = 0;
        System.out.println();
        System.out.println("NUMEROS PARES: ");

        for (int i = 0; i < vector.length; i++) {
            if(vector[i] %2 == 0){
                System.out.print(vector[i] + " ");
                totalPares += 1;
            }
        }

        System.out.println("\nTOTAL DE PARES = " + totalPares);

        input.close();


    }
}
