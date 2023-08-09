package pers.li;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import pers.li.config.listener.TestProfile;
import pers.li.config.listener.TestProfile2;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Component
public class Main {

    @Autowired
    TestProfile testProfile;
    @Autowired
    TestProfile2 testProfile2;
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Main.class);
        springApplication.run(args);
    }

    @PostConstruct
    public void init() {
        System.err.println(testProfile);
        System.err.println(testProfile2);
    }
}
