package Adapter;

public class BirdAdapter implements WildAnimal{
    private  Bird  bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void eat() {
        this.bird.eat();
    }

    @Override
    public void run() {
    this.bird.fly();
    }
}
