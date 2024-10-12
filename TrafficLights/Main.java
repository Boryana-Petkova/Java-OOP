package TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Color [] colors = Arrays.stream(scanner.nextLine().split(" "))
                .map(Color::valueOf).toArray(Color[]::new);
        // правим масив и му казваме да превръща елементите в тези от клас Color и да взима тях
        int n = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> lightList = new ArrayList<>();
        // лист за всеки светофар, който ще създадем

        for (Color color: colors ) {
        TrafficLight light = new TrafficLight(color);
        lightList.add(light); // обхождаме класа Color и взимаме всеки цвят и го слагаме в листа
        }

        for (int i = 1; i <= n ; i++) {
            for (TrafficLight light: lightList   ) { // от новия лист взимаме светофар
                                                        // и му сменяме цвета
                light.changeColor();
                System.out.print(light.getColor() + " "); // принтираме
            }
            System.out.println();
        }
    }
}
