package oop;

public interface PaymentService {
    void processPayment(double amount);
    boolean refund(double amount);
    String getProviderName();
}
