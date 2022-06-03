package Proxy;

import java.util.Arrays;
import java.util.List;

public class ExecutorProxy {
    public static void main(String[] args) {
        List<String> sites = Arrays.asList("twitter", "Youtube", "Facebook", "RedIt");
        InternetServiceProvider internetServiceProvider = new InternetProxy();
        for (String site : sites) {
            System.out.println(internetServiceProvider.serveSite(site));
        }
    }
}
