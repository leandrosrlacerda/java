package estruturacondicional;

import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigo, quantidade;
        double pagar;

        System.out.print("Código do produto comprado: ");
        codigo = input.nextInt();

        System.out.print("Quantidade comprada: ");
        quantidade = input.nextInt();

        pagar = 0.0;

        if (codigo == 1) {
            pagar = quantidade * 5.00;
        } else if (codigo == 2) {
            pagar = quantidade * 3.50;
        } else if (codigo == 3) {
            pagar = quantidade *4.80;
        } else if (codigo == 4) {
            pagar = quantidade * 8.90;
        } else if (codigo == 5) {
            pagar = quantidade * 7.32;
        }

        System.out.printf("Valor a pagar: %.2f%n", pagar);

        input.close();

    }

}
