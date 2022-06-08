package Solid.Dependency_Inversion;

public class AirCond implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("AC is turning On ");
    }

    @Override
    public void turnOff() {
        System.out.println("AC  is turning Off  ");
    }
}
