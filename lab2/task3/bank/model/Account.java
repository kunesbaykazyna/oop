package lab2.task3.bank.model;

public class Account {

    private double balance;
    private int accNumber;

    public Account(int accNumber){
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum){
        balance += sum;
    }

    public void withdraw(double sum){
        balance -= sum;
    }

    public double getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accNumber;
    }

    public void transfer(double amount, Account other){
        withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public String toString(){
        return "Account id: " + accNumber + " Balance: " + balance;
    }

    public final void print(){
        System.out.println(toString());
    }
}