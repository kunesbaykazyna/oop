package lab1.task2;

import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {

        Bank account = new Bank("Kazyna", 0,Currency.KZT);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + account.getBankName());
        System.out.println("Enter deposit amount or Q to quit or C to get credit:");

        while (scanner.hasNext()) {

            String input = scanner.next();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }
            else if (input.equalsIgnoreCase("C")) {
                System.out.println("Enter credit amount:"); 
                if (scanner.hasNextDouble()) { 
                    double sum = scanner.nextDouble();
                    account.credit(sum); 
                    
                    System.out.println("Money added to credit card.");
                    System.out.println("Your monthly payment: " + account.credit(sum, 6,12.0));
                } else {
                    System.out.println("Error: Please enter a valid number for credit.");
                    scanner.next(); 
                }
            }
            else{
                double amount = Double.parseDouble(input);
                account.deposit(amount);
                System.out.println("Current balance: " + account.getBalance()); 
        }
        }
        account.applyInterest(5);
        
        System.out.println("Account Summary:    ");
        System.out.println("Client: " + account.getFullName());
        System.out.println("Currency: " + account.getCurrency());
        System.out.println("Balance credit card: "+account.getRes());
        System.out.println("Final Balance: " + account.getBalance());
        System.out.println("Total Bank Clients: " + Bank.getTotalClients());

        scanner.close();

    }
    }
