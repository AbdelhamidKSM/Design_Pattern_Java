package Solid.OpenClosed;

import Solid.SRP.Shape;

import java.util.Random;

public class Circle implements Shape {
    public Circle() {
    }

    @Override
    public double area() {

        /*has a specific logic ...*/
        return new Random().nextInt();
    }
}
