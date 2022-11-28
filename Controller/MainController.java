package Controller;

import Model.*;
import View.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainController {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        int nrOfDays = 0;
        int nrOfTables = 10;

        GoodByeM goodByeView = new GoodByeM();
        GreetingM greetingView = new GreetingM();
        Order orderView = new Order();
        Statistic statistic = new Statistic();

        while (true) {

            int nrOfPlayers = random.nextInt(20) + 1;
            nrOfDays++;
            ArrayList<PlayerController> customersList = new ArrayList<>();
            ArrayList<Integer> data = new ArrayList<>();

            for (int i = 0; i < nrOfPlayers; i++) {
                Player playerMod = new Player();
                customersList.add(new PlayerController(playerMod, greetingView, goodByeView));
            }

            for (int i = 0; i < customersList.size(); i++) {
                System.out.println("\n====================================");
                System.out.println("Player Nr: [" + (i + 1) + "]\n" +
                        "In day: " + nrOfDays);
                System.out.println("====================================\n");

                Admin adminMod = new Admin();
                Table tableMod = new Table();
                Menu menuMod = new Menu();
                Meal mealMod = new Meal();
                Waiter waiterMod = new Waiter();
                Deck deckMod = new Deck();

                PlayerController player = customersList.get(i);
                TableController table = new TableController(player, tableMod, i);
                AdminController admin = new AdminController(adminMod, greetingView, goodByeView,
                        player, table, i, nrOfTables);
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

            data.add(Table.getTableNr());
            data.add(Menu.getMenuNr());
            data.add(Meal.getMealNr());
            data.add(Player.getPlayerNr());
            data.add(Admin.getServicedPlayers());
            data.add(Admin.getServicedPlayers() * 100
                    / Player.getPlayerNr());
            data.add(Human.getReputation());
            data.add(nrOfDays);

            statistic.dailyStatistic(data);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
