package Adapter;

public class Lion implements WildAnimal {
    @Override
    public void eat() {
        System.out.println("eating meat");
    }

    @Override
    public void run() {
        System.out.println("running ~~~~");
    }
}
