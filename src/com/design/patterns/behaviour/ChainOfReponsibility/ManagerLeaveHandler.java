package com.design.patterns.behaviour.ChainOfReponsibility;

public class ManagerLeaveHandler implements LeaveHandler{
    LeaveHandler nextLeaveHandler;

    @Override
    public void setNextHandler(LeaveHandler nextHandler) {
        this.nextLeaveHandler = nextHandler;
    }

    @Override
    public String approveLeave(Leave leave) {
        if(leave.getNoOfLeaveDays() <= 5){
            return "Leave is approved by:: Manager for employee::"+leave.getEmpName()+ " for :: " + leave.getNoOfLeaveDays();
        }else{
            return nextLeaveHandler.approveLeave(leave);
        }
    }
}
