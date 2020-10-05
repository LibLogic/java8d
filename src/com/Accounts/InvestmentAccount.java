package com.Accounts;

public class InvestmentAccount extends BankAccount implements Account {
    private int interestRate = 5;
    private int period = 0;
    private char periodType = 'Q'; //D = day, W = week, M = Month, Q = quarter, Y = Year
    private int widthdrawFee = 100;

    public InvestmentAccount (int balance, int accountNum, String owner, int interestRate) {
        super(balance, accountNum, owner, "Investment");
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        deposit((int)(balance + (balance * (interestRate / 100.0))));
    }

    @Override
    public void withdraw(int amt) {
        super.withdraw(amt + widthdrawFee);
    }
}

// PEMDAS
