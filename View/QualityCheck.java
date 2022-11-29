package View;

public class QualityCheck {

    public void changeView(boolean answer){
        System.out.println("Maybe I should change it ?");
        if(answer){
            System.out.print("Sorry, can you change it ?");
        }
        else{
            System.out.print("No, I'll keep it.");
        }
        System.out.println("\n");
    }

    public void qualityView(String string, int qualityIndex){
        System.out.println("\n---Check the " + string + " appearance---");
        if ("Deck".equals(string)) {
            switch (qualityIndex) {
                case 1 -> System.out.print("Barman: And how should I shuffle this old deck ? :(");
                case 2 -> System.out.print("Barman: The deck is good enough :|");
                case 3 -> System.out.print("Barman: Wow, this deck is really good :) ");
            }
        }
        else if("Menu".equals(string)){
            switch (qualityIndex) {
                case 1 -> System.out.print("Player: What a bad design :(");
                case 2 -> System.out.print("Player: Photos are good and food description is laconic :|");
                case 3 -> System.out.print("Player: Wow, everything is looking so tasty and colorful :) ");
            }
        }
        else if("Meal".equals(string)){
            switch (qualityIndex) {
                case 1 -> System.out.print("Player: What a bad chef :(");
                case 2 -> System.out.print("Player: Chef did his best :|");
                case 3 -> System.out.print("Player: Wow, Chef is a real professional :) ");
            }
        }
        else if("Table".equals(string)){
            switch (qualityIndex) {
                case 1 -> System.out.print("Player: What a bad table :(");
                case 2 -> System.out.print("Player: Table is pretty good :|");
                case 3 -> System.out.print("Player: Wow, I received the best place :) ");
            }
        }
        System.out.println("\n");
    }
}
