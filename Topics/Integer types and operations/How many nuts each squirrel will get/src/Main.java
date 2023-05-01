import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = a++;
        int c = --a + b++;
        int result = ++a - (c++ - b) + c;
        System.out.println(result);
    }
}