package pers.li.springbootdatabaseinitapplicationrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootDatabaseInitApplicationrunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatabaseInitApplicationrunnerApplication.class, args);
	}

	/**
	 * 加上@PostConstruct注解来制定该方法在初始化之后调用
	 */
	@PostConstruct
	public void init() {
		System.out.println("init...");
	}
}
