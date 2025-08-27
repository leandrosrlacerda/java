package estruturasrepetitivas;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        long fatorial = 1;

        System.out.print("Digite um valor inteiro: ");
        num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            fatorial *= i;
        }
        System.out.println("FATORIAL = " + fatorial);
        input.close();
    }
}
