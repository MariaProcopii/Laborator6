package Model;
import java.util.Random;

public class Waiter {
    public int bill;
    Random random = new Random();
    public int polite = random.nextInt(3) + 1;

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getBill() {
        return bill;
    }

    public int getPolite() {
        return polite;
    }
}
