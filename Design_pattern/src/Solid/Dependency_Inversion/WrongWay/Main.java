package Solid.Dependency_Inversion.WrongWay;

public class Main {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        lightBulb.turnOff();
        ElectricPowerSwitch powerSwitch = new ElectricPowerSwitch(lightBulb,false);
        powerSwitch.press();

       new AirCond();
        /**
         * Here is the problem we should change within the class to work with AC */
        //    ElectricPowerSwitch powerSwitch1 = new ElectricPowerSwitch(airCond,true)
    }
}
