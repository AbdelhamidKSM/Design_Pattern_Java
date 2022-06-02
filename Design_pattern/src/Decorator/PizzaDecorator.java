package Decorator;

public class PizzaDecorator implements IPizza {
    private IPizza iPizza;

    public PizzaDecorator(IPizza iPizza) {
        this.iPizza = iPizza;
    }

    @Override
    public String getName() {
       return this.iPizza.getName();
    }

    @Override
    public double getCost() {
        return this.iPizza.getCost();
    }

    @Override
    public String getDescription() {
        return this.iPizza.getDescription();
    }
}
