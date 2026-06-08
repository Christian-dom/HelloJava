package oop;

public class PaymentApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Christian", "christian@gmail.com", 100000);
        customer.displayInfo();

        PaymentService vnpay = new VNPayService();
        vnpay.getProviderName();
        customer.pay(vnpay, 50000);

        PaymentService momo = new MomoService();
        momo.getProviderName();
        customer.pay(momo, 10000);

        customer.pay(vnpay, 999999999);
    }
}
