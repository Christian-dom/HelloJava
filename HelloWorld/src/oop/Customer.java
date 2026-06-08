package oop;

public class Customer extends User{
    private double balance;

    public Customer(String name, String email, double balance) {
        super(name, email);
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    public void pay(PaymentService service, double amount) {
        if (this.balance >= amount) {
            service.processPayment(amount);
            this.balance -= amount;
            System.out.println("Remaining balance: " + this.balance);
        }
        else {
            System.out.println("Insufficient balance. Current balance: " + this.balance);
        }
    }
}
