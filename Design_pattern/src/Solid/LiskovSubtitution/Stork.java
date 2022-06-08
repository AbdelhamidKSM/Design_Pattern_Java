package Solid.LiskovSubtitution;

public class Stork implements FlyBird{
    @Override
    public void eat() {
        System.out.println("Stork is eating !");
    }

    @Override
    public void fly() {
        System.out.println("Stork is flying !!");
    }

}
