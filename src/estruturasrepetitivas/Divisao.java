package estruturasrepetitivas;

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Quantos casos você vai digitar: ");
        N = input.nextInt();

        for (int i = 0; i < N; i++) {

            double a, b;

            System.out.print("Entre com o numerador: ");
            a = input.nextDouble();
            System.out.print("Entre com o denominador: ");
            b = input.nextDouble();

            if (b == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                System.out.println("DIVISAO "+ a + " / " + b + " = " + (a / b));
            }
        }


        input.close();
    }

}
