package Solid.Dependency_Inversion;

public class PowerSwitch {
    private Switchable switchable;
    private boolean on;

    public PowerSwitch(Switchable  switchable, boolean on) {
        this.switchable = switchable;
        this.on = on;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        if (!isOn()) {
            this.switchable.turnOn();
            this.on = true;
        } else
            this.switchable.turnOff();
        this.on = false;
    }
}
