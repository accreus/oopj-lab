import java.util.*;

class BankAccount {
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public void openAccount(int accNo, String name, double initialBal) {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = initialBal;
        System.out.println("Account opened for " + name);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Rs." + amount + " deposited.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }
}

class SavingAccount extends BankAccount {
    public void calculateInterest(double rate) {
        double interest = balance * (rate / 100);
        System.out.println("Interest earned: Rs." + interest);
        deposit(interest);
    }
}

class FixedDepositAccount extends BankAccount {
    public void maturityAmount(int years, double rate) {
        // A simple interest formula for demonstration
        double maturity = balance + (balance * (rate / 100) * years);
        System.out.println("Estimated Maturity Amount after " + years + " years: Rs." + maturity);
    }
}

public class Pr4_1 {
    public static void main(String[] args) {
        System.out.println("Name: Jwalin Enr: 250413107015");

        System.out.println("--- Saving Account ---");
        SavingAccount sa = new SavingAccount();
        sa.openAccount(101, "Alice", 5000);
        sa.deposit(2000);
        sa.calculateInterest(4.0);
        sa.checkBalance();

        System.out.println("\n--- Fixed Deposit Account ---");
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(202, "Bob", 10000);
        fd.maturityAmount(5, 6.5);
    }
}
