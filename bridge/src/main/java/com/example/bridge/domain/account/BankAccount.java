package com.example.bridge.domain.account;


import com.example.bridge.domain.card.CreditCard;

public abstract class BankAccount {
    protected CreditCard creditCard;

    public BankAccount(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public abstract String getCreditCardInformation();
}
