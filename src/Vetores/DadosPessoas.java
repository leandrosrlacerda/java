package Vetores;

import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();

        double menorAltura, maiorAltura, alturaMulheres;
        int numeroDeHomens, numeroDeMulheres;

        Pessoa[] pessoas = new Pessoa[n];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            pessoas[i].setAltura(input.nextDouble());
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            pessoas[i].setGenero(input.next().charAt(0));
        }

        alturaMulheres = 0;
        menorAltura = pessoas[0].getAltura();
        maiorAltura = pessoas[0].getAltura();
        numeroDeHomens = 0;
        numeroDeMulheres = 0;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getGenero() == 'F') {
                alturaMulheres += pessoas[i].getAltura();
                numeroDeMulheres += 1;
            }
            if (pessoas[i].getGenero() == 'M') {
                numeroDeHomens += 1;
            }

        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Média das alturas das mulheres: %.2f%n ", alturaMulheres / numeroDeMulheres);
        System.out.println("Numero de homens: " + numeroDeHomens);


        input.close();
    }
}
