package estruturasrepetitivas;

import java.util.Scanner;

public class SequenciaImpares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        input.close();
    }
}
