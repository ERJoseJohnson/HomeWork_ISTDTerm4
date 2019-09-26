package com.example.lib2;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0.0;
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annumInterest) {
        this.annualInterestRate = annumInterest;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }

    public double getMonthlyInterest(){
        double monthInterestRate=getMonthlyInterestRate();
        return balance*monthInterestRate;
    }

    public void withdraw(int amount){
        this.balance-=amount;
    }

    public void deposit (int amount){
        this.balance+=amount;
    }
}
