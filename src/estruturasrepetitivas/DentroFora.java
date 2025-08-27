package estruturasrepetitivas;

import java.util.Scanner;

public class DentroFora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar: ");
        int N = input.nextInt();

        int dentro, fora;
        dentro = 0;
        fora = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            int x = input.nextInt();

            if ( x >= 10 && x <= 20){
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("Dentro: " + dentro + "\nFora: " + fora);

        input.close();
    }
}
