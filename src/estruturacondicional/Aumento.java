package estruturacondicional;

import java.util.Scanner;

public class Aumento {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario;

        System.out.print("Digite o salário da pessoa: " );
        salario = input.nextDouble();

        if(salario <= 1000.00){
            System.out.printf("Novo salario = R$ %.2f%n", salario + (salario * 0.20) );
            System.out.printf("Aumento = R$ %.2f%n", salario * 0.20 );
            System.out.print("20% de aumento");
        } else if(salario <= 3000.00){
            System.out.printf("Novo salario = R$ %.2f%n", salario + (salario * 0.15));
            System.out.printf("Aumento = R$ %.2f%n", salario * 0.15);
            System.out.print("15% de aumento");
        } else if(salario <= 8000.00){
            System.out.printf("Novo salario = R$ %.2f%n", salario + (salario * 0.10));
            System.out.printf("Aumento = R$ %.2f%n", salario * 0.10);
            System.out.print("10% de aumento");
        } else {
            System.out.printf("Novo salario = R$ %.2f%n", salario + (salario * 0.05));
            System.out.printf("Aumento = R$ %.2f%n", salario * 0.05);
            System.out.print("5% de aumento");
        }

        input.close();
    }

}
