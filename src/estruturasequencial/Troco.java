package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double precoUnitario, pagamento, troco;
        int quantidade;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = input.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantidade = input.nextInt();
        System.out.print("Dinheiro recebido: ");
        pagamento = input.nextDouble();

        troco = pagamento - (precoUnitario * quantidade);

        System.out.printf("TROCO: R$ %.2f%n", troco);

        input.close();
    }
}
