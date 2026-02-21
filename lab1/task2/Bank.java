package lab1.task2;

public class Bank {
    //public enum Currency { KZT, USD, EUR }  other file
    private final String bankName = "Bereke Bank";
//    private final Bank ins = new Bank("Bereke Bank");
    private static int totalClients = 0;
    private final String fullName;   
    private double balance;        
    private Currency currency;

    {
        totalClients++;
    }
    
    public Bank(String fullName, Currency currency) {
//        this("Unknown", 0.0, currency);
        this.fullName = fullName;   
    	this.currency = currency;
    }
    	

    public Bank(String fullName, double balance, Currency currency) {
    	this(fullName, currency);  
        this.balance = balance;       
//        this.currency = currency;
    }
   

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void applyInterest(double percent) {
        if (percent > 0) {
            this.balance += balance * percent / 100;
        }
    }
    double res;
    public double credit(double sum) {
    	res=+sum;
    	return res;
    }
    public double getRes() {
    	return res;
    }
    public  double credit(double sum,int month,double per) {
        double totalOverpayment = sum * (per / 100); 
        double sumWithPercent = sum + totalOverpayment;
        return sumWithPercent / month;
    }

    public String getBankName() {
        return bankName;
    }

    public static int getTotalClients() {
        return totalClients;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return this.balance;
    }

    public Currency getCurrency() {
        return currency;
    }
}











//есть ли разница между финальным модификатором 
// и только читабельными переменными 
//какую логику добавить чтобы был оверлодинг
//енум как работает
//второй кейс использование зис