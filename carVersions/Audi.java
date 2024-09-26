package carVersions;

public class Audi extends CarImp implements Rentable{
    private Integer minRentDay;
    private double pricePerDay;

    public Audi(String model, String color, int horsePower, String countryProduced, Integer minRentDay, double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
    }
}
