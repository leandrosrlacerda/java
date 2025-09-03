package vetores;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = input.nextInt();

        Aluno[] alunos = new Aluno[n];

        input.nextLine();

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno();
            System.out.println("Dados do " + (i + 1) + "a aluno: ");
            alunos[i].setNome(input.nextLine());
            alunos[i].setNota1(input.nextDouble());
            alunos[i].setNota2(input.nextDouble());
            input.nextLine();
        }

        for (int i = 0; i < alunos.length; i++) {
            if ((alunos[i].getNota1() + alunos[i].getNota2()) / 2 > 6.0) {
                System.out.println(alunos[i].getNome() + " foi aprovado!");
            } else {
                System.out.println(alunos[i].getNome() + " foi reprovado!");
            }
        }

        input.close();
    }
}
