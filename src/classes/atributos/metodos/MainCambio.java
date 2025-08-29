package classes.atributos.metodos;

import java.util.Scanner;

public class MainCambio {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o preço do dolar: ");
        double dollarPrice = input.nextDouble();
        System.out.print("Quantos dolares serão comprados: ");
        double amount = input.nextDouble();
        double result = Cambio.dollarToReal(amount, dollarPrice);
        System.out.printf("Valor em reais: %.2f%n", result);

        input.close();
    }
}
