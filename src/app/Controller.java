package app;

import food.Apple;
import food.Sandwich;
import transactions.Payment;
import machine.Register;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();

        // Apple Transaction
        System.out.println("=== Apple Purchase ===");
        System.out.print("Enter apple type (e.g., Granny Smith): ");
        String appleType = scanner.nextLine();
        System.out.print("Enter price per unit weight (e.g., 1.5): ");
        double applePricePerUnit = scanner.nextDouble();
        System.out.print("Enter weight in grams (e.g., 150): ");
        double appleWeight = scanner.nextDouble();
        Apple apple = new Apple(appleType, applePricePerUnit, appleWeight);
        apple.displayInfo();

        System.out.println("Enter payment details for the apple:");
        System.out.print("Enter number of one-dollar bills: ");
        int appleDollarBills = scanner.nextInt();
        System.out.print("Enter number of quarters: ");
        int appleQuarters = scanner.nextInt();
        System.out.print("Enter number of dimes: ");
        int appleDimes = scanner.nextInt();
        System.out.print("Enter number of nickels: ");
        int appleNickels = scanner.nextInt();
        System.out.print("Enter number of pennies: ");
        int applePennies = scanner.nextInt();

        Payment applePayment = new Payment(appleDollarBills, appleQuarters,
                appleDimes, appleNickels, applePennies);
        applePayment.displayInfo();
        register.buyApple(apple, applePayment);

        scanner.nextLine(); // consume newline

        // Sandwich Transaction
        System.out.println("\n=== Sandwich Purchase ===");
        System.out.print("Enter type of bread (e.g., White, Whole Grain): ");
        String bread = scanner.nextLine();
        System.out.print("Include meat? (true/false): ");
        boolean meat = scanner.nextBoolean();
        System.out.print("Include cheese? (true/false): ");
        boolean cheese = scanner.nextBoolean();
        System.out.print("Include veggies? (true/false): ");
        boolean veggies = scanner.nextBoolean();
        Sandwich sandwich = new Sandwich(bread, meat, cheese, veggies);
        sandwich.displayInfo();

        System.out.println("Enter payment details for the sandwich:");
        System.out.print("Enter number of one-dollar bills: ");
        int sandwichDollarBills = scanner.nextInt();
        System.out.print("Enter number of quarters: ");
        int sandwichQuarters = scanner.nextInt();
        System.out.print("Enter number of dimes: ");
        int sandwichDimes = scanner.nextInt();
        System.out.print("Enter number of nickels: ");
        int sandwichNickels = scanner.nextInt();
        System.out.print("Enter number of pennies: ");
        int sandwichPennies = scanner.nextInt();

        Payment sandwichPayment = new Payment(sandwichDollarBills, sandwichQuarters,
                sandwichDimes, sandwichNickels, sandwichPennies);
        sandwichPayment.displayInfo();
        register.buySandwich(sandwich, sandwichPayment);

        scanner.close();
    }
}
