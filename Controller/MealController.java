package Controller;

import Model.Meal;
import View.Order;

public class MealController extends EntitiesController {
    private final MenuController menu;
    private final Meal model;
    private final Order orderView;

    public MealController(PlayerController player,
                          MenuController menu,
                          Meal model,
                          Order orderView) {
        super(player);
        this.menu = menu;
        this.model = model;
        this.orderView = orderView;
        setEntityType("Meal");
    }

    public void setFood(String food) {
        model.setFood(food);
    }

    public String getFood() {
        return model.getFood();
    }

    public void setSupply(String supply) {
        model.setSupply(supply);
    }

    public String getSupply() {
        return model.getSupply();
    }

    public void pickFood(){
        int rand1 = random.nextInt(menu.getFoodList().length);
        int rand2 = random.nextInt(menu.getSuppliesList().length);
        setFood(menu.getFoodList()[rand1]);
        setSupply(menu.getSuppliesList()[rand2]);
        orderView.firstOrder(player.getName(), getFood(), getSupply());
    }

    public void stopListCheck(){
        menu.stopList();
        if(getFood().equals(menu.getFoodFromSL())){
            player.setOpinion(-1);
            orderView.foodInStop(player.getName());
            pickFood();
        }
        else if(getSupply().equals(menu.getSupplyFromSL())){
            player.setOpinion(-1);
            orderView.supplyInStop(player.getName());
            pickFood();
        }
    }

    public void qualityCheck() {
        super.qualityCheck(getEntityType(), getQualityIndex());
    }
}
