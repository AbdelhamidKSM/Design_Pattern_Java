package Solid.OpenClosed;

import Solid.SRP.Shape;

import java.util.Random;

public class Square implements Shape {
    public Square() {
    }

    @Override
    public double area() {
        /*has a specific logic ...*/
        return new Random().nextInt();
    }
}
