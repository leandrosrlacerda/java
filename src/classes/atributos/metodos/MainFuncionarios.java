package classes.atributos.metodos;

import java.util.Scanner;

public class MainFuncionarios {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Funcionarios funcionario = new Funcionarios();

        System.out.print("Nome: ");
        funcionario.name = input.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.groossSalary = input.nextDouble();
        System.out.print("Imposto: ");
        funcionario.tax = input.nextDouble();

        System.out.println("Funcionário: " + funcionario);

        System.out.print("Qual a porcentagem para aumentar o salário? ");
        double percentage = input.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println();
        System.out.println("Dados atualizados: " + funcionario);

        input.close();
    }
}
