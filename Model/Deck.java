package Model;
import java.util.*;
public class Deck {

    private static int deckNr = 0;
    private ArrayList<String> suit = new ArrayList<>();
    private ArrayList<String> rank = new ArrayList<>();
    private ArrayList<Integer> value = new ArrayList<>();

    private final Hashtable<String, Integer> cardWithValue = new Hashtable<>();
    private final String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private final String[] ranks = {"Two", "Three", "Four", "Fife", "Six", "Seven", "Eight",
            "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private final Integer[] index = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public Hashtable<String, Integer> getCardWithValue() {
        for(int i = 0; i < ranks.length; i++){
            cardWithValue.put(ranks[i], index[i]);
        }
        return cardWithValue;
    }
    public static void setDeckNr() {
        deckNr ++;
    }

    public static int getDeckNr() {
        return deckNr;
    }


    public String[] getSuits() {
        return suits;
    }

    public String[] getRanks() {
        return ranks;
    }

    public int getValue(int index) {
        return value.get(index);
    }

    public void setValue(int value, int index) {
        this.value.add(index, value);
    }

    public String getRank(int index) {
        return rank.get(index);
    }

    public void setRank(String rank, int index) {
        this.rank.add(index, rank);
    }

    public String getSuit(int index) {
        return suit.get(index);
    }

    public void setSuit(String suit, int index) {
        this.suit.add(index, suit);
    }
}
