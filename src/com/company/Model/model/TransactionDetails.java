

package com.company.Model.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class TransactionDetails {
    Scanner sc = new Scanner(System.in);
    HashMap<String, ArrayList<Transaction>> transactions = new HashMap<>();
    String date;
    int type;
    int amount;
    String reason;


    //Method to add a transaction
    public void add() {
        System.out.println("Enter the date(yyyy-MM-DD)");
        String date = sc.next();

        System.out.println("Type of transaction :  '\n  Choose 1 for 'Income' or '\n Choose  2 for 'Expenses'");
        int type = sc.nextInt();

        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        System.out.println("Enter the reason for the transaction");
        String reason = sc.next();

        Transaction transaction1 = new Transaction(date, type, amount, reason);

        //TransactionDetails transactions = new TransactionDetails();

        LocalDate localDate = LocalDate.parse(transaction1.date, DateTimeFormatter.ISO_DATE);
        String key = localDate.getMonth().toString() + " " + localDate.getYear();


        /// If we have already done the transaction..
        if (transactions.containsKey(key)) {
            transactions.get(key).add(transaction1);
        }
        //// If transaction is done first time...
        else {
            ArrayList<Transaction> trans = new ArrayList<>();
            trans.add(transaction1);
            transactions.put(key, trans);
        }
        System.out.println("Transaction Added!!!");
    }
        // Method to delete transaction..
    public void delete() {
        System.out.println("Enter the date(yyyy-MM-DD)");
        String date = sc.next();

        System.out.println("Type of transaction :  '\n  Choose 1 for 'Income' or '\n Choose  2 for 'Expenses'");
        int type = sc.nextInt();

        System.out.println("Enter the amount");
        int amount = sc.nextInt();

        System.out.println("Enter the reason for the transaction");
        String reason = sc.next();


        Transaction transaction2 = new Transaction(date, type, amount, reason);


        LocalDate localDate = LocalDate.parse(transaction2.date, DateTimeFormatter.ISO_DATE);
        String key = localDate.getMonth().toString() + " " + localDate.getYear();

        if (transactions.containsKey(key)) {
            if (transactions.get(key).contains(transaction2)) {
                transactions.remove(key, transaction2);
            } else {
                System.out.println("this is not present");
            }
            System.out.println(" Transaction  deleted!!!!!");
        }
    }

    /// Method to edit transaction...
    public void edit() {

        System.out.println("Enter the date(yyyy-MM-DD)");
        date = sc.next();

        System.out.println("Type of transaction :  '\n  Choose 1 for 'Income' or '\n Choose  2 for 'Expenses'");
        type = sc.nextInt();

        System.out.println("Enter the amount");
        amount = sc.nextInt();

        System.out.println("Enter the reason for the transaction");
        reason = sc.next();


        Transaction transaction3 = new Transaction(date, type, amount, reason);


        LocalDate localDate = LocalDate.parse(transaction3.date, DateTimeFormatter.ISO_DATE);
        String key = localDate.getMonth().toString() + " " + localDate.getYear();
        if (transactions.containsKey(key)) {
//            if (transactions.get(key).contains(transaction3)){
//                System.out.println("Enter the new income after edit");
//                float income = sc.nextFloat();
//                System.out.println("Enter the new expenses after edit");
//                float expenses = sc.nextFloat();
//                System.out.println("Enter the new date");
//                String newdate = sc.next();

            // Transaction   newtransaction = new Transaction(newdate ,income,expenses);
            /// find index which we want to edit...
            int index = transactions.get(key).indexOf(transaction3);

            /// replace the old transaction with new one...
            transactions.get(key).set(index, transaction3);
            System.out.println("Enter the date(yyyy-MM-DD)");
            date = sc.next();

            System.out.println("Type of transaction :  '\n  Choose 1 for 'Income' or '\n Choose  2 for 'Expenses'");
            type = sc.nextInt();

            System.out.println("Enter the amount");
            amount = sc.nextInt();

            System.out.println("Enter the reason for the transaction");
            reason = sc.next();

            Transaction transaction4 = new Transaction(date, type, amount, reason);

        } else {
            System.out.println("Transation not found");
        }


        //else {
        //System.out.println("Transaction not found");
    }


      //// Transaction by month
    public void showTransactionByMonth() {
        System.out.println("\n");
        for (String key1 : transactions.keySet()) {
            System.out.println(key1);

            float result = 0;
            for (int i = 0; i < transactions.get(key1).size(); i++) {
                result = result + transactions.get(key1).get(i).Amount;
            }

            System.out.println("Total transaction of this month is - " + result);
        }
    }

    ///  Show all transaction...
        public void showAllTrans(){
            for (int i=0;i<transactions.size();i++){
                System.out.println((i+1) + ". " +transactions.get(i));
            }
        }
    }





