package cartas;

public class Card {

    private int rank;
    private int suit;
    private boolean face_up;

    // constantes usadas para instanciar naipes
    public static final int DIAMONDS = 4;
    public static final int HEARTS = 3;
    public static final int SPADES = 6;
    public static final int CLUBS = 5;

    // constantes usadas para instanciar valores
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 74;
    public static final int QUEEN = 81;
    public static final int KING = 75;
    public static final int ACE = 65;

    // cria uma nova carta - usa apenas as constantes para inicializar
    public Card(int suit, int rank) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public void faceUp() {
        face_up = true;
    }

    public void faceDown() {
        face_up = false;
    }

    public boolean isFaceUp() {
        return face_up;
    }

    public String display() {
        String display;

        if (rank > 10) {
            display = String.valueOf((char) rank);
        } else {
            display = String.valueOf(rank);
        }
        switch (suit) {
            case DIAMONDS:
                return display += "♦";
            case HEARTS:
                return display += "♥";
            case SPADES:
                return display += "♠";
            default:
            case CLUBS:
                return display += "♣";
        }

/*        switch (suit) {
            case DIAMONDS:
                return display + String.valueOf((char) DIAMONDS);
            case HEARTS:
                return display + String.valueOf((char) HEARTS);
            case SPADES:
                return display + String.valueOf((char) SPADES);
            default:
            case CLUBS:
                return display + String.valueOf((char) CLUBS);
        }*/
    }
}
