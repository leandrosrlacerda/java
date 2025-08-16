package estruturasequencial;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome1, nome2;
        int idade1, idade2;

        System.out.println("Dados da primeira pessoa");
        System.out.print("Nome: ");
        nome1 = input.nextLine();
        System.out.print("Idade: ");
        idade1 = input.nextInt();

        input.nextLine();

        System.out.println("Dados da segunda pessoa");
        System.out.print("Nome: ");
        nome2 = input.nextLine();
        System.out.print("Idade: ");
        idade2 = input.nextInt();

        System.out.printf("A idade média de %s e %s é de %.1f anos.", nome1, nome2, (idade1 + idade2) / 2.0);

        input.close();
    }
}
