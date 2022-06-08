package State;

public class Executor {
    public static void main(String[] args) {
        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();
        mobileContext.setState(new Silent());
        mobileContext.alert();
    }
}
