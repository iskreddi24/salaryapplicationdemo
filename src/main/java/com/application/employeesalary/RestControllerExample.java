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
    @GetMapping(path="/employee/details")
    public EmployeeDetails getEmployeeDetails(){
        EmployeeDetails employeeDetails=new EmployeeDetails();
        employeeDetails.setEmployeeName("ravi kiran samrat");
        employeeDetails.setEmployeeName("vikram singh rathod");
        EmpDesignation empDesignation=new EmpDesignation();
        empDesignation.setFulltimeOrParttime("FULLTIME");
        EmpDesignationType empDesignationType=new EmpDesignationType();
        empDesignationType.setJobtype("SOFTWARE");
        empDesignation.setEmpDesignationType(empDesignationType);
        employeeDetails.setEmpDesignation(empDesignation);
        SalaryDetails salaryDetails=new SalaryDetails();
        salaryDetails.setProfessionalTax(3000);
        salaryDetails.setPfDeduction(1500);
        salaryDetails.setBonusSalary(60000);
        salaryDetails.setIncomeTax(2300);
        salaryDetails.setSalary(66000);
        employeeDetails.setSalaryDetails(salaryDetails);
        LoanDetails loanDetails=new LoanDetails();
        loanDetails.setHouseLoan(55000);
        loanDetails.setCarLoan(30000);
        employeeDetails.setLoanDetails(loanDetails);
        InvestmentsDetails investmentsDetails=new InvestmentsDetails();
        investmentsDetails.setBankInvestment(200000);
        RealEstate realEstate=new RealEstate();
        realEstate.setNoOfPlots(3);
        investmentsDetails.setRealEstate(realEstate);
        employeeDetails.setInvestmentsDetails(investmentsDetails);
        InsuranceDetails insuranceDetails=new InsuranceDetails();
        insuranceDetails.setCarinsurance(2000);
        FamilyInsurance familyInsurance=new FamilyInsurance();
        familyInsurance.setIciciLomabadInsurance(24000);
        IndividualHealthInsurance individualHealthInsurance=new IndividualHealthInsurance();
        individualHealthInsurance.setLicTermInsurance(20000);
        insuranceDetails.setHouseInsurance(20000);
        insuranceDetails.setIndividualHealthInsurance(individualHealthInsurance);
        insuranceDetails.setFamilyInsurance(familyInsurance);
        employeeDetails.setInsuranceDetails(insuranceDetails);
        return employeeDetails;

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
    @GetMapping(path = "/get/insurancedetails")
    public InsuranceDetails getTotalInsurance(){
        EmployeeDetails employeeDetails=new EmployeeDetails();
        InsuranceDetails insuranceDetails=new InsuranceDetails();
        employeeDetails.setInsuranceDetails(insuranceDetails);
        insuranceDetails.setHouseInsurance(50000);
        insuranceDetails.setCarinsurance(15000);
        return insuranceDetails;
    }
    @PostMapping(path = "/calculate/total-insurance")
    public double calculateTotalInsurance(@RequestBody EmployeeDetails employeeDetails) {
        InsuranceDetails insuranceDetails = employeeDetails.getInsuranceDetails();
        if (insuranceDetails == null) {
            return 0.0;
        }

        return insuranceDetails.getCarinsurance() +
                insuranceDetails.getHouseInsurance();
    }
    
}
