package Hotel;

public class PriceCalculator {
public static double calculateFinalPrice (double pricePerDay, int numberOfDays,
                                          Season season, DiscountType discountType){
    double price = pricePerDay * numberOfDays;
    price = price * season.getMultiplier();
    price = price - (price * discountType.getDiscount() / 100.0);
    return price;

    }
}
