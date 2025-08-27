package estruturasrepetitivas;

import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N, qtdCobaias, rato, sapo, coelho;
        char tipoCobaia;

        rato = sapo = coelho = 0;

        System.out.print("Quantos casos de testes serão digitados: ");
        N = input.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Quantidade de cobaias: ");
            qtdCobaias = input.nextInt();

            System.out.print("Tipo de cobaia: ");
            tipoCobaia = input.next().charAt(0);

            if (tipoCobaia == 'R') {
                rato += qtdCobaias;
            } else if (tipoCobaia == 'S') {
                sapo += qtdCobaias;
            }  else {
                coelho += qtdCobaias;
            }
        }

        System.out.println("RELATORIO FINAL: ");
        System.out.println("Total: " + (rato + sapo + coelho) + " cobaias");
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n" , (coelho * 100.0 / (rato + sapo + coelho)));
        System.out.printf("Percentual de ratos:  %.2f %%\n" , (rato * 100.0 / (rato + sapo + coelho)));
        System.out.printf("Percentual de sapos:  %.2f %%\n" , (sapo * 100.0 / (rato + sapo + coelho)));

        input.close();
    }
}
