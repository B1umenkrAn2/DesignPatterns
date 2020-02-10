package command.c2;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("this is no onCommand");
    }

    @Override
    public void undo() {
        System.out.println("this is no OffCommand");
    }
}
