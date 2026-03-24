package lab2.task3.bank.app;

import lab2.task3.bank.model.*;

public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();

        Account a1 = new Account(1);
        SavingAccount a2 = new SavingAccount(2,5);
        CheckingAccount a3 = new CheckingAccount(3);

        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);

        a1.deposit(1000);
        a2.deposit(2000);
        
        a3.deposit(1500);
        a3.transfer(200, a2);
        a3.withdraw(200);

        bank.update();

        bank.printAccounts();
        System.out.print("\n");
        bank.closeAccount(1);
        bank.printAccounts();
    }
}