package Command;

public class Executor {
   final  static int  TV_Slot = 0;

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Television tv = new Television();
        TurnOffTelevision turnOffTelevision = new TurnOffTelevision(tv);
        TurnOnTelevision turnOnTelevision = new TurnOnTelevision(tv);

        remoteControl.addCommand(TV_Slot, turnOnTelevision, turnOffTelevision);
        remoteControl.onCommandPress(TV_Slot);
        remoteControl.offCommandPress(TV_Slot);


    }
}
