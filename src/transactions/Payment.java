package transactions;

public class Payment {
    private int numberOfOneDollarBills;
    private int numberOfQuarters;
    private int numberOfDimes;
    private int numberOfNickels;
    private int numberOfPennies;

    public Payment(int numberOfOneDollarBills, int numberOfQuarters, int numberOfDimes,
                   int numberOfNickels, int numberOfPennies) {
        this.numberOfOneDollarBills = numberOfOneDollarBills;
        this.numberOfQuarters = numberOfQuarters;
        this.numberOfDimes = numberOfDimes;
        this.numberOfNickels = numberOfNickels;
        this.numberOfPennies = numberOfPennies;
    }

    public double paymentValue() {
        return numberOfOneDollarBills + (numberOfQuarters * 0.25) +
                (numberOfDimes * 0.10) + (numberOfNickels * 0.05) +
                (numberOfPennies * 0.01);
    }

    public void displayInfo() {
        System.out.printf("Total Payment: $%.2f\n", paymentValue());
    }
}

