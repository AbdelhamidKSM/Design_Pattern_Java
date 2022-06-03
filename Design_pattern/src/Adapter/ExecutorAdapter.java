package Adapter;

public class ExecutorAdapter {
    public static void main(String[] args) {
//      normal state
        WildAnimal lion = new Lion();
        useWildAnimal(lion);
//      using adapter for shark
        WildAnimal shark = new SharkAdapter(new Shark());
        useWildAnimal(shark);
//      using adapter for bird
        WildAnimal bird = new BirdAdapter(new Bird());
        useWildAnimal(bird);
    }

    private static void useWildAnimal(WildAnimal animal) {
        animal.eat();
        animal.run();
        System.out.println("************************");
    }
}
