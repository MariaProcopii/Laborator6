package Controller;

import Model.Menu;
import java.util.Hashtable;

public class MenuController extends EntitiesController {
    private final Menu model;
    public MenuController(PlayerController player,
                          Menu model) {
        super(player);
        this.model = model;
        setEntityType("Menu");
    }

    public String getFoodFromSL() {
        return model.getFoodFromSL();
    }

    public void setFoodFromSL(String foodFromSL) {
        model.setFoodFromSL(foodFromSL);
    }

    public String getSupplyFromSL() {
        return model.getSupplyFromSL();
    }

    public void setSupplyFromSL(String supplyFromSL) {
        model.setSupplyFromSL(supplyFromSL);
    }

    public String[] getFoodList() {
        return model.getFoodList();
    }

    public String[] getSuppliesList() {
        return model.getSuppliesList();
    }

    public Hashtable<String, Integer> getFoodWithPrice() {
        return model.getFoodWithPrice();
    }

    public Hashtable<String, Integer> getSuppliesWithPrice() {
        return model.getSuppliesWithPrice();
    }

    public void stopList(){
        int rand1 = random.nextInt(getFoodList().length);
        int rand2 = random.nextInt(getSuppliesList().length);
        setFoodFromSL(getFoodList()[rand1]);
        setSupplyFromSL(getSuppliesList()[rand2]);
    }

    public void qualityCheck() {
        super.qualityCheck(getEntityType(), getQualityIndex());
    }
}
