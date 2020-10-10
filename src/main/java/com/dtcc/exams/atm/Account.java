package com.dtcc.exams.atm;

public class Account {

    double balance;
    boolean accountClosed;

    public Account(double v) {
        balance = v;
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        if(balance == 0.0){
            return true;
        }
        return false;
    }

    public void deposit(double v) {
        balance =+ v;
    }

    public Double withdraw(double v) {
        return balance - v;
    }

    public void transfer(Account b, double v) {
        b.balance = v;
        this.balance =- v;
    }

//    public void setBalance(double balance){
//        this.balance=balance;
//    }
//    public double getBalance(){
//        return balance;
//    }
}

