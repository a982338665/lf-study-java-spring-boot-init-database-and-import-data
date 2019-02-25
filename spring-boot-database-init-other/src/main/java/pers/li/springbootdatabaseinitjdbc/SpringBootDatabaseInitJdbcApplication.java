package pers.li.springbootdatabaseinitjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pers.li.springbootdatabaseinitjdbc.listener.ApplicationStartup;

/**
 * 给springboot的启动类添加监听任务
 */
@SpringBootApplication
public class SpringBootDatabaseInitJdbcApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(SpringBootDatabaseInitJdbcApplication .class);
		springApplication.addListeners(new ApplicationStartup());
		springApplication.run(args);
	}

}
