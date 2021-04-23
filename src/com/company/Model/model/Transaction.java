package com.company.Model.model;

public class Transaction {
    public String date;            //On which date transaction is done...
    public int transactiontype;    ///type of transaction..
    public float Amount;             ///Amount of transaction...
    public float income;
    public float expenses;
    String reason;

    public Transaction() {
    }


    public Transaction(String date, int transactiontype,int amount,String reason) {
        this.date = date;
        this.transactiontype = transactiontype;
        this.reason = reason;
        this.Amount = amount;
        this.income = income;
        this.expenses = expenses;
    }


    public Transaction(String newdate, float income, float expenses) {
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", transactiontype=" + transactiontype +
                ", Amount=" + Amount +
              //  ", income=" + income +
                //", expenses=" + expenses +
                ", reason='" + reason + '\'' +
                '}';
    }
}






