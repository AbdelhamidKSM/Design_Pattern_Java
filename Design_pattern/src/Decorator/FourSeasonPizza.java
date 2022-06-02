package Decorator;

public class FourSeasonPizza extends PizzaDecorator{
    public FourSeasonPizza(IPizza iPizza) {
        super(iPizza);
    }

    @Override
    public double getCost() {
        return super.getCost()+20;
    }

    @Override
    public String getName() {
        return super.getName()+ " Four season ";
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" With Different Ingredient of the Year ";
    }
}
