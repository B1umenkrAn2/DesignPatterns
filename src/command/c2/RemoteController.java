package command.c2;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];


        // initial command
        for (int i = 0; i < 5; i++) {

            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();

        }
    }

    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void recordLastOnCommand(int no) {
        onCommands[no].execute(); // record the last command for undo using
        undoCommand = onCommands[no];
    }

    public void recordLastOffCommand(int no) {
        offCommands[no].execute(); // record the last command for undo using
        undoCommand = offCommands[no];
    }

    public void undoLastCommand() {
        undoCommand.undo();

    }
}
