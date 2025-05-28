package cartas;

import java.util.LinkedList;

public class Deck {

    private LinkedList deck;

    public Deck() {
        buildCards();
    }

    // metodo privado que cria todas as 52 cartas do baralho
    private void buildCards() {
        deck = new LinkedList();

        deck.add(new Card(Card.CLUBS, Card.TWO));
        deck.add(new Card(Card.CLUBS, Card.THREE));
        deck.add(new Card(Card.CLUBS, Card.FOUR));
        deck.add(new Card(Card.CLUBS, Card.FIVE));
        deck.add(new Card(Card.CLUBS, Card.SIX));
        deck.add(new Card(Card.CLUBS, Card.SEVEN));
        deck.add(new Card(Card.CLUBS, Card.EIGHT));
        deck.add(new Card(Card.CLUBS, Card.NINE));
        deck.add(new Card(Card.CLUBS, Card.TEN));
        deck.add(new Card(Card.CLUBS, Card.JACK));
        deck.add(new Card(Card.CLUBS, Card.QUEEN));
        deck.add(new Card(Card.CLUBS, Card.KING));
        deck.add(new Card(Card.CLUBS, Card.ACE));
        deck.add(new Card(Card.DIAMONDS, Card.TWO));
        deck.add(new Card(Card.DIAMONDS, Card.THREE));
        deck.add(new Card(Card.DIAMONDS, Card.FOUR));
        deck.add(new Card(Card.DIAMONDS, Card.FIVE));
        deck.add(new Card(Card.DIAMONDS, Card.SIX));
        deck.add(new Card(Card.DIAMONDS, Card.SEVEN));
        deck.add(new Card(Card.DIAMONDS, Card.EIGHT));
        deck.add(new Card(Card.DIAMONDS, Card.NINE));
        deck.add(new Card(Card.DIAMONDS, Card.TEN));
        deck.add(new Card(Card.DIAMONDS, Card.JACK));
        deck.add(new Card(Card.DIAMONDS, Card.QUEEN));
        deck.add(new Card(Card.DIAMONDS, Card.KING));
        deck.add(new Card(Card.DIAMONDS, Card.ACE));
        deck.add(new Card(Card.HEARTS, Card.TWO));
        deck.add(new Card(Card.HEARTS, Card.THREE));
        deck.add(new Card(Card.HEARTS, Card.FOUR));
        deck.add(new Card(Card.HEARTS, Card.FIVE));
        deck.add(new Card(Card.HEARTS, Card.SIX));
        deck.add(new Card(Card.HEARTS, Card.SEVEN));
        deck.add(new Card(Card.HEARTS, Card.EIGHT));
        deck.add(new Card(Card.HEARTS, Card.NINE));
        deck.add(new Card(Card.HEARTS, Card.TEN));
        deck.add(new Card(Card.HEARTS, Card.JACK));
        deck.add(new Card(Card.HEARTS, Card.QUEEN));
        deck.add(new Card(Card.HEARTS, Card.KING));
        deck.add(new Card(Card.HEARTS, Card.ACE));
        deck.add(new Card(Card.SPADES, Card.TWO));
        deck.add(new Card(Card.SPADES, Card.THREE));
        deck.add(new Card(Card.SPADES, Card.FOUR));
        deck.add(new Card(Card.SPADES, Card.FIVE));
        deck.add(new Card(Card.SPADES, Card.SIX));
        deck.add(new Card(Card.SPADES, Card.SEVEN));
        deck.add(new Card(Card.SPADES, Card.EIGHT));
        deck.add(new Card(Card.SPADES, Card.NINE));
        deck.add(new Card(Card.SPADES, Card.TEN));
        deck.add(new Card(Card.SPADES, Card.JACK));
        deck.add(new Card(Card.SPADES, Card.QUEEN));
        deck.add(new Card(Card.SPADES, Card.KING));
        deck.add(new Card(Card.SPADES, Card.ACE));
    }

    // retorna uma carta do baralho na posicao INDEX
    public Card get(int index) {
        if (index < deck.size()) {
            return (Card) deck.get(index);
        }
        return null;
    }

    // substitui carta em determinada posição
    public void replace(int index, Card card) {
        deck.set(index, card);
    }

    public int size() {
        return deck.size();
    }

    // remove e retorna primeira carta
    public Card removeFromFront(){
        if (deck.size() > 0) {
            Card card = (Card) deck.removeFirst();
            return card;
        }
        return null;
    }
    // adiciona carta ao final do baralho
    public void returnToBack(Card card){
        deck.add(card);
    }

    public String display() {
        int num_cards = deck.size();
        String display = "";
        int counter = 0;
        for (int i = 0; i < num_cards; i++) {
            Card card = (Card) deck.get(i);
            display = display + card.display() + " ";
            counter++;
            if (counter == 13) {
                display = display + "\n";
                counter = 0;
            }
        }
        return display;
    }

}
