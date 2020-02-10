package command.c1;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        remoteController.recordLastOnCommand(0);
        remoteController.recordLastOffCommand(0);
        remoteController.undoLastCommand();
    }
}
