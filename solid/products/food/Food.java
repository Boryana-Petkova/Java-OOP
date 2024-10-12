package solid.products.food;

import solid.products.Product;

public abstract class Food implements Product {
    private double grams;
    private double caloriesPer100;

    public Food(double grams, double caloriesPer100) {
        this.grams = grams;
        this.caloriesPer100 = caloriesPer100;
    }

    @Override
    public double getCalories() {
        return caloriesPer100 / 100 * grams;
    }
    @Override
    public double getKilograms(){
        return grams / 1000;
    }
}
