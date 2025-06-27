#include <iostream>
#include "paymentservice.cpp"
#include "creditcard.cpp"
#include "debitcard.cpp"
#include "upi.cpp"
#include "wallet.cpp"

int main() {
    PaymentService ps;
    ps.addPaymentMethod("PrathameshDebitCard", new DebitCard("1234", "Prathamesh Narang"));
    ps.addPaymentMethod("PrathameshCreditCard", new CreditCard("5678", "Prathamesh Narang"));
    ps.addPaymentMethod("PrathameshUPI", new UPI("Prathamesh27"));
    ps.addPaymentMethod("PrathameshWallet", new Wallet());

    ps.makePayment("PrathameshUPI");
    ps.makePayment("PrathameshDebitCard");
    ps.makePayment("PrathameshWallet");

    return 0;
}