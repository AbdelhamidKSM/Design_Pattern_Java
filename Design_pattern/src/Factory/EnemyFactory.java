package Factory;

public class EnemyFactory {
    public static final int ENEMY_TURTLE = 1;
    public static final int ENEMY_BIRD = 2;
    public static final int ENEMY_SNACK = 3;

    public static Enemy createEnemy(int id) {
        switch (id) {
            case ENEMY_BIRD:
                return new Bird("Bird", 20);
            case ENEMY_TURTLE:
                return new Turtle("Turtle", 10);
            case ENEMY_SNACK:
                return new Snack("Snack", 50);
            default: return null;
        }
    }
}
