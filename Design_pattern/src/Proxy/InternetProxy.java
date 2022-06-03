package Proxy;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetServiceProvider {
    private Inwi inwi = new Inwi();
    List<String> blockedWebSite = Arrays.asList("FaceBook", "RedIt", "TikTok");

    @Override
    public String serveSite(String url) {
        logInstance(url);
        for (String site : blockedWebSite) {
            if (url.contains(site)) {
                return "This Web Site js Blocked !";
            }
        }
        return inwi.serveSite(url);
    }

    private void logInstance(String url) {
        System.out.printf("[%d] -> %s requested  \n", System.currentTimeMillis(), url);
    }
}
