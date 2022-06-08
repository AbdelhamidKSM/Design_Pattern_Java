package Solid.SRP;

public class Printer {
    public String json(int sum) {
        return String.format("{Sum :%s}", sum);
    }

    public String csv(int sum) {
        return String.format("Sum,%s", sum);
    }
}
