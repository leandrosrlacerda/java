package estruturasrepetitivas;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int alcool, gasolina, diesel, codigo;

        System.out.print("Informe um código:\n1 - Álcool\n2 - Gasolina\n3 - Diesel\n4 - Finalizar ");
        codigo = input.nextInt();

        alcool = 0;
        gasolina = 0;
        diesel = 0;

        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
            }

            System.out.print("Informe um código:\n1 - Álcool\n2 - Gasolina\n3 - Diesel\n4 - Finalizar ");
            codigo = input.nextInt();

        }

        System.out.println("\n***** MUITO OBRIGADO *****\n");
        System.out.printf("Alcool: %d\n", alcool );
        System.out.printf("Gasolina: %d\n", gasolina );
        System.out.printf("Diesel: %d\n", diesel);

        input.close();
    }
}
