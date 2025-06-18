package com.application.employeesalary;

public class InsuranceDetails {
    private FamilyInsurance familyInsurance;
    private IndividualHealthInsurance individualHealthInsurance;
    private int carinsurance;
    private int houseInsurance;

    public FamilyInsurance getFamilyInsurance () {
        return familyInsurance;
    }

    public void setFamilyInsurance (FamilyInsurance familyInsurance) {
        this.familyInsurance = familyInsurance;
    }

    public IndividualHealthInsurance getIndividualHealthInsurance () {
        return individualHealthInsurance;
    }

    public void setIndividualHealthInsurance (IndividualHealthInsurance individualHealthInsurance) {
        this.individualHealthInsurance = individualHealthInsurance;
    }

    public int getCarinsurance () {
        return carinsurance;
    }

    public void setCarinsurance (int carinsurance) {
        this.carinsurance = carinsurance;
    }

    public int getHouseInsurance () {
        return houseInsurance;
    }

    public void setHouseInsurance (int houseInsurance) {
        this.houseInsurance = houseInsurance;
    }

    @Override
    public String toString () {
        return "InsuranceDetails{" +
                "familyInsurance=" + familyInsurance +
                ", individualHealthInsurance=" + individualHealthInsurance +
                ", carinsurance=" + carinsurance +
                ", houseInsurance=" + houseInsurance +
                '}';
    }
}
