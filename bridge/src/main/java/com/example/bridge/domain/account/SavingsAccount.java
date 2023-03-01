package com.example.bridge.domain.account;

import com.example.bridge.domain.card.CreditCard;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(CreditCard creditCard) {
        super(creditCard);
    }

    @Override
    String getCardInformation() {
        return "Savings Account Credit Card Offer\n" +
                "Interest Rate: " + creditCard.getInterestRatePercentage() + "%. \n" +
                "Service Tax (Annual): " + creditCard.getServiceTaxPercentage() + "%. \n" +
                "Has Cashback? " + creditCard.hasCashback() + "\n" +
                "Has Insurance? " + creditCard.hasInsurance() + "\n" +
                "Has Air Miles? " + creditCard.hasAirMiles();
    }

}
