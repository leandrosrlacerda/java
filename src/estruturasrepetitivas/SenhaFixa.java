package estruturasrepetitivas;

import java.util.Scanner;

public class SenhaFixa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        while (senha != 1234) {
            System.out.println("Senha incorreta!");
            System.out.print("Digite a senha: ");
            senha = input.nextInt();
        }

        System.out.println("Acesso permitido");

        input.close();

    }
}
