package com.application.employeesalary;

public class InvestmentsDetails {
    private RealEstate realEstate;
    private double bankInvestment;

    public RealEstate getRealEstate () {
        return realEstate;
    }

    public void setRealEstate (RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public double getBankInvestment () {
        return bankInvestment;
    }

    public void setBankInvestment (double bankInvestment) {
        this.bankInvestment = bankInvestment;
    }

    @Override
    public String toString () {
        return "InvestmentsDetails{" +
                "realEstate=" + realEstate +
                ", bankInvestment=" + bankInvestment +
                '}';
    }
}
