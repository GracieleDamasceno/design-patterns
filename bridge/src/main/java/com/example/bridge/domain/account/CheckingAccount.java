package com.example.bridge.domain.account;

import com.example.bridge.domain.card.CreditCard;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(CreditCard creditCard) {
        super(creditCard);
    }

    @Override
    public String getCreditCardInformation() {
        return creditCard.getCreditCardType()+" Credit Card Offer for Checking Account:\n" +
                "Interest Rate: " + creditCard.getInterestRatePercentage() + "%. \n" +
                "Service Tax (Annual): " + creditCard.getServiceTaxPercentage() + "%. \n" +
                "Provides Cashback? " + creditCard.hasCashback() + "\n" +
                "Provides Insurance? " + creditCard.hasInsurance() + "\n" +
                "Provides Air Miles? " + creditCard.hasAirMiles();
    }

}
