package Solid.Dependency_Inversion;

public class Tv implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("TV is turning On  ");
    }

    @Override
    public void turnOff() {
        System.out.println("TV  is turning off ");
    }
}
