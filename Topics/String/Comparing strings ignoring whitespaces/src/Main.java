import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String stringOne = scanner.nextLine().trim().replace(" ", "");
        String stringTwo = scanner.nextLine().trim().replace(" ", "");

        System.out.println(stringOne.equalsIgnoreCase(stringTwo));

    }
}