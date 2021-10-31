package com.design.patterns.behaviour.command.switchCommand;

public class Client {

    public static void main(String[] args){
        ISwitch lightSwitch = new Light();

        ICommand openSwitchCommand = new OpenSwitchCommand(lightSwitch);
        ICommand closeSwitchCommand = new CloseSwitchCommand(lightSwitch);

        CommandExecutor commandExecutor = new CommandExecutor(openSwitchCommand, closeSwitchCommand);
        commandExecutor.open();
        commandExecutor.close();
        commandExecutor.close();


        ISwitch tvSwitch = new Tv();
        openSwitchCommand = new OpenSwitchCommand(tvSwitch);
        closeSwitchCommand = new CloseSwitchCommand(tvSwitch);

        commandExecutor = new CommandExecutor(openSwitchCommand, closeSwitchCommand);

        commandExecutor.open();
        commandExecutor.close();

    }





}
