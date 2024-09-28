package food_shortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Buyer> buyers = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] personTokens = scanner.nextLine().split("\\s+");
            String name = personTokens[0];
            int age = Integer.parseInt(personTokens[1]);
            Buyer buyer; // правя си инстанция
            if (personTokens.length == 4) {
                //"{name} {age} {id} {birthdate}
                buyer = new Citizen(name, age, personTokens[2], personTokens[3]);
                                                // директно записвам в инстанцията
            } else {
                //"{name} {age}{group}"
                buyer = new Rebel(name, age, personTokens[2]);
            }

            buyers.put(name, buyer); // слагам и person and rebel
        }

        String nameFromConsole = scanner.nextLine();


        while ((!nameFromConsole.equals("End"))) {

            Buyer buyer = buyers.get(nameFromConsole);
            if (buyer != null) { // ако е валидно името
                buyer.buyFood();

            }

            nameFromConsole = scanner.nextLine();
        }
        int totalFood = buyers.values().stream().mapToInt(Buyer::getFood).sum();
        System.out.println(totalFood);

    }
}
