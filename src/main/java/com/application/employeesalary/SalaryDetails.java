package com.application.employeesalary;

public class SalaryDetails {

    private double salary;
    private double bonusSalary;
    private double pfDeduction;
    private double incomeTax;
    private double professionalTax;

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public double getBonusSalary () {
        return bonusSalary;
    }

    public void setBonusSalary (double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getPfDeduction () {
        return pfDeduction;
    }

    public void setPfDeduction (double pfDeduction) {
        this.pfDeduction = pfDeduction;
    }

    public double getIncomeTax () {
        return incomeTax;
    }

    public void setIncomeTax (double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public double getProfessionalTax () {
        return professionalTax;
    }

    public void setProfessionalTax (double professionalTax) {
        this.professionalTax = professionalTax;
    }

    @Override
    public String toString () {
        return "SalaryDetails{" +
                "salary=" + salary +
                ", bonusSalary=" + bonusSalary +
                ", pfDeduction=" + pfDeduction +
                ", incomeTax=" + incomeTax +
                ", professionalTax=" + professionalTax +
                '}';
    }

}
