package SortByNameAndAge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            int numberOfPeople = Integer.parseInt(scanner.nextLine());



            for (int i = 0; i < numberOfPeople; i++) {
                String[] input = scanner.nextLine().split(" ");
                String firstName = input[0];
                String lastName = input[1];
                int age = Integer.parseInt(input[2]);
                double salary = Double.parseDouble(input[3]);

            }

        }
}
