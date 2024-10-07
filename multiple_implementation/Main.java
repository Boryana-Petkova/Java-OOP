package multiple_implementation;

import food_shortage.Birthable;
import food_shortage.Citizen;
import food_shortage.Identifiable;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class[] citizenInterfaces = food_shortage.Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(food_shortage.Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(food_shortage.Identifiable.class)) {
            Method[] methods = food_shortage.Birthable.class.getDeclaredMethods();
            Method[] methods1 = food_shortage.Identifiable.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();
            Identifiable identifiable = new food_shortage.Citizen(name, age, id, birthDate);
            Birthable birthable = new Citizen(name, age, id, birthDate);
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods1.length);
            System.out.println(methods1[0].getReturnType().getSimpleName());
        }
    }
}
