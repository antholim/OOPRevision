package command;

import java.util.List;

public class RemoteControl {
    private Command command;
    private List<Command> commands;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressButtons() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
