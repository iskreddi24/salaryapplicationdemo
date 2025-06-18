package com.application.employeesalary;

public class FamilyInsurance {
    private double iciciLomabadInsurance;

    public double getIciciLomabadInsurance () {
        return iciciLomabadInsurance;
    }

    public void setIciciLomabadInsurance (double iciciLomabadInsurance) {
        this.iciciLomabadInsurance = iciciLomabadInsurance;
    }

    @Override
    public String toString () {
        return "FamilyInsurance{" +
                "iciciLomabadInsurance=" + iciciLomabadInsurance +
                '}';
    }
}
