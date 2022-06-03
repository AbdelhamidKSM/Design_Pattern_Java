package Proxy;

public class Inwi implements  InternetServiceProvider{
    private int browsingSpeed = 100;
    @Override
    public String serveSite(String url) {
        return String.format("https//%s.com",url);
    }

    public int getBrowsingSpeed() {
        return browsingSpeed;
    }
}
