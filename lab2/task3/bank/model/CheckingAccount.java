package lab2.task3.bank.model;

public class CheckingAccount extends Account {

    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double FEE = 0.02;

    public CheckingAccount(int accNumber){
        super(accNumber);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum){
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee(){
        if(transactionCount > FREE_TRANSACTIONS){
            double fee = (transactionCount - FREE_TRANSACTIONS) * FEE;
            super.withdraw(fee);
        }
    }

    @Override
    public String toString(){
        return "CheckingAccount: " + super.toString() +
               " Transactions: " + transactionCount;
    }
}