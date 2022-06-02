package Factory;

public abstract class Enemy {
    private String name;
    private int damage;

    public Enemy(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void showUp() {
        System.out.println(String.format("%s is showing Up . Damage is %d ", name, damage));
    }
}
