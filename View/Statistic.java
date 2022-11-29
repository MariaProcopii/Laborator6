package View;

import java.util.ArrayList;

public class Statistic {

    public void dailyStatistic(ArrayList<Integer> data){

        String leftAlignFormat = "| %-20s | %-4d |%n";

        String[] rawName = {"Table changed: " , "Menu changed: " , "Meal changed: " ,
                "Players arrived: " , "Players served: ", "Procent: ",
                "Reputation: ", "Days Past: "};

        System.out.format("\n+----------------------+------+%n");
        for (int i = 0; i < rawName.length; i++) {
            System.out.format(leftAlignFormat, rawName[i], data.get(i));
        }
        System.out.format("+----------------------+------+%n");
    }
}
