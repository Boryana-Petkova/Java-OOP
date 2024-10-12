package solid.products.drink;

import solid.products.Product;

public abstract class Drink implements Product { //правим нов абстрактен клас
    private double milliliters; // поставяме тези стойности
    private double caloriesPer100; // правим тази променлива
    private double density; // и тази

    public Drink(double milliliters) { // и този метод
        this.milliliters = milliliters;
    }

    public Drink(double milliliters, double caloriesPer100, double density) {
        this.milliliters = milliliters;
        this.caloriesPer100 = caloriesPer100;
        this.density = density;
    }

    public double getCalories() {
        double grams = milliliters * density;
        return caloriesPer100 / 100 * grams;
    }

    public double getLitters() {
        return milliliters * 1000;
    }
    @Override
    public double getKilograms(){
        return getLitters() * density;
    }
}
