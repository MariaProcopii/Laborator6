package Controller;
import Model.*;
import View.*;

import java.util.ArrayList;

public class MainController {
    public static void main(String[] args){
        GoodByeM goodByeView= new GoodByeM();
        GreetingM greetingView = new GreetingM();
        Order orderView = new Order();

        Admin adminMod = new Admin();
        Player playerMod = new Player();
        Table tableMod = new Table();
        Menu menuMod = new Menu();
        Meal mealMod = new Meal();
        Waiter waiterMod = new Waiter();
        Deck deckMod = new Deck();

        int nrOfTables = 1;
        int nrOfPlayers = 1;

        ArrayList<PlayerController> customersList = new ArrayList<>();
        for (int i = 0; i < nrOfPlayers; i++) {
            customersList.add(new PlayerController(playerMod, greetingView, goodByeView));
        }

        for (int i = 0; i < customersList.size(); i++) {
            System.out.println("\n====================================");
            System.out.println("Player Nr: [" + (i + 1) + "]\n" +
                    "In day: " + 1);
            System.out.println("====================================\n");

            PlayerController player = customersList.get(i);
            TableController table = new TableController(player, tableMod, i);
            AdminController admin = new AdminController(adminMod, greetingView, goodByeView,
                                                        player, table, nrOfPlayers, nrOfTables);
            MenuController menu = new MenuController(player, menuMod);
            MealController meal = new MealController(player, menu, mealMod, orderView);
            WaiterController waiter = new WaiterController(greetingView, goodByeView, orderView,
                                                           waiterMod, player, meal, menu);
            CookController cook = new CookController(greetingView, goodByeView, meal, waiter, player);
            DeckController deck = new DeckController(player, deckMod);
            BarmanCoontroller barman = new BarmanCoontroller(greetingView, goodByeView, deck, player);

            player.greeting();
            admin.greeting();
            if (admin.provideTable(customersList) == 0) {
                break;
            }
            table.qualityCheck();
            menu.qualityCheck();
            waiter.greeting();
            waiter.takeOrder();
            cook.greeting();
            cook.cooking();
            cook.goodBye();
            meal.qualityCheck();
            barman.greeting();
            barman.goodBye();
            waiter.bringBill();
            waiter.goodBye();
            player.goodBye();
            admin.goodBye();
        }

    }
}
