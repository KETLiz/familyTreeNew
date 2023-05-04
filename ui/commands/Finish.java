package ui.commands;

import ui.Console;

public class Finish implements Command {
    Console console;

    @Override
    public String getDescription() {
        return "Выход";
    }

    @Override
    public void execute() {
        console.exit();
    }
    
}
