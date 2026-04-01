package org.kariioke.abstraction1;

public class CreditCard extends Payment{
    CreditCard(double amount) {
        super(amount);
    }

    @Override
    void makePayment() {
        System.out.println("Charging credit card...");
    }
}
