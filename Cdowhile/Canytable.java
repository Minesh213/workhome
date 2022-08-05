package Cdowhile;

public class Canytable {
    public static void main(String[] args) {
        int number = 1;
        do {
            System.out.println(number++);
        }
        while (number <= 50);
        for (number = 1; number <= 10; number++) {
            int M = number * 5;
            System.out.println(M);
        }
    }
}
