package Bwhileloop;

public class Beven {
    public static void main(String[] args) {
        int M = 1;
        while (M <= 25) {
            for (M = 1; M <= 25; M++)
                if (M % 2 == 0) {
                    System.out.println(M);
                }
        }
    }
}
