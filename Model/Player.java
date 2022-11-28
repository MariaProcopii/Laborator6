package Model;

public class Player{
    private String meal;
    private static int playerNr = 0;
    private int money;
    private int tip = 0;
    private boolean decision;
    private boolean winGame;

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money += money;
    }

    public void pay(int bill){
        this.money -= bill;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public void setDecision(boolean decision) {
        this.decision = decision;
    }

    public boolean getDecision() {
        return decision;
    }

    public static int getPlayerNr() {
        return playerNr;
    }

    public static void setPlayerNr() {
        playerNr++;
    }

    public void setWinGame(boolean winGame) {
        this.winGame = winGame;
    }

    public boolean getWinGame() {
        return winGame;
    }
}
