package pers.li;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import pers.li.config.TestConfig;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Component
public class Main {

    @Autowired
    private TestConfig testConfig;

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Main.class);
        springApplication.run(args);
    }

    @PostConstruct
    public void init() {
        System.err.println(testConfig);
    }
}
