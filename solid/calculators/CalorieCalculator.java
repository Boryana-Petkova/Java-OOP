package solid.calculators;

import solid.products.Product;

import java.util.List;

public class CalorieCalculator implements Calculator{

    public double total(List<Product> products) { // тук сменяме List Object с List Product
                            // после пишем тотал, което идва от основния калкулатор
        return products.stream().mapToDouble(Product::getCalories).sum();
    }
    public double average(List<Product> products) { // тук също
        return total(products) / products.size();
    }
}
