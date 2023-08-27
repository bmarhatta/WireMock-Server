package bishwo.wiremock.template;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.wiremock.WireMockSpring;

@SpringBootApplication
public class MainClass {
    public static void main(String[] args) {
        final WireMockConfiguration wc = WireMockSpring.options();
        wc.usingFilesUnderClasspath(".");
        final WireMockServer server = new WireMockServer(wc);
        server.start();
    }
}
