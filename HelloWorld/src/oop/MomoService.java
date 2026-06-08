package oop;

public class MomoService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing VND " + amount + " via Momo");
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("Refund VND " + amount + " via Momo");
        return true;
    }

    @Override
    public String getProviderName(){
        return "Momo";
    }
}
