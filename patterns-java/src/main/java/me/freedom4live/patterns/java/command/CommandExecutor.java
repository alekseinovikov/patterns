package me.freedom4live.patterns.java.command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {

    private final List<Command> commandHistory = new ArrayList<>();


    void execute(Command command) {
        command.execute();
        commandHistory.add(command);
    }

}
