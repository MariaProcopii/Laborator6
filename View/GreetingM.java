package View;

public class GreetingM {
    public void player(String name){
        System.out.println("Player: Hello, I am "
                + name + ". I need a free table.");
    }

    public void admin(String name, boolean free, int tableNr){
        System.out.println("Admin: Nice to meet you " + name
                + ". Let's find you a table.");
        if(free){
            System.out.println("Admin: We have free space. Please " +
                    "take a seat at table " + (tableNr + 1));
        }
        else{
            System.out.println("Admin: Sorry, we don't have space in restaurant.");
        }
    }

    public void waiter(String waiterName, String playerName, int polite){
        switch (polite) {
            case 3 -> {
                System.out.println("Waiter: Good morning. " + playerName +
                        " My name is " + waiterName + ". What do you want to order ?");
            }
            case 2 -> {
                System.out.println("Waiter: Hallo. What do you want to order ?");
            }
            case 1 -> {
                System.out.println("Waiter: Are you ready or not to make an order ?!");
            }
        }
    }

    public void cook(String waiterName, int polite){
        System.out.println("Cook: " + waiterName + ". Give me the order.");
        if(polite < 3){
        System.out.println("Cook: Why are you so slow ?!");
        }
    }

    public void barman(String name, String barmanName, boolean decision){
        System.out.println("Barman: Hello " + name + ". My name is " +
                barmanName + ". I have a special offer for you.\nIf you beat me at " +
                "cards, I'll give you 100 $.\nBut if you loose, I receive 50 $. Deal ?");
        if(decision){
            System.out.println("Player: Okay, Let's play.");
        }
        else {
            System.out.println("Player: No, thanks.");
        }
    }
}
