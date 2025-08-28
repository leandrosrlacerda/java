package classes.atributos.metodos;

import java.util.Scanner;

public class MainAlunos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Alunos aluno = new Alunos();

        System.out.print("Nome do aluno: ");
        aluno.name = input.nextLine();
        System.out.print("Nota 1: ");
        aluno.primeiroTrimestre = input.nextDouble();
        System.out.print("Nota 2: ");
        aluno.segundoTrimestre = input.nextDouble();
        System.out.print("Nota 3: ");
        aluno.terceiroTrimestre = input.nextDouble();

        System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60.0) {
            System.out.println("REPROVADO");
            System.out.printf("FALTAM %.2f PONTOS%n", 60.0 - aluno.notaFinal());
        } else {
            System.out.println("APROVADO");
        }

        input.close();
    }
}
