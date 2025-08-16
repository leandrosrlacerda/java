package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double distancia, combustivel, consumo;

        System.out.print("Distância percorrida: ");
        distancia = input.nextDouble();
        System.out.print("Combustível gasto: ");
        combustivel = input.nextDouble();

        consumo = distancia / combustivel;

        System.out.printf("Consumo: %.3f km/l", consumo);

        input.close();

    }

}
