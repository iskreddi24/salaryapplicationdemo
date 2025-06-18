package com.application.employeesalary;

public class IndividualHealthInsurance {
    private int licTermInsurance;

    public int getLicTermInsurance () {
        return licTermInsurance;
    }

    public void setLicTermInsurance (int licTermInsurance) {
        this.licTermInsurance = licTermInsurance;
    }

    @Override
    public String toString () {
        return "IndividualHealthInsurance{" +
                "licTermInsurance=" + licTermInsurance +
                '}';
    }
}
