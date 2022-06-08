package Solid.SRP;

public class Main {
    public static void main(String[] args) {
    AreaCalculator areaCalculator = new AreaCalculator();
    /**
     * it's not a good practice cause it violated the SRP:
     * areaCalculator.json()
     * areaCalculator.csv()
     * the solution is next
     * */

    Printer printer = new Printer();
        System.out.println(printer.json(areaCalculator.sum()));
        System.out.println(printer.csv(areaCalculator.sum()));
    }
}
