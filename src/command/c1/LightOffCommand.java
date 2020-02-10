package command.c1;

public class LightOffCommand implements Command {

    // aggregation LightReceiver
    LightReceiver lightReceiver;


    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}


