package com.design.patterns.behaviour.ChainOfReponsibility;

public interface LeaveHandler {

    void setNextHandler(LeaveHandler nextHandler);
    String approveLeave(Leave leave);
}
