package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        SavingsAccount acc1 = new SavingsAccount(5000);
        acc1.getBalance();
        acc1.deposit(10000);
        acc1.getBalance();
        acc1.withdraw(20000);
        acc1.withdraw(5000);
        acc1.getBalance();

    }
}