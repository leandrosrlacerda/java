package cartas;

public class Main {
    public static void main(String[] args) {

        // cria um novo baralho
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        // Mostra quantidade de cartas
        System.out.println(deck.size());

        // Imprime todas as cartas
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).display());
        }
        // embaralha as cartas
        dealer.shuffle();

        System.out.println(deck.size());
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).display());
        }

        System.out.println(deck.removeFromFront().display());

        System.out.println(deck.display());

    }
}
