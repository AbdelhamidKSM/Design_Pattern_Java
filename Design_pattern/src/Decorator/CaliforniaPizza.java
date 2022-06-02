package Decorator;

public class CaliforniaPizza extends PizzaDecorator {
    public CaliforniaPizza(IPizza iPizza) {
        super(iPizza);
    }

    @Override
    public String getName() {
        return super.getName()+" California Pizza ";
    }

    @Override
    public double getCost() {
        return super.getCost() +25;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" With California'sauce and hot paper ";
    }
}
