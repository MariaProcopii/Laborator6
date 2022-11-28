package Model;

import java.util.Random;

public class Human {
    private static int reputation = 0;
    private int opinion = 3;
    private final String[] names = {"Mary", "Petter", "Hary", "Ira",
            "John", "Steven", "Natalia", "Calin",
            "Nastia", "Alex", "Dumitru", "Inga"};
    public Random random = new Random();
    private final String name = names[random.nextInt(names.length)];

    public String getName() {
        return name;
    }

    public void setOpinion(int opinion) {
        this.opinion += opinion;
    }

    public int getOpinion() {
        return opinion;
    }

    public static void setReputation(int rep) {
        reputation += rep;
    }

    public static int getReputation() {
        return reputation;
    }
}
