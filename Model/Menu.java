package Model;

import java.util.Hashtable;

public class Menu{

    private String foodFromSL;
    private String supplyFromSL;
    private static int menuNr = 0;
    private final String[] foodList = {"Burgher", "Pizza", "HotDog", "Sushi"};
    private final int[] foodListPrice = {40, 80, 30, 120};
    private final String[] suppliesList = {"cheese", "pork", "fish", "broccoli",
            "sausage", "mushrooms"};
    private final int[] suppliesListPrice = {5, 15, 20, 2, 10, 8};
    private Hashtable<String, Integer> foodWithPrice = new Hashtable<>();
    private Hashtable<String, Integer> suppliesWithPrice = new Hashtable<>();

    public String getFoodFromSL() {
        return foodFromSL;
    }

    public void setFoodFromSL(String foodFromSL) {
        this.foodFromSL = foodFromSL;
    }

    public String getSupplyFromSL() {
        return supplyFromSL;
    }

    public void setSupplyFromSL(String supplyFromSL) {
        this.supplyFromSL = supplyFromSL;
    }

    public String[] getFoodList() {
        return foodList;
    }

    public String[] getSuppliesList() {
        return suppliesList;
    }

    public int[] getFoodListPrice() {
        return foodListPrice;
    }

    public int[] getSuppliesListPrice() {
        return suppliesListPrice;
    }

    public Hashtable<String, Integer> getFoodWithPrice() {
        for(int i = 0; i < foodList.length; i++){
            foodWithPrice.put(foodList[i], foodListPrice[i]);
        }
        return foodWithPrice;
    }

    public Hashtable<String, Integer> getSuppliesWithPrice() {
        for(int i = 0; i < suppliesList.length; i++){
            suppliesWithPrice.put(suppliesList[i], suppliesListPrice[i]);
        }
        return suppliesWithPrice;
    }

    public static void setMenuNr() {
        menuNr ++;
    }

    public static int getMenuNr() {
        return menuNr;
    }
}
