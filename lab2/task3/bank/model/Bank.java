package lab2.task3.bank.model;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts = new Vector<>();

    public void addAccount(Account acc){
        accounts.add(acc);
    }
    
    public void closeAccount(int accNumber) {
        accounts.removeIf(acc -> acc.getAccountNumber() == accNumber);
    }
    public void update(){
        for(Account acc : accounts){
            if(acc instanceof SavingAccount){
                ((SavingAccount) acc).addInterest();
            }
            else if(acc instanceof CheckingAccount){
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAccounts(){
        for(Account acc : accounts){
            acc.print();
        }
    }
}