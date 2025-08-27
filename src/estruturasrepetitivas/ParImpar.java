package estruturasrepetitivas;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar: ");
        int N = input.nextInt();
        int valor;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            valor = input.nextInt();

            if (valor == 0) {
                System.out.println("NULO");
            } else {
                if (valor % 2 == 0) {
                    System.out.print("PAR ");
                } else {
                    System.out.print("IMPAR ");
                }
                if (valor > 0) {
                    System.out.println("POSITIVO");
                } else {
                    System.out.println("NEGATIVO");
                }
            }
        }

        input.close();
    }
}
