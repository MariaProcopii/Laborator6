package View;


public class Main {

    public static void main(String[] args) {
//
//        String [] tableHeaders = { "Employee Name", "Salary", "Designation","Department"};
//
//        String[][] tableData = {
//                { "Mike Kurt", "10000", "Developer", "IT"  },
//                { "Steve Musk", "20000", "Lead DevOps", "IT" },
//                { "Larry Jobs", "30000", "Java Developer", "IT" },
//                { "Elon Peters", "400000", "Manager", "IT" },
//                { "Jake Burg", "50000000", "CEO", "IT"  },
//        };
//
//        ASCIITable.getInstance().printTable(tableHeaders, tableData);
//    }

        String leftAlignFormat = "| %-15s | %-4d |%n";

        System.out.format("+-----------------+------+%n");
        System.out.format("| Column name     | ID   |%n");
        System.out.format("+-----------------+------+%n");
        for (int i = 0; i < 5; i++) {
            System.out.format(leftAlignFormat, "some data" + i, 4444);
        }
        System.out.format("+-----------------+------+%n");
    }
}