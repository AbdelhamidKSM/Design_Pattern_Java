package Command;

public class TurnOffTelevision implements ICommand{
    private Television tv;

    public TurnOffTelevision(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }
}
