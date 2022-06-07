package Template;

public class Executor {
    public static void main(String[] args) {
        VehicleTemplate car = new Car();
        car.buildVehicle();
        System.out.println("****************************************");
        VehicleTemplate van = new Van();
        van.buildVehicle();
    }
}
