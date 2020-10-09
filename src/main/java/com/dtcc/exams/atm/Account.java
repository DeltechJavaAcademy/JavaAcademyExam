package com.dtcc.exams.atm;

public class Account {
    double balance = 0.0;
    double amount = 100.0;
    public Account(double v) {
        double balance = v;
    }

    public double balance() {

        return balance;
    }

    public boolean closeAccount() {
        if(balance == 10.0){
            return true;
        }else
        return false;
    }

    public void deposit(double v) {
        balance += amount;
    }

    public Double withdraw(double v) {

        if (amount > balance) {
            return null;
        }else
            return balance -= amount;
    }

    public void transfer(Account b, double v) {
        balance += amount;
    }
}
