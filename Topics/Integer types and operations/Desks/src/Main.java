import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int groupOne = scanner.nextInt();
        int groupTwo = scanner.nextInt();
        int groupThree = scanner.nextInt();

        int groupOneTables = (groupOne / 2) + (groupOne % 2);
        int groupTwoTables = (groupTwo / 2) + (groupTwo % 2);
        int groupThreeTables = (groupThree / 2) + (groupThree % 2);

        int totalTables = groupOneTables + groupTwoTables + groupThreeTables;

        System.out.println(totalTables);
    }
}