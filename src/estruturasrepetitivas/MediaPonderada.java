package estruturasrepetitivas;

import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos casos você vai digitar: ");
        int N = input.nextInt();
        double mediaPonderada, nota1, nota2, nota3;

        for (int i = 0; i < N; i++) {
            nota1 = input.nextDouble();
            nota2 = input.nextDouble();
            nota3 = input.nextDouble();

            mediaPonderada = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

            System.out.printf("Media ponderada: %.1f%n", mediaPonderada);
        }
        input.close();
    }

}
