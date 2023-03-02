package com.example.bridge;

import com.example.bridge.domain.account.BankAccount;
import com.example.bridge.domain.account.CheckingAccount;
import com.example.bridge.domain.account.SavingsAccount;
import com.example.bridge.domain.card.BasicCreditCard;
import com.example.bridge.domain.card.GoldCreditCard;
import com.example.bridge.domain.card.SilverCreditCard;

public class BridgeApplication {
    public static void main(String[] args) {

        BankAccount basicSavingsAccount = new SavingsAccount(new BasicCreditCard());
        BankAccount silverCheckingAccount = new CheckingAccount(new SilverCreditCard());
        BankAccount goldCheckingAccount = new CheckingAccount(new GoldCreditCard());


        System.out.println("Let's check the credit card offer of the following account types:\n" +
                "======================================================================\n"+
                 basicSavingsAccount.getCreditCardInformation()+"\n"+
                "======================================================================\n"+
                 silverCheckingAccount.getCreditCardInformation()+"\n"+
                "======================================================================\n"+
                goldCheckingAccount.getCreditCardInformation());
    }
}