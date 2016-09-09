package com.example.accountapp.logic;

import android.util.Log;

import com.example.accountapp.ui.OutputInterface;

/**
 *
 */
public class Logic implements LogicInterface{

    static final String TAG = Logic.class.getName();

    OutputInterface out;

    public Logic(OutputInterface _out){
        out = _out;
    }

    @Override
    public void process() {


        Account acct1 = new Account(this);
        Account acct2 = new Account(this);

        acct1.name = "Bill";
        acct1.number = 738924;
        acct1.balance = 231.48;

        acct2.name = "Sue";
        acct2.number = 894730;
        acct2.balance = 0;

        acct1.displayBalance();
        acct1.deposit(89.00);
        acct1.displayBalance();

        acct2.displayBalance();
        acct2.withdrawal(300);

        println("" + acct1);

    }

    @Override
    public void println(String line) {
        out.println(line);
    }


}
