package cartas;

public class Dealer {

    private Deck deck;

    public Dealer(Deck deck){
        this.deck = deck;
    }

    public void shuffle(){
        // torna o array de cartas aleatório
        int num_cards = deck.size();
        // para cada carta, escolhe uma carta aleatória e troca-as
        for (int i = 0; i < num_cards; i++) {
            int random_index = (int) (Math.random() * num_cards);
            //Armazena temporariamente a carta na posição atual `i`
            Card temp = deck.get(i);
            //Substitui a carta na posição (i) pela carta na posição aleatória `i`
            deck.replace(i, deck.get(random_index));
            //Coloca a carta temporária na posição aleatória
            deck.replace(random_index, temp);
        }
    }

    public Card dealOneCard(){
        if (deck.size() > 0) {
            return deck.removeFromFront();
        }
        return null;
    }
}
