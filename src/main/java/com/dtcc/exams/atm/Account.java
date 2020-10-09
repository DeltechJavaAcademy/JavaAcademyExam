package com.dtcc.exams.atm;

public class Account {
    private double bal;

    
    public Account(double v) {
        this.bal = v;

    }

    public double balance() {
        return this.bal;
    }

    public boolean closeAccount() {
        if(this.bal == 0.0){
            return true;
        }
        return false;
    }

    public void deposit(double v) {
         this.bal += v;
    }

    public Double withdraw(double v) {
        if(this.bal == 0){
            return 0.0;
        }else{
        return this.bal -= v;
    }}

    public void transfer(Account b, double v) {
        this.bal -= v;
        b.bal += v;
    }
}
