package com.application.employeesalary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerExample {

    @GetMapping(path = "/get/mapping")
    public String getMapping(){
        EmployeeDetails employeeDetails=new EmployeeDetails();
        return "hello";
    }
//    @PostMapping(path = "/salary/employee")
//    public double postMapping(){
//
//    }
    @PostMapping(path = "/post/employee")
    public String postMapping(){

        return "";
    }
    @PostMapping(path = "/calculate/net-salary")
    public double calculateNetSalary(@RequestBody EmployeeDetails employeeDetails) {

        SalaryDetails salaryDetails = employeeDetails.getSalaryDetails();
        salaryDetails.setBonusSalary(30000);
        salaryDetails.setSalary(45000);
        salaryDetails.setIncomeTax(2000);
        salaryDetails.setPfDeduction(1500);
        salaryDetails.setProfessionalTax(2100);
        if (salaryDetails == null) {
            return 0.0;
        }

        double grossSalary = salaryDetails.getSalary() + salaryDetails.getBonusSalary();
        double totalDeductions = salaryDetails.getPfDeduction() +
                salaryDetails.getIncomeTax() +
                salaryDetails.getProfessionalTax();

        return grossSalary - totalDeductions;
    }
    @PostMapping(path = "/calculate/total-loan")
    public double calculateTotalLoan(@RequestBody EmployeeDetails employeeDetails) {

        LoanDetails loanDetails = employeeDetails.getLoanDetails();
        loanDetails.setCarLoan(50000);
        loanDetails.setHouseLoan(300000);
        if (loanDetails == null) {
            return 0.0;
        }

        return loanDetails.getCarLoan() + loanDetails.getHouseLoan();
    }
    @PostMapping(path = "/calculate/total-insurance")
    public double calculateTotalInsurance(@RequestBody EmployeeDetails employeeDetails) {

        InsuranceDetails insuranceDetails = employeeDetails.getInsuranceDetails();
        insuranceDetails.setHouseInsurance(30000);
        insuranceDetails.setCarinsurance(1500);
        if (insuranceDetails == null) {
            return 0.0;
        }

        return insuranceDetails.getCarinsurance() +
                insuranceDetails.getHouseInsurance();
    }
    
}
