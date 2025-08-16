package estruturasequencial;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Digite o valor de x: ");
        x = input.nextInt();
        System.out.print("Digite o valor de y: ");
        y = input.nextInt();

        System.out.println("SOMA = " + (x + y));

        input.close();

    }
}
