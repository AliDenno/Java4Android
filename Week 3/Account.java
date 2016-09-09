package com.example.accountapp.logic;

public class Account {
    String name;
    int number;
    double balance;

    LogicInterface mLogic;

    public Account(LogicInterface logic){
        mLogic = logic;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdrawal(double amount){
        if (balance > amount){
            balance = balance - amount;
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }

    public void displayBalance(){
        mLogic.println("The balance on account " + number + " is " + balance);
    }

    public boolean withdrawal2(double amount){
        if (balance > amount){
            balance = balance - amount;
            return(true);
        }
        else {
            return(false);
        }
    }

    public String toString(){
        return("Account: " + number + "\tName: " + name + "\tBalance: " + balance);
    }

    public boolean equals(Object other){
        if (other instanceof Account){
            Account otherAccount = (Account)other;
            return(this.number == otherAccount.number && this.balance == otherAccount.balance);
        }
        else return(false);
    }

}
