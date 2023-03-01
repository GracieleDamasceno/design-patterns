package com.example.bridge.domain.card;

public interface CreditCard {
    double getInterestRatePercentage();
    double getServiceTaxPercentage();
    boolean hasCashback();
    boolean hasInsurance();
    boolean hasAirMiles();

}

