package Controller;

import View.*;

public class CookController extends HumanController{

    private final MealController meal;
    private final WaiterController waiter;
    private final PlayerController player;

    public CookController(GreetingM greetingView,
                          GoodByeM goodByeView,
                          MealController meal,
                          WaiterController waiter,
                          PlayerController player) {

        super(greetingView, goodByeView);
        this.meal = meal;
        this.waiter = waiter;
        this.player = player;
    }

    public void cooking(){
        player.setMeal(meal.getFood() + " with " + meal.getSupply());
    }
    public void greeting() {
        greetingView.cook(waiter.getName(), waiter.getPolite());
    }

    public void goodBye() {
        switch (waiter.getPolite()){
            case 3 -> setReputation(1);
            case 2 -> setReputation(-1);
            case 1 -> setReputation(-2);
        }
        goodByeView.cook(waiter.getName(), waiter.getPolite());
    }

}
