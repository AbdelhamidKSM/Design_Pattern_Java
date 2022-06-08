package Solid.Dependency_Inversion.WrongWay;

public class ElectricPowerSwitch {
    private LightBulb lightBulb;
    private boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb, boolean on) {
        this.lightBulb = lightBulb;
        this.on = on;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        if (!isOn()) {
            this.lightBulb.turnOn();
            this.on = true;
        } else
            this.lightBulb.turnOff();
           this.on = false;
    }

}
