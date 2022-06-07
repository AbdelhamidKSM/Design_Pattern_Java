package Template;

public class Car  extends VehicleTemplate{
    @Override
    protected void installGearBox() {
        System.out.println("installing  5 gearbox ");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("adding mirrors , window , join the parts in car body");
    }
}
