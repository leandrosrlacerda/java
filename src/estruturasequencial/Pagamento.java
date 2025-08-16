package estruturasequencial;

import java.util.Scanner;

public class Pagamento {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome, valorPorHoraStr;
        double valorHoraTrabalhada, qtdHorasTrabalhadas, salario;

        System.out.print("Nome: ");
        nome = input.nextLine();
        System.out.print("Valor por hora: ");
        valorPorHoraStr = input.next().trim().replace(',', '.');
        valorHoraTrabalhada = Double.parseDouble(valorPorHoraStr);
        System.out.print("Horas trabalhadas: ");
        qtdHorasTrabalhadas = input.nextDouble();

        salario = valorHoraTrabalhada * qtdHorasTrabalhadas;

        System.out.printf("O pagamento para o %s deve ser de R$ %.2f%n", nome, salario);

        input.close();

    }
}
