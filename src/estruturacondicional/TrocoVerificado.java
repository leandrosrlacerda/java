package estruturacondicional;

import java.util.Scanner;

public class TrocoVerificado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double precoUnitario, quantidade, pagamento, troco;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = input.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantidade = input.nextDouble();
        System.out.print("Pagamento recebido: ");
        pagamento = input.nextDouble();

        if (pagamento >= (precoUnitario * quantidade)) {
            troco = pagamento - (precoUnitario * quantidade);
            System.out.printf("Troco: R$ %.2f", troco);
        } else {
            System.out.printf("PAGAMENTO INSUFICIENTE. FALTAM %.2f reais.%n", (precoUnitario * quantidade - pagamento));
        }

        input.close();

    }
}
