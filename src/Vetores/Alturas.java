package Vetores;

import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();
        double alturaTotal, quantidadeMenor16, percentualMenores;

        input.nextLine();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Altura: ");
            double altura = input.nextDouble();
            input.nextLine();

            pessoas[i].setNome(nome);
            pessoas[i].setIdade(idade);
            pessoas[i].setAltura(altura);

        }

        alturaTotal = quantidadeMenor16 = 0;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                quantidadeMenor16 += 1;
            }
            alturaTotal += pessoas[i].getAltura();
        }

        percentualMenores = quantidadeMenor16 / pessoas.length * 100;

        System.out.printf("Altura média = %.2f", alturaTotal / pessoas.length);

        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", percentualMenores);

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                System.out.printf("\n%s - %.2f", pessoas[i].getNome(), pessoas[i].getAltura());
            }
        }

        System.out.println();

        input.close();

    }
}
