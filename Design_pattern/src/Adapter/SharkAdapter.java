package Adapter;

public class SharkAdapter implements WildAnimal{

    private Shark shark;

    public SharkAdapter(Shark shark) {
        this.shark = shark;
    }

    @Override
    public void eat() {
    this.shark.eat();
    }

    @Override
    public void run() {
    this.shark.swim();
    }
}
