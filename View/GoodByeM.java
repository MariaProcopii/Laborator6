package View;

public class GoodByeM {
    public void player(boolean decision){
        if(decision){
            System.out.println("Player: You worked good and " +
                    "I've decided to leave you some money.");
        }
        else{
            System.out.println("Player: I'm not so satisfied to leave you money.");
        }
    }

    public void admin(String name, int opinion){
        if(opinion < 3){
            System.out.println("Admin: " + name + ", we are so sorry for not providing you " +
                    "a high-level service. Hope, you will give us another chance.");
        }
        else{
            System.out.println("Admin: Hope you had a great time. Waiting for your next visit.");
        }
    }

    public void waiter(String name, int bill, int balance){
        System.out.println("Waiter: Your bill, " + name
                + ", is " + bill + " $");
        System.out.println("Player: Now balance of my card is: "
                + balance + " $");
    }

    public void cook(String waiterName, int polite){
        switch (polite) {
            case 3 -> {
                System.out.println("Cook: " + waiterName + " you're just in time.");
                System.out.println("Player: Waiter works fast. Maybe I should leave him tips :) ");
            }
            case 2 -> {
                System.out.println("Cook: " + waiterName + " you're working so slow.");
                System.out.println("Player: Waiter is working good :|");
            }
            case 1 -> {
                System.out.println("Cook: " + waiterName + " you're working so slow. " +
                        "Now everything is cold. I need to redo the order! ");
                System.out.println("Player: Waiter is too slow :(");
            }
        }
    }

    public void barman(String name, boolean winGame,
                       String suit, String rank, int value,
                       String suitB, String rankB, int valueB){
        if(winGame){
            System.out.println("Game: Player " + name + " won with card " +
                    suit+ " " + rank + ", value = " + value +
                    ". Player received 100 $");
            System.out.println("Barman: " + name + ", luck was on your side." +
                    " I hope I never see you again.");
        }
        else {
            System.out.println("Game: Barman won with card " +
                    suitB + " " + rankB + ", value = " + valueB +
                    ". Player lose 50 $");
            System.out.println("Barman: I wish I had a chance to play with" +
                    " you more often. Bye.");
        }
    }
}
