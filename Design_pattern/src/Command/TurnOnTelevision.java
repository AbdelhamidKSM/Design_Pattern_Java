package Command;

public class TurnOnTelevision implements ICommand {
    private Television tv;

    public TurnOnTelevision(Television tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }
}
