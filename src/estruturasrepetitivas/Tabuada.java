package estruturasrepetitivas;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Deseja a tabuada para qual valor? ");
        int N = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }

        input.close();

    }

}

