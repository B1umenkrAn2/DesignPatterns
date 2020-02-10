package command.c2;

public class LightOnCommand implements Command {

    // aggregation LightReceiver
    LightReceiver lightReceiver;

    
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
