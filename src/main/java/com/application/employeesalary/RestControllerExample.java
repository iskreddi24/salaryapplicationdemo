package com.application.employeesalary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    
}
