package com.design.patterns.behaviour.ChainOfReponsibility;

public class Client {

    public static void main(String[] args){
        LeaveHandler teamLeadLeaveHandler = new TeamLeadLeaveHandler();
        LeaveHandler managerLeaveHandler = new ManagerLeaveHandler();
        LeaveHandler hrLeaveHandler = new HRLeaveHandler();

        teamLeadLeaveHandler.setNextHandler(managerLeaveHandler);
        managerLeaveHandler.setNextHandler(hrLeaveHandler);

        Leave leave = new Leave("Ryan", 10);
        System.out.println(teamLeadLeaveHandler.approveLeave(leave));

        leave = new Leave("Ryan", 5);
        System.out.println(teamLeadLeaveHandler.approveLeave(leave));

        leave = new Leave("Ryan", 1);
        System.out.println(teamLeadLeaveHandler.approveLeave(leave));
    }
}
