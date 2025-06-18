package com.application.employeesalary;

public class EmpDesignationType {
    private String jobtype;

    public String getJobtype () {
        return jobtype;
    }

    @Override
    public String toString () {
        return "EmpDesignationType{" +
                "jobtype='" + jobtype + '\'' +
                '}';
    }

    public void setJobtype (String jobtype) {
        this.jobtype = jobtype;
    }

    public boolean returnJobType(String jobtype){
        if(jobtype=="private"){
            return true;
        }else if(jobtype=="government"){
            return false;
        }else{
            return false;
        }
    }
}
