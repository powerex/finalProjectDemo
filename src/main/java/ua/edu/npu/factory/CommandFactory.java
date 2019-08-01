package ua.edu.npu.factory;

import ua.edu.npu.command.Command;
import ua.edu.npu.command.GenerateStudentsReportCommand;
import ua.edu.npu.command.HomeCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static final Map<String, Command> commandMap;

    static {
        commandMap = new HashMap<>();
        commandMap.put("studentReport", new GenerateStudentsReportCommand());
        commandMap.put("", new HomeCommand());
    }

    public static Command getCommand(String action) {
        return commandMap.getOrDefault(action, new HomeCommand());
    }

}
