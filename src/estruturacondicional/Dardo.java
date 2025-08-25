package estruturacondicional;

import java.util.Scanner;

public class Dardo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distancia1, distancia2, distancia3;

        System.out.println("Digite as tres distancia: ");
        distancia1 = input.nextDouble();
        distancia2 = input.nextDouble();
        distancia3 = input.nextDouble();

        if (distancia1 > distancia2 && distancia1 > distancia3) {
            System.out.printf("MAIOR DISTANCIA = %.2f%n", distancia1);
        } else if (distancia2 > distancia3) {
            System.out.printf("MAIOR DISTANCIA = %.2f%n", distancia2);
        } else {
            System.out.printf("MAIOR DISTANCIA = %.2f%n", distancia3);
        }

        input.close();

    }

}
