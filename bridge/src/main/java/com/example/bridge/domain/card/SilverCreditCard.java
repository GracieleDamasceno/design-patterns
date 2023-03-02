package com.example.bridge.domain.card;

public class SilverCreditCard implements CreditCard {
    @Override
    public double getInterestRatePercentage() {
        return 15.12;
    }

    @Override
    public String getCreditCardType() {
        return "SILVER";
    }

    @Override
    public double getServiceTaxPercentage() {
        return 9.99;
    }

    @Override
    public boolean hasCashback() {
        return true;
    }

    @Override
    public boolean hasInsurance() {
        return true;
    }

    @Override
    public boolean hasAirMiles() {
        return false;
    }

}
