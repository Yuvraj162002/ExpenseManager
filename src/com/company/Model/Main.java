package com.company.Model;

import com.company.Model.model.Transaction;
import com.company.Model.model.TransactionDetails;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date;
        int income;
        int expenses;


        TransactionDetails transactions11 = new TransactionDetails();


        String menu = "\nChoose from the following: "
                + "\n Add: Add New Transaction"
                + "\n Delete: Delete a Transaction"
                + "\n Edit: Edit a Transaction"
                +"\n SAT:Show all transaction"
                +"\n MT: month transaction"
                + "\n Exit : Exit from Transaction";

        while (true){
            System.out.println(menu);
             String choice  = sc.next();
            switch (choice){
                case "Add":
                    System.out.println(" Adding the Transaction");

                    transactions11.add();
                    break;

                case "Delete":
                    System.out.println("Deleting the transaction ");

                    transactions11.delete();
                    break;

                case "Edit":
                    System.out.println("Edit the transaction");
                    transactions11.edit();
                          break;
                case "SAT":
                    System.out.println("Show  transaction by month");
                    transactions11.showTransactionByMonth();
                    break;

                case "MT":
                    System.out.println("show month Summary ");
                    transactions11.showAllTrans();

                  case "Exit":
                    System.out.println(" Thankyou for using this!!!!");
                    break;


                default:
                    System.out.println("Incorrect choice..");




            }

        }


    }




}
