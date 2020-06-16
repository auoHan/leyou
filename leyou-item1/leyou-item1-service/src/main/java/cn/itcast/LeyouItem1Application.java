package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LeyouItem1Application {
    public static void main(String[] args) {
        SpringApplication.run(LeyouItem1Application.class);
    }
}
