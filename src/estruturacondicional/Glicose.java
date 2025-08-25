package estruturacondicional;

import java.util.Scanner;

public class Glicose {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double quantidadeGlicose;

        System.out.println("Quantidade de glicose em mg/dL: ");
        quantidadeGlicose = input.nextDouble();

        if (quantidadeGlicose <= 100) {
            System.out.print("Classificação: normal");
        } else if (quantidadeGlicose <= 140){
            System.out.print("Classificação: elevado");
        } else {
            System.out.print("Classificaçao: diabetes");
        }

        input.close();

    }

}
