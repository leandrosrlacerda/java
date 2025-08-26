package estruturasrepetitivas;

import java.util.Scanner;

public class Crescente {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("Digite o valor de x: ");
        x = input.nextInt();
        System.out.print("Digite o valor de y: ");
        y = input.nextInt();

        while (x != y) {

            if (x < y) {
                System.out.println("CRESCENTE");
            } else {
                System.out.println("DECRESCENTE");
            }

            System.out.print("Digite o valor de x: ");
            x = input.nextInt();
            System.out.print("Digite o valor de y: ");
            y = input.nextInt();

        }
        input.close();
    }

}
