package com.design.patterns.behaviour.ChainOfReponsibility;

public class HRLeaveHandler implements LeaveHandler{
    LeaveHandler nextLeaveHandler;
    @Override
    public void setNextHandler(LeaveHandler nextHandler) {
        this.nextLeaveHandler = nextHandler;
    }

    @Override
    public String approveLeave(Leave leave) {
        return "Leave is approved by:: HR for employee:: "+leave.getEmpName()+ " for :: " + leave.getNoOfLeaveDays();
    }
}
