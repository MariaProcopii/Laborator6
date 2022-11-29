package View;

public class Order {
    public void firstOrder(String name, String food, String supply){
        System.out.println("Player: " + name + " wants to order " + food + " with " + supply + ".");
    }

    public void foodInStop(String name){
        System.out.println("Food, ordered by Player " + name + " was in Stop-list.\n" +
                "Player should pick another food.");
    }

    public void supplyInStop(String name){
        System.out.println("Supply, wanted by Player " + name + " was in Stop-list.\n" +
                "Player should pick another supply.");
    }

    public void approvedOrder(String name, String food, String supply){
        System.out.println("Meal, wanted by Player " + name + " was not in Stop-list.");
        System.out.println("Player: " + name + " ordered "
                + food + " with " + supply + ".");
        System.out.println("Waiter: Thanks " + name + ". Your order will be ready as soon as possible.");
    }
}
