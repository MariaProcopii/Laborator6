package Model;

public class Admin{
    private int nrOfTables;
    private int number;
    private boolean free;
    private static int servicedPlayers = 0;

    public void setNrOfTables(int nrOfTables) {
        this.nrOfTables = nrOfTables;
    }

    public int getNrOfTables() {
        return nrOfTables;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public boolean getFree() {
        return free;
    }

    public static void setServicedPlayers() {
        servicedPlayers++;
    }

    public static int getServicedPlayers() {
        return servicedPlayers;
    }
}
