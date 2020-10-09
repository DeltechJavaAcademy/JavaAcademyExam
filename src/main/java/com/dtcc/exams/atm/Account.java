package com.dtcc.exams.atm;

public class Account {

    double balance;
    boolean accountClosed;

    public Account(){
        this(0.0);
    }

    public Account(double v) {
        this.balance = v;
        if(v != 0.0){
            this.accountClosed = false;
        }else{
            this.accountClosed = true;
        }
    }

    public double balance() {
        return balance;
    }

    public boolean closeAccount() {
        if(this.balance() == 0){
            this.accountClosed = true;
        }
        return this.accountClosed;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public Double withdraw(double v) {
        if(this.balance >= v) {
            this.balance -= v;
        }
        return this.balance;
    }

    public void transfer(Account b, double v) {
        if(this.balance() >= v){
            this.withdraw(v);
            b.deposit(v);
        }
    }
}
