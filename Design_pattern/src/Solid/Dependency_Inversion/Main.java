package Solid.Dependency_Inversion;

public class Main {
    public static void main(String[] args) {
        Switchable airCond = new AirCond();
        Switchable tv = new Tv();
        Switchable lightBulb = new LightBulb();

        PowerSwitch powerSwitchForAC = new PowerSwitch(airCond,false);
        powerSwitchForAC.press();
        PowerSwitch powerSwitchForTv = new PowerSwitch(tv,true);
        powerSwitchForTv.press();
        PowerSwitch powerSwitchForBulb = new PowerSwitch(lightBulb,true);
        powerSwitchForBulb.press();
    }
}
