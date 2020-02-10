package command.c2;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();

        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        remoteController.recordLastOnCommand(0);
        remoteController.recordLastOffCommand(0);
        remoteController.undoLastCommand();

        remoteController.recordLastOnCommand(1);
        remoteController.recordLastOffCommand(1);
        remoteController.undoLastCommand();


        remoteController.recordLastOffCommand(3);


    }
}
