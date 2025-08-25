package estruturacondicional;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro valor inteiro: ");
        num1 = input.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        num2 = input.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.print("São multiplos");
        } else {
            System.out.print("Não são multiplos");
        }

        input.close();

    }

}
