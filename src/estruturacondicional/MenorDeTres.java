package estruturacondicional;

import java.util.Scanner;

public class MenorDeTres {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Primeiro valor: ");
        num1 = input.nextInt();
        System.out.print("Segundo valor: ");
        num2 = input.nextInt();
        System.out.print("Terceiro valor: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("MENOR = " + num1);
        } else if (num2 < num3) {
            System.out.println("MENOR = " + num2);
        } else {
            System.out.println("MENOR = " + num3);
        }
        input.close();
    }
}

