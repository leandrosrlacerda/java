package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Serão digitados dados de quantos produtos? ");
        int n = sc.nextInt();
        
        int menos10 = 0, entre10e20 = 0, mais20 = 0;
        double totalCompra = 0, totalVenda = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Preço de compra: ");
            double compra = sc.nextDouble();
            System.out.print("Preço de venda: ");
            double venda = sc.nextDouble();

            double lucroPerc = (venda - compra) / compra * 100;

            if (lucroPerc < 10) {
                menos10++;
            } else if (lucroPerc <= 20) {
                entre10e20++;
            } else {
                mais20++;
            }

            totalCompra += compra;
            totalVenda += venda;
        }

        System.out.println("Lucro abaixo de 10%: " + menos10);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Lucro acima de 20%: " + mais20);
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", totalVenda - totalCompra);

        sc.close();
    }
}

