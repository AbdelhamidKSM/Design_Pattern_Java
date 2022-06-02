package Decorator;

public class BasicPizza implements IPizza {
    private static final int COST = 10;
    private static final String DESCRIPTION = " Normal Pizza";
    private String name;
    private int price;

    public BasicPizza() {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
