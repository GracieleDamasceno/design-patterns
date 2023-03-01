package com.example.bridge.domain.card;

public class BasicCreditCard implements CreditCard {
    @Override
    public double getInterestRatePercentage() {
        return 16.91;
    }

    @Override
    public double getServiceTaxPercentage() {
        return 10.99;
    }

    @Override
    public boolean hasCashback() {
        return false;
    }

    @Override
    public boolean hasInsurance() {
        return false;
    }

    @Override
    public boolean hasAirMiles() {
        return false;
    }

}
