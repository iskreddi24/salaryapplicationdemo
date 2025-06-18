package com.application.employeesalary;

public class LoanDetails {
    private double carLoan;
    private double houseLoan;

    public double getCarLoan () {
        return carLoan;
    }

    public void setCarLoan (double carLoan) {
        this.carLoan = carLoan;
    }

    public double getHouseLoan () {
        return houseLoan;
    }

    public void setHouseLoan (double houseLoan) {
        this.houseLoan = houseLoan;
    }

    @Override
    public String toString () {
        return "LoanDetails{" +
                "carLoan=" + carLoan +
                ", houseLoan=" + houseLoan +
                '}';
    }
}
