package oop;

public class VNPayService implements PaymentService{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing VND " + amount + " via VNPay");
    }

    @Override
    public boolean refund(double amount){
        System.out.println("Refund VND " + amount + " via VNPay");
        return true;
    }

    @Override
    public String getProviderName(){
        return "VNPay";
    }
}
