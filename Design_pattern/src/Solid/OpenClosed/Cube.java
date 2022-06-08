package Solid.OpenClosed;

import Solid.SRP.Shape;

import java.util.Random;

public class Cube implements Shape {
    @Override
    public double area() {
        return new Random().nextInt();
    }
}
