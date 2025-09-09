package org.example;

import java.sql.SQLOutput;

public class SavingsAccount
{
    double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance-=amount;
            //balance-=1;
            System.out.println(amount + " rs have been withdrawn successfully");
        }
        else {
            System.out.println("Your account doesnt have sufficient balance");
        }
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Amount has been deposited successfully in your account");
    }
    public double getBalance()
    {

        System.out.println("Availabe balance " + balance);

        return balance;

    }
}
