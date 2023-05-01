import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of parts
        int ready = 0; // Parts ready to be shipped
        int toBeFixed = 0; // Parts to be fixed
        int rejects = 0; // Rejects

        for (int i = 0; i < n; i++) {
            int detectorPrint = scanner.nextInt();

            if (detectorPrint == 0) {
                ready++;
            } else if (detectorPrint == 1) {
                toBeFixed++;
            } else if (detectorPrint == -1) {
                rejects++;
            }
        }

        System.out.println(ready + " " + toBeFixed + " " + rejects);
    }
}