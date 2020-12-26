package bai1;

public class Customer extends Person {
    private int balance;

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "balance=" + balance +
                '}';
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }
}
