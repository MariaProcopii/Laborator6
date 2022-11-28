package Controller;
import Model.*;
import View.QualityCheck;
import java.util.Random;

public abstract class EntitiesController {
    protected PlayerController player;
    public Random random = new Random();
    private final Entities model = new Entities();
    private final QualityCheck view = new QualityCheck();

    public EntitiesController(PlayerController player){
        this.player = player;
    }

    public int getQualityIndex() {
        return model.getQualityIndex();
    }

    public void setEntityType(String entityType) {
        model.setEntityType(entityType);
    }

    public String getEntityType() {
        return model.getEntityType();
    }

    public boolean getAnswer() {
        return model.getAnswer();
    }

    public void qualityCheck(String type, int qualityIndex){
        if(qualityIndex == 1){
            player.setOpinion(-1);
            change(type, getAnswer());
            view.qualityView(type, qualityIndex);
            view.changeView(getAnswer());
        }
        else if(qualityIndex == 2){
            player.setOpinion(1);
            view.qualityView(type, qualityIndex);
        }
        else{
            player.setOpinion(2);
            view.qualityView(type, qualityIndex);
        }
    }
    public void change(String string, boolean answer){
        if(answer){
            switch (string) {
                case "Deck" -> Deck.setDeckNr();
                case "Meal" -> Meal.setMealNr();
                case "Menu" -> Menu.setMenuNr();
                case "Table" -> Table.setTableNr();
            }
        }
    }
}
