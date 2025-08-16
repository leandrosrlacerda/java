package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double largura;
        double comprimento;
        double valorMetroQuadrado;
        double areaDoTerreno;
        double precoDoTerreno;

        System.out.println("Digite a largura do terreno: ");
        largura = input.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = input.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        valorMetroQuadrado = input.nextDouble();

        areaDoTerreno = largura * comprimento;
        precoDoTerreno = areaDoTerreno * valorMetroQuadrado;

        System.out.printf("Area do terreno = %.2f\n" , areaDoTerreno);
        System.out.printf("Preço do terreno = %.2f\n", precoDoTerreno);

        input.close();

    }
}
