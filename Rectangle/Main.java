package Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] coordinatesOfRectangle = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        Point BottomLeft = new Point(coordinatesOfRectangle[0], coordinatesOfRectangle[1]);
        // един вариант

        int xTopRight = coordinatesOfRectangle[2];
        int yTopRight = coordinatesOfRectangle[3];
        // втори вариант с изведени променливи първо

        Point TopRight = new Point(xTopRight, yTopRight);

        Rectangle rectangle = new Rectangle(BottomLeft, TopRight);

        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            int [] coordinates = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

            Point current = new Point(coordinates[0], coordinates[1]);
            System.out.println(rectangle.contains(current));

        }
    }
}
