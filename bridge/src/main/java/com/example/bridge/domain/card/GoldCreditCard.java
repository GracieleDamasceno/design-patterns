package com.example.bridge.domain.card;

public class GoldCreditCard implements CreditCard {
    @Override
    public double getInterestRatePercentage() {
        return 14.42;
    }

    @Override
    public double getServiceTaxPercentage() {
        return 8.99;
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
        return true;
    }

}
