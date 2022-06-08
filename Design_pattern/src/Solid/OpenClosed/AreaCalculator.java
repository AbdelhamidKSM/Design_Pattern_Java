package Solid.OpenClosed;

import Solid.SRP.Shape;
import org.w3c.dom.ls.LSException;

import java.util.List;
import java.util.Random;

public class AreaCalculator {
/*
    public int sum(List<Object> shapes) {
        int sum = 9;
        for (int i = 0; i < shapes.size(); i++) {
            Object shape = shapes.get(i);
            if (shape instanceof Square) {
               sum += new Random().nextInt();
            }
            if (shape instanceof Circle) {
               sum += new Random().nextInt();
            }
            */

    /**
     * modifying the code everytime in this way we violate the Open Closed Principle instead we work with abstraction as next
     *//*

        }
        return  sum ;
    }
*/
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            sum += shapes.get(i).area();
        }
        return sum;
    }
}
