package com.dtcc.exams.atm;

public class Account {
    double balance;
    public Account(double v) {
        double balance = v;
    }

    public double balance() {

        return balance;
    }

    public boolean closeAccount() {
        if(balance <= 0.0){
            return true;
        }else
        return false;
    }

    public void deposit(double v) {
        balance += v;
    }

    public Double withdraw(double v) {
        if (balance >= v) {
            balance -= v;
        }
            return balance;
    }

    public void transfer(Account b, double v) {
        if(balance >= v){
            balance -= v;
            b.balance += v;
        }
    }
}
