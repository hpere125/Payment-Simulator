package machine;

import food.Apple;
import food.Sandwich;
import transactions.Payment;

public class Register {
    public void buyApple(Apple apple, Payment payment) {
        System.out.printf("Apple Price: $%.2f\n", apple.price());
        if (apple.price() <= payment.paymentValue()) {
            System.out.println("Transaction successful!");
            // Handle change and register update
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void buySandwich(Sandwich sandwich, Payment payment) {
        System.out.printf("Sandwich Price: $%.2f\n", sandwich.getPrice());
        if (sandwich.getPrice() <= payment.paymentValue()) {
            System.out.println("Transaction successful!");
            // Handle change and register update
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
