package Decorator;

public class GreekPizza  extends PizzaDecorator{
    public GreekPizza(IPizza iPizza) {
        super(iPizza);
    }

    @Override
    public double getCost() {
        return super.getCost()+30;
    }

    @Override
    public String getName() {
        return super.getName() + " Greek Pizza " ;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" With Greek Ingredients ";
    }
}
