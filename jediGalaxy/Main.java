package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        fillField(rows, cols, matrix); //метод за запълване матрицата с числата от 1...

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] PeterPosition = reedPosition(command);
            int[] evilPosition = reedPosition(scanner.nextLine());
            int rowsEvil = evilPosition[0];
            int colsEvil = evilPosition[1];

            moveEvil(matrix, rowsEvil, colsEvil);

            int rowsPeter = PeterPosition[0];
            int colsPeter = PeterPosition[1];

            int collectStarts = getStarts(matrix, rowsPeter, colsPeter);
            sum += collectStarts;

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static int getStarts(int[][] matrix, int rowsPeter, int colsPeter) {
        int countStars = 0;
        while (rowsPeter >= 0 && colsPeter < matrix[1].length) {
            if (rowsPeter < matrix.length && colsPeter >= 0 && colsPeter < matrix[0].length) {
                countStars += matrix[rowsPeter][colsPeter];
            }

            colsPeter++;
            rowsPeter--;
        }
        return countStars;
    }

    private static void moveEvil(int[][] matrix, int rowsEvil, int colsEvil) {
        while (rowsEvil >= 0 && colsEvil >= 0) {
            if (rowsEvil < matrix.length && colsEvil < matrix[0].length) {
                matrix[rowsEvil][colsEvil] = 0;
            }
            rowsEvil--;
            colsEvil--;
        }
    }

    private static int[] reedPosition(String command) {
        int[] PeterPosition = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
        return PeterPosition;
    }

    private static void fillField(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }
    }
}
