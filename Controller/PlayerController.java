package Controller;
import Model.Player;
import View.*;

public class PlayerController extends HumanController{
    private Player model;

    public PlayerController(Player model,
                            GreetingM greetingView,
                            GoodByeM goodByeView){
        super(greetingView, goodByeView);
        this.model = model;
        setMoney(random.nextInt(201));
        setPlayerNr();
    }

    public String getMeal() {
        return model.getMeal();
    }

    public void setMeal(String meal) {
        model.setMeal(meal);
    }

    public int getMoney(){
        return model.getMoney();
    }

    public void setMoney(int money){
        model.setMoney(money);
    }

    public int getTip() {
        return model.getTip();
    }

    public void setTip(int tip) {
        model.setTip(tip);
    }

    public void pay(int bill){
        model.pay(bill);
    }

    public void setDecision(boolean decision) {
        model.setDecision(decision);
    }

    public boolean getDecision() {
        return model.getDecision();
    }

    public static int getPlayerNr() {
        return Player.getPlayerNr();
    }

    public static void setPlayerNr() {
        Player.setPlayerNr();
    }

    public void setWinGame(boolean winGame) {
        model.setWinGame(winGame);
    }

    public boolean getWinGame() {
        return model.getWinGame();
    }

    public void greeting(){
        greetingView.player(getName());
    }

    public void goodBye(){
        if(getMoney() > 0 && getOpinion() > 3){
            setDecision(true);
            setTip(random.nextInt(16) + 1);
            while(getTip() > getMoney()){
                setTip(random.nextInt(16) + 1);
            }
        }
        else{
            setDecision(false);
            if(getOpinion() < 6){
                setReputation(-1);
            }
        }
        goodByeView.player(getDecision());
    }
}

