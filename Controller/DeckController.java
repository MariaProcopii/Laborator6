package Controller;
import Model.Deck;

import java.util.Hashtable;

public class DeckController extends EntitiesController{

    private Deck model;
    public DeckController(PlayerController player,
                          Deck model) {
        super(player);
        this.model = model;
        setEntityType("Deck");
    }

    public Hashtable<String, Integer> getCardWithValue() {
        return model.getCardWithValue();
    }

    public int getValue(int index) {
        return model.getValue(index);
    }

    public void setValue(int value, int index) {
        model.setValue(value, index);
    }

    public String getRank(int index) {
        return model.getRank(index);
    }

    public void setRank(String rank, int index) {
        model.setRank(rank, index);
    }

    public String getSuit(int index) {
        return model.getSuit(index);
    }

    public void setSuit(String suit, int index) {
        model.setSuit(suit, index);
    }

    public String[] getSuits() {
        return model.getSuits();
    }

    public String[] getRanks() {
        return model.getRanks();
    }

    public void findCardVal(String cardRank, int index){
        setValue(getCardWithValue().get(cardRank), index);
    }

    public void qualityCheck() {
        super.qualityCheck(getEntityType(), getQualityIndex());
    }

}
