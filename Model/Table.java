package Model;

public class Table{
    private int number;
    private static int tableNr = 0;

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        return this.number = number;
    }

    public static void setTableNr() {
       tableNr ++;
    }

    public static int getTableNr() {
        return tableNr;
    }
}
