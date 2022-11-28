package Controller;
import Model.Human;
import View.GoodByeM;
import View.GreetingM;

import java.util.Random;

public abstract class HumanController {
    private Human model = new Human();
    public Random random = new Random();

    protected GreetingM greetingView;
    protected GoodByeM goodByeView;
    public HumanController(GreetingM greetingView,
                           GoodByeM goodByeView){
        this.greetingView = greetingView;
        this.goodByeView = goodByeView;
    }

    public String getName() {
        return model.getName();
    }

    public void setOpinion(int opinion) {
        model.setOpinion(opinion);
    }

    public int getOpinion() {
        return model.getOpinion();
    }

    public static void setReputation(int rep) {
        Human.setReputation(rep);
    }

    public static int getReputation() {
        return Human.getReputation();
    }

    abstract void greeting();
    abstract void goodBye();
}
