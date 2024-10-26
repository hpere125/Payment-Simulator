package food;

public class Sandwich {
    private String bread;
    private boolean meat;
    private boolean cheese;
    private boolean veggies;
    private double price;

    public Sandwich(String bread, boolean meat, boolean cheese, boolean veggies) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        calculatePrice();
    }

    private void calculatePrice() {
        price = 0;

        if (meat) {
            price += 3.00;
        }
        if (cheese) {
            price += 2.00;
        }
        if (veggies) {
            price += 1.00;
        }
    }


    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.printf("Bread: %s\nMeat: %b\nCheese: %b\nVeggies: %b\nPrice: $%.2f\n",
                bread, meat, cheese, veggies, price);
    }
}
