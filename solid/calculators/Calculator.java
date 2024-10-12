package solid.calculators;

import solid.products.Product;

import java.util.List;

public interface Calculator { // правим калкулатор, който да обслужва другите калкулатори
    double total(List<Product> products);
    double average(List<Product> products);
}
