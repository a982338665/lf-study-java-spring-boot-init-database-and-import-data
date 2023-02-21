package pers.li.magictest.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
/**
 * 第1步，实现springboot默认的监听接口，该方法在spring容器加载完自动监听
 * spring boot 容器加载后自动监听
 * @author lijunming
 * @date 2018/7/22 下午2:30
 * 对于这两个接口而言，我们可以通过Order注解或者使用Ordered接口来指定调用顺序，
 * @Order()中的值越小，优先级越高
 */
@Component
@Order(1)
public class MyCommandRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
         System.out.println("开始启动1个页面");
        try {
            Runtime.getRuntime().exec("cmd   /c   start   http://localhost:8080/index");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
