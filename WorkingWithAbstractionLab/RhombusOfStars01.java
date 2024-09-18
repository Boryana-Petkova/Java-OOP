package WorkingWithAbstractionLab;

import java.util.Scanner;

public class RhombusOfStars01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopHalf(n);

        printBottomHalf(n);
    }

    private static void printBottomHalf(int n) {
        for (int starCount = n - 1; starCount > 0 ; starCount--) {
            printTopHalf(n, starCount);
        }
    }

    private static void printTopHalf(int n) {
        for (int starCount = 1; starCount <= n; starCount++) {
            printTopHalf(n, starCount);
        }
    }

    private static void printTopHalf(int n, int starCount) {
        for (int i = 0; i < n - starCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starCount - 1; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
