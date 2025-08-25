package estruturacondicional;

import java.util.Scanner;

public class Coordenadas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x, y;

        System.out.print("Valor de x: ");
        x = input.nextDouble();
        System.out.print("Valor de y: ");
        y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Coordenadas: " + x + ", " + y);
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Coordenadas: " + x + ", " + y);
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Coordenadas: " + x + ", " + y);
            System.out.println("Q3");
        } else {
            System.out.println("Coordenadas: " + x + ", " + y);
            System.out.println("Q4");
        }

        input.close();
    }
}
