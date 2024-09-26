package carVersions;

public class Seat extends CarImp implements Sellable{
    // екстендваме от друг клас, който държи полетата и методите,
    // и който пък води към интерфейс Кола, но интерфейсът не може да държи полета,
    // защото ще са final, а ние искаме да ги променяме за всяка кола
    private double price;


    public Seat(String model, String color, int horsePower, String countryProduced, double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
}
