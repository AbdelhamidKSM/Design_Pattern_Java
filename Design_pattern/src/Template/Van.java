package Template;

public class Van extends VehicleTemplate{
    @Override
    protected void installGearBox() {
        System.out.println("installing 8 gearbox ");
    }

    @Override
    protected void assembleComponents() {
        System.out.println("adding extra van container");
    }
}
