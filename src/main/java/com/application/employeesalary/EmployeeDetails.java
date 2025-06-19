package com.application.employeesalary;

public class EmployeeDetails {
    private String employeeName;
    private EmpDesignation empDesignation;
    private SalaryDetails salaryDetails;
    private LoanDetails loanDetails;
    private InsuranceDetails insuranceDetails;
    private InvestmentsDetails investmentsDetails;

    public String getEmployeeName () {
        return employeeName;
    }

    public void setEmployeeName (String employeeName) {
        this.employeeName = employeeName;
    }

    public EmpDesignation getEmpDesignation () {
        return empDesignation;
    }

    public void setEmpDesignation (EmpDesignation empDesignation) {
        this.empDesignation = empDesignation;
    }

    public SalaryDetails getSalaryDetails () {
        return salaryDetails;
    }

    public void setSalaryDetails (SalaryDetails salaryDetails) {
        this.salaryDetails = salaryDetails;
    }

    public LoanDetails getLoanDetails () {
        return loanDetails;
    }

    public void setLoanDetails (LoanDetails loanDetails) {
        this.loanDetails = loanDetails;
    }

    public InsuranceDetails getInsuranceDetails () {
        return insuranceDetails;
    }

    public void setInsuranceDetails (InsuranceDetails insuranceDetails) {
        this.insuranceDetails = insuranceDetails;
    }

    public InvestmentsDetails getInvestmentsDetails () {
        return investmentsDetails;
    }

    public void setInvestmentsDetails (InvestmentsDetails investmentsDetails) {
        this.investmentsDetails = investmentsDetails;
    }

    @Override
    public String toString () {
        return "EmployeeDetails{" +
                "employeeName='" + employeeName + '\'' +
                ", empDesignation=" + empDesignation +
                ", salaryDetails=" + salaryDetails +
                ", loanDetails=" + loanDetails +
                ", insuranceDetails=" + insuranceDetails +
                ", investmentsDetails=" + investmentsDetails +
                '}';
    }
}
