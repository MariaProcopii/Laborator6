package Model;

public class Table{
    private int number;
    private static int tableNr = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void setTableNr() {
       tableNr ++;
    }

    public static int getTableNr() {
        return tableNr;
    }
}
