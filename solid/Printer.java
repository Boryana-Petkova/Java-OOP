package solid;

import solid.calculators.Calculator;
import solid.calculators.CalorieCalculator;
import solid.products.Product;

import java.util.List;

public class Printer {

    private static final String SUM = "Sum: %f";
    private static final String AVERAGE = "Average: %f";

    private Calculator calculator; // извикваме калкулатор
    public Printer(Calculator calculator) { // поставяме и конструктора му
        this.calculator = calculator;
    }
    public void printSum(List<Product> products) {
        System.out.printf((SUM) + "%n", calculator.total(products));
        //прибавяме калкулатор и точка преди sum, за да не е в червено
    }
    public void printAverage(List<Product> products) {
        System.out.printf((AVERAGE) + "%n", calculator.average(products)); //тук по същия начин
    }
}
