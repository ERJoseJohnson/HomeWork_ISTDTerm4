package com.example.lib2;

public class CheckingAccount extends Account {

    CheckingAccount(int id, double balance){
        super(id, balance);
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        if (this.getBalance()<-5000){
            System.out.println("over limit");
            this.setBalance(-5000);
        }
    }
}
