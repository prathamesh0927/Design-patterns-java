package org.Prathamesh.Basics.OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("PrathameshDebitCard",new DebitCard("1234","Prathamesh Narang"));
        ps.addPaymentMethod("PrathameshCreditCard",new CreditCard("5678","Prathamesh Narang"));
        ps.addPaymentMethod("PrathameshUPI",new UPI("Prathamesh27"));
        ps.addPaymentMethod("PrathameshWallet",new Wallet());
        ps.makePayment("PrathameshUPI");
        ps.makePayment("PrathameshDebitCard");
        ps.makePayment("PrathameshWallet");

    }
}
