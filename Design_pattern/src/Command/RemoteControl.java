package Command;

public class RemoteControl {
    private ICommand[] onCommands;
    private ICommand[] offCommands;

    public RemoteControl() {
        onCommands = new ICommand[2];
        offCommands = new ICommand[2];
    }
    public void addCommand (int slot , ICommand  onCommand , ICommand offCommand){
    this.onCommands[slot]=onCommand;
    this.offCommands[slot]=offCommand;
    }
    public void onCommandPress (int slot ){
        onCommands[slot].execute();
    }
    public void offCommandPress (int slot ){
        offCommands[slot].execute();
    }
}
