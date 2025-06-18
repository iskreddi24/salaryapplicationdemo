package com.application.employeesalary;

public class RealEstate {
    private int noOfPlots;

    public int getNoOfPlots () {
        return noOfPlots;
    }

    public void setNoOfPlots (int noOfPlots) {
        this.noOfPlots = noOfPlots;
    }

    @Override
    public String toString () {
        return "RealEstate{" +
                "noOfPlots=" + noOfPlots +
                '}';
    }
}
