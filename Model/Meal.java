package Model;

public class Meal {
    private String food;
    private String supply;
    private static int mealNr = 0;

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public String getSupply() {
        return supply;
    }

    public static void setMealNr() {
        mealNr ++;
    }

    public static int getMealNr() {
        return mealNr;
    }
}
