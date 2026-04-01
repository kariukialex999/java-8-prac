package org.kariioke.abstraction1;

public class Main {
    static void main () {
        CreditCard creditCard = new CreditCard(22.50);
        Paypal paypal = new Paypal(25.20);

        creditCard.showDetails();
        creditCard.makePayment();
        System.out.println(" ");
        paypal.showDetails();
        paypal.makePayment();
    }
}
