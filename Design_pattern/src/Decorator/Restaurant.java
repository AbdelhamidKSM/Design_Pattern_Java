package Decorator;

public class Restaurant {
    public static void main(String[] args) {

        IPizza myPizza = new FourSeasonPizza(new GreekPizza(new BasicPizza()));
        String name =String.format("Full name : %s",myPizza.getName());
        String description =String.format("Description : %s",myPizza.getDescription());
        String cost =String.format("Cost : %s",myPizza.getCost());
        System.out.println(name);
        System.out.println(description);
        System.out.println(cost);

    }
}
