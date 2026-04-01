package org.kariioke.abstraction1;

public abstract class Payment {
    private double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void showDetails() {
        System.out.println("Processing payment of: $" + amount);
    }

    abstract void makePayment();

    public double getAmount() {
        return amount;
    }
}
