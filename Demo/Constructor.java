package Demo;

import ShoppingSpree.Product;

import java.util.ArrayList;
import java.util.List;

public class Constructor {
    private String name;
    private double money;
    private List<Product> products;
    public Constructor(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();// !!!!!!!!!!!!!!!!!!!!!!!!
    }
    private void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    private void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
