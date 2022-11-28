package Controller;
import Model.Waiter;
import View.GoodByeM;
import View.GreetingM;
import View.Order;

public class WaiterController extends HumanController {
    private Order orderView;
    private Waiter model;
    private PlayerController player;
    private MealController meal;
    private MenuController menu;

    public WaiterController(GreetingM greetingView,
                            GoodByeM goodByeView,
                            Order orderView,
                            Waiter model,
                            PlayerController player,
                            MealController meal,
                            MenuController menu) {

        super(greetingView, goodByeView);
        this.orderView = orderView;
        this.model = model;
        this.player = player;
        this.meal = meal;
        this.menu = menu;
    }

    public void setBill(int bill) {
        model.setBill(bill);
    }

    public int getBill() {
        return model.getBill();
    }

    public int getPolite() {
        return model.getPolite();
    }

    public void greeting() {
        switch(getPolite()){
            case 3 -> {
                player.setOpinion(2);
                setReputation(2);
            }
            case 2 -> {
                player.setOpinion(1);
                setReputation(1);
            }
            case 1 -> {
                player.setOpinion(-1);
                setReputation(-2);
            }
        }
        greetingView.waiter(getName(), player.getName(), getPolite());
    }

    public void takeOrder(){
        meal.pickFood();
        meal.stopListCheck();
        orderView.approvedOrder(player.getName(), meal.getFood(), meal.getSupply());
    }

    public void bringBill(){
        int bill1 = menu.getFoodWithPrice().get(meal.getFood());
        int bill2 = menu.getSuppliesWithPrice().get(meal.getSupply());
        setBill(bill1 + bill2);
        player.pay(getBill());
    }

    void goodBye() {
        if(getPolite() == 1){
            setReputation(-2);
        }
        goodByeView.waiter(player.getName(), getBill(), player.getMoney());
    }
}
