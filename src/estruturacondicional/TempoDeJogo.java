package estruturacondicional;

import java.util.Scanner;

public class TempoDeJogo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int horaInicial, horaFinal;

        System.out.print("Digite a hora inicial: ");
        horaInicial = input.nextInt();
        System.out.print("Digite a hora final: ");
        horaFinal = input.nextInt();

        if (horaFinal > horaInicial) {
            System.out.println("O jogo durou " + (horaFinal - horaInicial) + " horas.");
        } else {
            System.out.println("O jogo durou " + (24 - horaInicial + horaFinal) + " horas.");
        }

        int duracao = Math.floorMod(horaFinal - horaInicial, 24);
        if (duracao == 0) {
            duracao = 24;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);


        input.close();

    }

}
