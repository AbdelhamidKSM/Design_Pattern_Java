package Solid.Dependency_Inversion;

public class LightBulb implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Bulb is turning on 💡");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb is turning off 📴");
    }
}
