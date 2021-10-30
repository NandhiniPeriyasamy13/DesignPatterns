package com.design.patterns.behaviour.ChainOfReponsibility;

public class Leave {

    private String empName;
    private int noOfLeaveDays;

    public Leave(String empName, int noOfLeaveDays) {
        this.empName = empName;
        this.noOfLeaveDays = noOfLeaveDays;
    }


    public String getEmpName() {
        return empName;
    }

    public int getNoOfLeaveDays() {
        return noOfLeaveDays;
    }
}
