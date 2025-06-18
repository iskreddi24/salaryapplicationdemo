package com.application.employeesalary;

public class EmpDesignation {
    private EmpDesignationType empDesignationType;
    private String fulltimeOrParttime;

    public EmpDesignationType getEmpDesignationType () {
        return empDesignationType;
    }

    public void setEmpDesignationType (EmpDesignationType empDesignationType) {
        this.empDesignationType = empDesignationType;
    }

    public String getFulltimeOrParttime () {
        return fulltimeOrParttime;
    }

    public void setFulltimeOrParttime (String fulltimeOrParttime) {
        this.fulltimeOrParttime = fulltimeOrParttime;
    }

    @Override
    public String toString () {
        return "EmpDesignation{" +
                "empDesignationType=" + empDesignationType +
                ", fulltimeOrParttime='" + fulltimeOrParttime + '\'' +
                '}';
    }
}
