package food;

public class Apple {
    private String type;
    private double weight;
    private double pricePerUnitWeight;

    public Apple(String type, double pricePerUnitWeight, double weightInGrams) {
        this.type = type;
        this.pricePerUnitWeight = pricePerUnitWeight;
        this.weight = 0.00220 * weightInGrams;
    }

    public double price() {
        return weight * pricePerUnitWeight;
    }

    public void displayInfo() {
        System.out.printf("Type: %s\nWeight: %.2f lbs\nPrice: $%.2f\n", type, weight, price());
    }
}
