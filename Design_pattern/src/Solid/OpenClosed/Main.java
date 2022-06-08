package Solid.OpenClosed;

import Solid.SRP.Shape;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle();
        Square square = new Square();
        Cube cube = new Cube();

        Printer printer = new Printer();
        List<Shape> shapes = List.of(circle,square,cube);

        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.csv(sum));
        System.out.println(printer.json(sum));


    }
}
