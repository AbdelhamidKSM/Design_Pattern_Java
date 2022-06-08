package Solid.LiskovSubtitution;

import java.io.Flushable;

public class Main {
    public static void main(String[] args) {
        Bird   penguin  = new Penguin();
        penguin.eat();
/**
 * The Penguin class can not have  a subtype of the subtype of parenClass  Bird if Bird contains the whole without dividing it into 2 subclasses , */
        System.out.println("|||||||||||||||||||||||||||||||||");

        FlyBird stork = new Stork();
        stork.fly();
        stork.eat();

    }
}
