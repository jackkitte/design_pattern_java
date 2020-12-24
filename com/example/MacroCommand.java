package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MacroCommand implements Command {
    private List<Command> commandList = new ArrayList<>();

    @Override
    public void execute() throws Exception {
        Iterator<Command> it = commandList.iterator();

        while (it.hasNext()) {
            Command command = it.next();
            command.execute();
        }
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }
}
