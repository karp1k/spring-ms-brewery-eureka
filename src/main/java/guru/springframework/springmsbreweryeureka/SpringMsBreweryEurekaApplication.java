package guru.springframework.springmsbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringMsBreweryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMsBreweryEurekaApplication.class, args);
    }

}
