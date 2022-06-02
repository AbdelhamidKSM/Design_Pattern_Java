package Factory;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    private static final int NUMBER_OF_CHOICE = 10;
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < NUMBER_OF_CHOICE; i++) {
            Enemy enemy = EnemyFactory.createEnemy(getRandom(1, 4));
            enemy.showUp();
        }

    }

    public static int getRandom(int min, int max) {
        return ThreadLocalRandom.current().nextInt(max - min) + min;
//        return random.nextInt((max-min)+1) +min;
    }
}
