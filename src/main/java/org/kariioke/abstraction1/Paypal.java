package org.kariioke.abstraction1;

public class Paypal extends Payment{
    Paypal(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Redirecting to Paypal...");
    }
}
